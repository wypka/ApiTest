package edu.iot.ex.sensor.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import edu.iot.ex.sensor.vo.Sensor;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
@Service
public class SensorServiceImpl implements SensorService {

	static List<Sensor> testList = new ArrayList();
	static{
		testList.add(new Sensor("¹è°íÆÄ","23","23.4",new Date(),true,null));
		testList.add(new Sensor("Á¹·Á","23","24.4",new Date(),true,null));
		testList.add(new Sensor("ÀÚ°í½Í´Ù","23","26.4",new Date(),true,null));
		testList.add(new Sensor("µ·Àº","23","27.4",new Date(),true,null));
		testList.add(new Sensor("¾ðÁ¦µé¾î¿Í","23","28.4",new Date(),true,null));
		testList.add(new Sensor("Èå¾û","23","29.4",new Date(),true,null));
	}
	
	@Override
	public List<Sensor> getList() {
		System.out.println("GET : List");
		return testList;
	}

	@Override
	public boolean insert(Sensor sensor) {
		System.out.println("INSERT : sensor");		
		return true;
	}

	@Override
	public boolean update(Sensor sensor) {
		System.out.println("UPDATE : sensor");		
		return true;
	}

	@Override
	public boolean delete(Sensor sensor) {
		System.out.println("DELETE : sensor");		
		return true;
	}

	@Override
	public Sensor get(long id) {
		System.out.println("GET : memberId");		
		return new Sensor("Èå¾û","23","29.4",new Date(),true,null);
	}

	@Override
	public byte[] upload(MultipartFile file) {		
		System.out.println("POST : upload");								
		File uploadFile  = new File("D:/images"+file.getOriginalFilename()+".jpg");
		int fileSize = (int) file.getSize();
		byte[] readBytes = new byte[fileSize];
		int readByteNo;
		try(FileInputStream fis = (FileInputStream) file.getInputStream();
				FileOutputStream fos = new FileOutputStream(uploadFile.getPath())){
			file.transferTo(uploadFile);			
			while((readByteNo = fis.read(readBytes)) != -1){
				System.out.println(readBytes);
				fos.write(readBytes,0,readByteNo);
				fos.flush();
			}
			
		}  catch (IOException e) {
			System.err.println(e.getMessage());
		} 
		return readBytes;
	}



}

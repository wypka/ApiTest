package edu.iot.ex.sensor.service;

import java.io.File;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import edu.iot.ex.sensor.vo.Sensor;
import okhttp3.ResponseBody;

public interface SensorService {
	List<Sensor> getList();
	boolean insert(Sensor sensor);
	boolean update(Sensor sensor);
	boolean delete(Sensor sensor);
	Sensor get(long id);
	byte[] upload(MultipartFile file);


	
}

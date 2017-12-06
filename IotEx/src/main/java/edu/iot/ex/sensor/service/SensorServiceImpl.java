package edu.iot.ex.sensor.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.iot.ex.sensor.vo.Sensor;
@Service
public class SensorServiceImpl implements SensorService {

	static List<Sensor> testList = new ArrayList();
	static{
		testList.add(new Sensor("�����","23","23.4",new Date(),true,null));
		testList.add(new Sensor("����","23","24.4",new Date(),true,null));
		testList.add(new Sensor("�ڰ�ʹ�","23","26.4",new Date(),true,null));
		testList.add(new Sensor("����","23","27.4",new Date(),true,null));
		testList.add(new Sensor("��������","23","28.4",new Date(),true,null));
		testList.add(new Sensor("����","23","29.4",new Date(),true,null));
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
		return new Sensor("����","23","29.4",new Date(),true,null);
	}

}

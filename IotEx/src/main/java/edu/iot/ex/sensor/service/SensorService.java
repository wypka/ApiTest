package edu.iot.ex.sensor.service;

import java.util.List;

import edu.iot.ex.sensor.vo.Sensor;

public interface SensorService {
	List<Sensor> getList();
	boolean insert(Sensor sensor);
	boolean update(Sensor sensor);
	boolean delete(Sensor sensor);
	Sensor get(long id);
	
}

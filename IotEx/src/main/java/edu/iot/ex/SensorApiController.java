package edu.iot.ex;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.iot.ex.sensor.service.SensorService;
import edu.iot.ex.sensor.vo.Sensor;
import okhttp3.ResponseBody;
import retrofit2.http.Multipart;
import retrofit2.http.Part;

@RestController
@RequestMapping("/api/sensor")
public class SensorApiController {
	@Autowired SensorService service;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public List<Sensor> getList(){
		return service.getList();
	}
	@RequestMapping(value="/{id}" , method=RequestMethod.GET)
	public Sensor get(@PathVariable long id){
		return service.get(id);
	}
	@RequestMapping(value="/" , method=RequestMethod.POST)
	public boolean insert(Sensor sensor){
		return service.insert(sensor);
	}
	@RequestMapping(value="/" , method=RequestMethod.PUT)
	public boolean update(Sensor sensor){
		return service.update(sensor);
	}
	@RequestMapping(value="/{id}" , method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Sensor sensor){
		return service.delete(sensor);
	}

	@RequestMapping(value="/upload" , method=RequestMethod.POST)
	public byte[] uploadImage(@RequestParam("camFile") MultipartFile file ){
		return service.upload(file);
	}
}


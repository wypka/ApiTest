package edu.iot.ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import edu.iot.ex.sensor.vo.Sensor;
//수신테스트 ?
public class RestApiTest {
	public static void main(String[] args) {
		String urlPath = "http://localhost:8888/ex/api/sensor/";
		try {
			URL iot = new URL(urlPath);
			HttpURLConnection con = (HttpURLConnection)iot.openConnection();
			con.setRequestProperty("Accept", "application/json");
			con.setRequestMethod("GET");
			if(con.getResponseCode() == 200){
				try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));){
					Gson gson = new Gson();
					List<Sensor> list = Arrays.asList(gson.fromJson(br, Sensor[].class));
					for(Sensor s : list){
						System.out.println(s);
						con.disconnect();
					}
				}
			}else{
				System.err.println(con.getResponseCode());
			}
		} catch (Exception e) {			
			System.err.println(e);
		}
		
	}
	//divertryMethod 
	/*myConnection.setRequestMethod myConnection.setRequestMethod myConnection.setRequestMethod("POST ");
	// Create the data // Create the data
	String myData = "message=Hello"; = "message=Hello";
	// Enable writing // Enable writing
	myConnection.setDoOutput myConnection.setDoOutput (true); (true);(true);
	// Write the data // Write the data
	myConnection.getOutputStream myConnection.getOutputStream ().write( myData.getBytes myData.getBytes myData.getBytesmyData.getBytes myData.getBytes myData.getBytes myData.getBytes myData.getBytes ());*/
}

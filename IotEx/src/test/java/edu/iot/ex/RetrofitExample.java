package edu.iot.ex;

//RetroApi 호출
import java.io.IOException;
import java.util.Date;
import java.util.List;

import edu.ex.sensor.api.SensorApi;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


//테스트하기 위한 모듈
//수신
public class RetrofitExample {
	

	public static void upload()throws IOException{
		SensorApi api = SensorApi.retrofit.create(SensorApi.class);

	    Call<String> call = api.upload(null, null); 
		String result = call.execute().body();
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		upload();
	}
}

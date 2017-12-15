package edu.ex.sensor.api;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
//Api규격 설정
public interface SensorApi {
	@Multipart
    @POST("sensor/")
    Call<String> upload(
            @Part("picture") RequestBody picture,
            @Part MultipartBody.Part file);
		
    

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://70.12.112.146:8888/iot/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

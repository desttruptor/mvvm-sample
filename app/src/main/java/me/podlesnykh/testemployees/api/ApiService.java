package me.podlesnykh.testemployees.api;

import io.reactivex.Observable;
import me.podlesnykh.testemployees.pojo.EmployeeResponce;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("testTask.json")
    Observable<EmployeeResponce> getEmployees();
}

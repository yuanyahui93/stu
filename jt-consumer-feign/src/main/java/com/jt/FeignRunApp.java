package com.jt;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication  //feign不能使用boot必须使用cloud
@EnableFeignClients 			//开启Feign
public class FeignRunApp {
	public static void main(String[] args) {
        SpringApplication.run(FeignRunApp.class, args);
    }
}

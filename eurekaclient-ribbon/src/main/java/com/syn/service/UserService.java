package com.syn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 石亚宁
 * @version 1.0.0.1
 * @description:
 * @date 2019年05月17日 21:24:21.
 */
@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "hi!"+name +",something error";
    }
}

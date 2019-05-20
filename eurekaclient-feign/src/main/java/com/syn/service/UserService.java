package com.syn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 石亚宁
 * @version 1.0.0.1
 * @description:
 * @date 2019年05月17日 21:24:21.
 */
@FeignClient("service-hi")
public interface UserService {
  @RequestMapping(value = "hi",method = RequestMethod.GET)
    String hello(@RequestParam(value="name") String name);

}

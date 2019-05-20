package com.syn;

import com.syn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石亚宁
 * @version 1.0.0.1
 * @description:
 * @date 2019年05月17日 21:27:17.
 */
@RestController
public class Controller {
    @Autowired
    private UserService userService;
    @RequestMapping("hi")
    public String hi(String name){
        return userService.hello(name);
    }
}

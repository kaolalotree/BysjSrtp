package com.srtp.controller;

import com.srtp.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by chenxin on 15/11/25.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/sayTest")
    public String toIndex() {

            return "login";
    }
}

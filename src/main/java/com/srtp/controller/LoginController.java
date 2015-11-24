package com.srtp.controller;

import com.alibaba.fastjson.JSON;

import com.srtp.model.TestResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by chenxin on 15/11/25.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(method = RequestMethod.POST)
    public void verify(HttpServletRequest request,HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        String account = request.getParameter("account");
        String password = request.getParameter("pwd");

        response.addHeader("Cache-Control", "no-cache");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        TestResult testResult=new TestResult();
        testResult.setStatus(false);
        testResult.setMessage(account);
        out.print(JSON.toJSONString(testResult));

    }
}

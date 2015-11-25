package com.srtp.serviceImple;

import com.srtp.mapper.PeopleMapper;
import com.srtp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenxin on 15/11/25.
 */
@Service("testService")
public class TestServiceImple implements TestService {
    @Autowired
    private PeopleMapper peopleMapper;
    public String getComment(Integer id) {
        return "hello";
    }
}

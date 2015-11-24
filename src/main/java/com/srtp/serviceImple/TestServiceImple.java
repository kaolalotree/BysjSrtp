package com.srtp.serviceImple;

import com.srtp.mapper.CommentMapper;
import com.srtp.model.Comment;
import com.srtp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenxin on 15/11/25.
 */
@Service("testService")
public class TestServiceImple implements TestService {
    @Autowired
    private CommentMapper commentMapper;
    public Comment getComment(Integer id) {
        return commentMapper.selectByPrimaryKey(1);
    }
}

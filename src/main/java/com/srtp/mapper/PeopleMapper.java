package com.srtp.mapper;

import com.srtp.model.People;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleMapper {
    int deleteByPrimaryKey(Long account);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Long account);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}
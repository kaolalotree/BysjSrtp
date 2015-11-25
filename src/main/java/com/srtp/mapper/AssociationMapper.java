package com.srtp.mapper;

import com.srtp.model.Association;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationMapper {
    int deleteByPrimaryKey(Long saccount);

    int insert(Association record);

    int insertSelective(Association record);

    Association selectByPrimaryKey(Long saccount);

    int updateByPrimaryKeySelective(Association record);

    int updateByPrimaryKey(Association record);
}
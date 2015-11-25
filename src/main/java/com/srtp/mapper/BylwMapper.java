package com.srtp.mapper;

import com.srtp.model.Bylw;
import com.srtp.model.BylwWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface BylwMapper {
    int deleteByPrimaryKey(Long saccount);

    int insert(BylwWithBLOBs record);

    int insertSelective(BylwWithBLOBs record);

    BylwWithBLOBs selectByPrimaryKey(Long saccount);

    int updateByPrimaryKeySelective(BylwWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BylwWithBLOBs record);

    int updateByPrimaryKey(Bylw record);
}
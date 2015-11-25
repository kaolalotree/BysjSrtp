package com.srtp.mapper;

import com.srtp.model.Final;
import com.srtp.model.FinalWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(FinalWithBLOBs record);

    int insertSelective(FinalWithBLOBs record);

    FinalWithBLOBs selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(FinalWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FinalWithBLOBs record);

    int updateByPrimaryKey(Final record);
}
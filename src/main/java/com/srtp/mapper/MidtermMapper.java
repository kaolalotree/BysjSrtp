package com.srtp.mapper;

import com.srtp.model.Midterm;
import com.srtp.model.MidtermWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface MidtermMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(MidtermWithBLOBs record);

    int insertSelective(MidtermWithBLOBs record);

    MidtermWithBLOBs selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(MidtermWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MidtermWithBLOBs record);

    int updateByPrimaryKey(Midterm record);
}
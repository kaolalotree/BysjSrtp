package com.srtp.mapper;

import com.srtp.model.Ktbg;
import com.srtp.model.KtbgWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface KtbgMapper {
    int deleteByPrimaryKey(Long saccount);

    int insert(KtbgWithBLOBs record);

    int insertSelective(KtbgWithBLOBs record);

    KtbgWithBLOBs selectByPrimaryKey(Long saccount);

    int updateByPrimaryKeySelective(KtbgWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(KtbgWithBLOBs record);

    int updateByPrimaryKey(Ktbg record);
}
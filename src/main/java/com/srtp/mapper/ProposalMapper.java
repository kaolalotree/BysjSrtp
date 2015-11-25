package com.srtp.mapper;

import com.srtp.model.Proposal;
import com.srtp.model.ProposalWithBLOBs;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(ProposalWithBLOBs record);

    int insertSelective(ProposalWithBLOBs record);

    ProposalWithBLOBs selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(ProposalWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProposalWithBLOBs record);

    int updateByPrimaryKey(Proposal record);
}
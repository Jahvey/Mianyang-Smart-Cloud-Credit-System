package com.cdgit.loan.user.mapper;

import com.cdgit.loan.user.bean.TbCsmParty;

public interface TbCsmPartyMapper {
    int deleteByPrimaryKey(String partyId);

    int insert(TbCsmParty record);

    int insertSelective(TbCsmParty record);

    TbCsmParty selectByPrimaryKey(String partyId);

    int updateByPrimaryKeySelective(TbCsmParty record);

    int updateByPrimaryKey(TbCsmParty record);
}
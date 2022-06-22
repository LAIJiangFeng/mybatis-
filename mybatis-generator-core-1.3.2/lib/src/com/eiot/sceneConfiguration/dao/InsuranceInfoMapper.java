package com.eiot.sceneConfiguration.dao;

import com.eiot.sceneConfiguration.model.InsuranceInfo;

public interface InsuranceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceInfo record);

    int insertSelective(InsuranceInfo record);

    InsuranceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InsuranceInfo record);

    int updateByPrimaryKey(InsuranceInfo record);
}
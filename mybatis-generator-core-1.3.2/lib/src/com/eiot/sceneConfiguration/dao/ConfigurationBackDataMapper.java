package com.eiot.sceneConfiguration.dao;

import com.eiot.sceneConfiguration.model.ConfigurationBackData;

public interface ConfigurationBackDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigurationBackData record);

    int insertSelective(ConfigurationBackData record);

    ConfigurationBackData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigurationBackData record);

    int updateByPrimaryKey(ConfigurationBackData record);
}
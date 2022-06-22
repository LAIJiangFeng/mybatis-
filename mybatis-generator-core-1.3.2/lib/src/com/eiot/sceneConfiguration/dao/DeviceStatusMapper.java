package com.eiot.sceneConfiguration.dao;

import com.eiot.device.model.DeviceStatus;

public interface DeviceStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceStatus record);

    int insertSelective(DeviceStatus record);

    DeviceStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceStatus record);

    int updateByPrimaryKey(DeviceStatus record);
}
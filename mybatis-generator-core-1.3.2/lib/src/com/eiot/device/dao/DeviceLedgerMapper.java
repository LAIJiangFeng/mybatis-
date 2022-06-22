package com.eiot.device.dao;

import com.eiot.device.model.DeviceLedger;

public interface DeviceLedgerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceLedger record);

    int insertSelective(DeviceLedger record);

    DeviceLedger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceLedger record);

    int updateByPrimaryKey(DeviceLedger record);
}
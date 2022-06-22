package com.eiot.sys.dao;

import com.eiot.sys.model.DataBackup;

public interface DataBackupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataBackup record);

    int insertSelective(DataBackup record);

    DataBackup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataBackup record);

    int updateByPrimaryKey(DataBackup record);
}
package com.wcl.dao;

import com.wcl.bean.Dog;

public interface DogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dog record);

    int insertSelective(Dog record);

    Dog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dog record);

    int updateByPrimaryKey(Dog record);
}
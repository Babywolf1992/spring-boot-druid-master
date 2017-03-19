package com.babywolf.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * Created by babywolf on 17/3/19.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{
}

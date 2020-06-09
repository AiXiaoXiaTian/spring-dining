package com.yan.diningcustomer.mapper;

import com.yan.diningcustomer.entity.CusUser;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CusUserMapper {
    @Select("SELECT * FROM cus_user WHERE account = #{account} AND password = #{password}")
    CusUser findByAccountAndPassword (@Param("account") String account,@Param("password") String password);
}
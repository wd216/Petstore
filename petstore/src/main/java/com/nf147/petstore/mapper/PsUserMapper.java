package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByUserName(String username);

    int insert(PsUser record);

    PsUser selectByPrimaryKey(Integer id);

    PsUser selectByName(String username);

    PsUser login(@Param("username") String username,@Param("password")String password);

    List<PsUser> selectAll();

    int updateByPrimaryKey(PsUser record);

    int updateByUserName(String username);
}
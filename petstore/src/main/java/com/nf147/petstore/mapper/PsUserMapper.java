package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsUser;
import java.util.List;

public interface PsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsUser record);

    PsUser selectByPrimaryKey(Integer id);

    List<PsUser> selectAll();

    int updateByPrimaryKey(PsUser record);
}
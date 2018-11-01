package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsCategory;
import java.util.List;

public interface PsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsCategory record);

    PsCategory selectByPrimaryKey(Integer id);

    List<PsCategory> selectAll();

    int updateByPrimaryKey(PsCategory record);
}
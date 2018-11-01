package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsPet;
import java.util.List;

public interface PsPetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsPet record);

    PsPet selectByPrimaryKey(Integer id);

    List<PsPet> selectByStatus(String string);

    List<PsPet> selectAll();

    int updateByPrimaryKey(PsPet record);
}
package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsPet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PsPetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsPet record);

    PsPet selectByPrimaryKey(Integer id);

    List<PsPet> selectByStatus(@Param("status") String status);

    List<PsPet> selectAll();

    int updateByPrimaryKey(PsPet record);
}
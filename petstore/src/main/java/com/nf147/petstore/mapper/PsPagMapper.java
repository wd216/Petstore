package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsPag;
import java.util.List;

public interface PsPagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsPag record);

    PsPag selectByPrimaryKey(Integer id);

    List<PsPag> selectAll();

    int updateByPrimaryKey(PsPag record);
}
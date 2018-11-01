package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsOrder;
import java.util.List;

public interface PsOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsOrder record);

    PsOrder selectByPrimaryKey(Integer id);

    List<PsOrder> selectAll();

    int updateByPrimaryKey(PsOrder record);
}
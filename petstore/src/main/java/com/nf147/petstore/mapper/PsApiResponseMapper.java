package com.nf147.petstore.mapper;

import com.nf147.petstore.entity.PsApiResponse;
import java.util.List;

public interface PsApiResponseMapper {
    int insert(PsApiResponse record);

    List<PsApiResponse> selectAll();
}
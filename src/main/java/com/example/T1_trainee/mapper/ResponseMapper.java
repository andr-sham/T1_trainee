package com.example.T1_trainee.mapper;

import com.example.T1_trainee.dto.ResponseDto;
import com.example.T1_trainee.entity.Response;
import org.mapstruct.Mapper;

/** Маппер для response */
@Mapper(componentModel = "spring")
public abstract class ResponseMapper {

  /**
   * Маппинг entity в dto
   *
   * @param entity entity для мапинга
   * @return смапленная dto
   */
  public abstract ResponseDto mapToDto(Response entity);
}

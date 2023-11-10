package com.example.T1_trainee.mapper;

import com.example.T1_trainee.dto.RequestDto;
import com.example.T1_trainee.entity.Request;
import org.mapstruct.Mapper;

/** Маппер для request */
@Mapper(componentModel = "spring")
public abstract class RequestMapper {

  /**
   * Маппинг dto в entity
   *
   * @param dto dto для мапинга
   * @return смапленная entity
   */
  public abstract Request mapToEntity(RequestDto dto);
}

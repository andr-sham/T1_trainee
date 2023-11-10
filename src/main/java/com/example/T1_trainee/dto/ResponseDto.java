package com.example.T1_trainee.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Dto для хранения результатов подсчёта */
@Getter
@Setter
@EqualsAndHashCode
public class ResponseDto {
  /** Поле для хранения строки с результатом */
  private String responseString;
}

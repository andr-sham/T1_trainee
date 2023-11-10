package com.example.T1_trainee.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Entity для хранения результатов подсчёта */
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Response {
  /** Поле для хранения строки с результатом */
  private String responseString;
}

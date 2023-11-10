package com.example.T1_trainee.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Entity для хранения строки для подсчёта количества повторяющихся символов */
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Request {

  /** Поле для хранения строки с запросом */
  private String requestString;
}

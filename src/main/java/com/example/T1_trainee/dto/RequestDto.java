package com.example.T1_trainee.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Dto для хранения строки для подсчёта количества повторяющихся символов */
@Getter
@Setter
@EqualsAndHashCode
public class RequestDto {

  /**
   * В случае, если строка пустая или null выбрасывается исключение MethodArgumentNotValidException
   * с сообщением
   */
  @NotBlank(message = "Введён null или пустая строка, введите строку с символами")
  private String requestString;
}

package com.example.T1_trainee.controller;

import com.example.T1_trainee.dto.ErrorNotification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/** REST контроллер дял обработки исключений */
@RestControllerAdvice
public class ExceptionHandlerController {

  /**
   * Переопределяем поведение стандартного обработчика исключения MethodArgumentNotValidException,
   * теперь он выбрасывает dto класса ErrorNotification, в котором содержатся описания ошибок
   *
   * @param e исключение MethodArgumentNotValidException
   * @return dto класса ErrorNotification
   */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ErrorNotification handleMethodArgumentNotValidException(
      MethodArgumentNotValidException e) {
    List<String> errors = new ArrayList<>();
    for (FieldError error : e.getBindingResult().getFieldErrors()) {
      errors.add(error.getDefaultMessage());
    }

    ErrorNotification errorNotification = new ErrorNotification();
    errorNotification.setErrorMessages(errors);
    return errorNotification;
  }
}

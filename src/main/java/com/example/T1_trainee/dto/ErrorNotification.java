package com.example.T1_trainee.dto;

import java.util.List;
import lombok.Data;

/** Dto для хранения сообщений об ошибках */
@Data
public class ErrorNotification {

  /** Список сообщений с ошибками */
  private List<String> errorMessages;
}

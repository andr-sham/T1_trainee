package com.example.T1_trainee.controller;

import com.example.T1_trainee.dto.RequestDto;
import com.example.T1_trainee.dto.ResponseDto;
import com.example.T1_trainee.entity.Request;
import com.example.T1_trainee.entity.Response;
import com.example.T1_trainee.mapper.RequestMapper;
import com.example.T1_trainee.mapper.ResponseMapper;
import com.example.T1_trainee.service.StringService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/** REST контроллер для обработки запросов с URL /charcalculate */
@RestController
@RequestMapping("/charcalculate")
@AllArgsConstructor
public class StringController {

  /** инжектирование сервиса StringService */
  private StringService stringService;

  /** инжектирование мапера для request */
  private RequestMapper requestMapper;

  /** инжектирование мапера для response */
  private ResponseMapper responseMapper;

  /**
   * метод обработки POST запросов с URL /charcalculate
   *
   * @param requestDto dto со String полем requestString для обработки в формате JSON
   * @return результаты подсчёта количества символов со String полем в формате JSON
   */
  @PostMapping
  public ResponseDto calcChar(@Valid @RequestBody RequestDto requestDto) {
    Request request = requestMapper.mapToEntity(requestDto);

    Response response = stringService.charCalculate(request);

    return responseMapper.mapToDto(response);
  }
}

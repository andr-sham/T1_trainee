package com.example.T1_trainee.services;

import com.example.T1_trainee.entity.Request;
import com.example.T1_trainee.entity.Response;
import com.example.T1_trainee.service.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringServiceTest {
  private final StringService stringService = new StringService();

  @Test
  void charCalculate_correctString_equal() {
    Request request = Request.builder().requestString("aaasdd").build();
    Response response = Response.builder().responseString("a: 3, d: 2, s: 1").build();

    Assertions.assertEquals(response, stringService.charCalculate(request));
  }

  @Test
  void charCalculate_stringIsNull_throw() {
    Request request = Request.builder().requestString(null).build();

    Assertions.assertThrows(NullPointerException.class, () -> stringService.charCalculate(request));
  }

  @Test
  void charCalculate_stringIsEmpty_equal() {
    Request request = Request.builder().requestString("").build();
    Response response = Response.builder().responseString(": 1").build();

    Assertions.assertEquals(response, stringService.charCalculate(request));
  }
}

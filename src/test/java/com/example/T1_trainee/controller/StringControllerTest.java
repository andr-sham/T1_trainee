package com.example.T1_trainee.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.T1_trainee.mapper.RequestMapper;
import com.example.T1_trainee.mapper.ResponseMapper;
import com.example.T1_trainee.service.StringService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class StringControllerTest {
  @Autowired private MockMvc mockMvc;
  @MockBean private StringService stringService;
  @MockBean private ResponseMapper responseMapper;
  @MockBean private RequestMapper requestMapper;

  @Test
  void calcChar_correctString_isOk() throws Exception {

    mockMvc
        .perform(
            post("/charcalculate")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"requestString\": \"aaassd\"}"))
        .andExpect(status().isOk());
  }

  @Test
  void calcChar_nullString_isOk() throws Exception {

    mockMvc
        .perform(
            post("/charcalculate")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"requestString\": null}"))
        .andExpect(status().isOk());
  }

  @Test
  void calcChar_emptyString_isOk() throws Exception {

    mockMvc
        .perform(
            post("/charcalculate")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"requestString\": \"\"}"))
        .andExpect(status().isOk());
  }
}

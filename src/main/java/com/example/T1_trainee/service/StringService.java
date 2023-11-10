package com.example.T1_trainee.service;

import com.example.T1_trainee.entity.Request;
import com.example.T1_trainee.entity.Response;
import java.util.*;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/** Сервис для работы с исходной строкой */
@Service
public class StringService {

  /**
   * Подсчёт количества повторяющихся символов в строке
   *
   * @param request entity со String полем для подсчёта
   * @return entity с результатами подсчёта количества символов со String полем
   */
  public Response charCalculate(Request request) {
    String str = request.getRequestString();

    HashMap<String, Integer> unsortedResult = new HashMap<>();

    Arrays.stream(str.split(""))
        .forEach(
            s -> {
              if (unsortedResult.containsKey(s)) {
                unsortedResult.put(s, unsortedResult.get(s) + 1);
              } else {
                unsortedResult.put(s, 1);
              }
            });

    LinkedHashMap<String, Integer> sortedResult = sortResult(unsortedResult);

    String stringResult = makeResultFormat(sortedResult);

    return Response.builder().responseString(stringResult).build();
  }

  /**
   * Сортировка результатов подсчёта по убыванию
   *
   * @param unsortedResult HashMap с неотсортированными результатами
   * @return LinkedHashMap с результатами, упорядоченными по убыванию
   */
  private LinkedHashMap<String, Integer> sortResult(HashMap<String, Integer> unsortedResult) {
    return unsortedResult.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (key1, key2) -> key1, LinkedHashMap::new));
  }

  /**
   * Приведение результатов расчёта к заданному формату
   *
   * @param sortedResult LinkedHashMap с результатами
   * @return String с результатами
   */
  private String makeResultFormat(LinkedHashMap<String, Integer> sortedResult) {
    return sortedResult.entrySet().stream()
        .map(entry -> entry.getKey() + ": " + entry.getValue())
        .collect(Collectors.joining(", "));
  }
}

package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> param = new HashMap<>();
        param.put("name", "Ivanov");
        param.put("city", "Kiev");
        param.put("country", "Ukraine");
        param.put("age", null);
        System.out.println(getQuery(param));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (String key : params.keySet()) {
            if (params.get(key) == null) {
                continue;
            }
            if (sb.toString().length() != 0)
                sb.append(" and ");
            sb.append(key + " = '" + params.get(key) + "'");
        }
        return sb.toString();
    }
}

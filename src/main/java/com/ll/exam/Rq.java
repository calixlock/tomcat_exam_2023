package com.ll.exam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req =req;
        this.resp = resp;
        try {
            req.setCharacterEncoding("UTF-8"); // 들어오는 데이터 utf-8로 해석
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8"); // 완성되는 html의 인코딩 utf-8로 한다
        resp.setContentType("text/html; charset=utf-8");// 브라우저에 결과물 형식 utf-8로 알려준다.
    }

    public int getIntParam(String paramName, int defaultValue) {
        String value = req.getParameter(paramName);
        if (value == null){
            return defaultValue;
        }
        try{
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            return defaultValue;
        }
    }

    public void appendBody(String str) {
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
//            throw new RuntimeException(e); // 프로그램 끈다.
        }
    }
}

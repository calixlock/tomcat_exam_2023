package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 한글 작성시 필요
        req.setCharacterEncoding("UTF-8"); // 들어오는 데이터 utf-8로 해석
        resp.setCharacterEncoding("UTF-8"); // 완성되는 html의 인코딩 utf-8로 한다
        resp.setContentType("text/html; charset=utf-8");// 브라우저에 결과물 형식 utf-8로 알려준다.

        // 메세지 작성
        resp.getWriter().append("Hi~~ 한글 출력");
        resp.getWriter().append("자동 변경 처리 확인");
    }
}

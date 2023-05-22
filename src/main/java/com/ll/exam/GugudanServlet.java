package com.ll.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8"); // 들어오는 데이터 utf-8로 해석
//        resp.setCharacterEncoding("UTF-8"); // 완성되는 html의 인코딩 utf-8로 한다
//        resp.setContentType("text/html; charset=utf-8");// 브라우저에 결과물 형식 utf-8로 알려준다.
//
//        int dan = Integer.parseInt(req.getParameter("dan"));
//        int limit = Integer.parseInt(req.getParameter("limit"));
//
//
//        resp.getWriter().append("<h1>%d단</h1>\n".formatted(dan));
//        for (int i = 1; i <= limit; i++) {
//            resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan,i,dan*i));
//        }
//        resp.getWriter().append("--끝--");

        Rq rq = new Rq(req,resp);
        int dan = rq.getIntParam("dan",0);
        int limit = rq.getIntParam("limit",0);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));
        for (int i = 0; i < limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan,i,dan*i));
        }
    }
}

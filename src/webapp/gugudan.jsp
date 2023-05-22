<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ll.exam.Rq" %>
<%
Rq rq = new Rq(req, resp);
int dan = rq.getIntParam("dan",9);
int limit = rq.getIntParam("limit",9);
%>

<h1><%=dan%>단</h1>

<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>

<!--
<%
int a = 10;
%>

<h1>
 <% out.println(a); %>
</h1>

<h1>
 <%=a%>
</h1>
-->
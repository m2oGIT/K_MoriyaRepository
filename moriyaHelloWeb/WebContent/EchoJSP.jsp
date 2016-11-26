<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>はじめてのJSP</title>
</head>
<body>
  <h1>
    <font color="blue">はじめてのJSPです。</font>
  </h1>

  <form action="./EchoJSP.jsp" method="post">
    <input type="text" name="param" /> <input type="submit"
      value="自ページへ送信！" />
  </form>
  <!-- HTMLコメント -->
  <%--JSPコメント --%>
  <%
    request.setCharacterEncoding( "UTF-8" );
    String param = request.getParameter( "param" );
    System.out.println( param );
  %>

  <%=param%>

  <hr>
  <table border="1" bordercolor="black">
    <tr>
      <%
        for ( int i = 0; i < 10; i++ ) {
      %>

      <td><%=i%></td>

      <%
        }
      %>
    </tr>
  </table>

<hr>
現在の日付<br>
<%
SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
Date now = new Date();
%>
<%= fmt.format( now ) %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id=request.getParameter("id");
String pw=request.getParameter("pw");
String result="로그인 실패 ㅋ";

if(id.equals("person") && pw.equals("1234")){
    result = id + "님 반갑습니다.";
} else{
    result = "로그인 실패.";
};

%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>로그인 결과</h1>
    <hr>
    <p><%= result %></p>
</body>
</html>
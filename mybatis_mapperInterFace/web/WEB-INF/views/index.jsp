<%--
  Created by IntelliJ IDEA.
  User: SECURUS-GRAM
  Date: 2023-06-12
  Time: 오후 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>

    <h2>=== Login ===</h2>

    <form action="/member/login" method="post">

<%--        아이디&비번 입력창 --%>
        <input type="text" name="userId" placeholder="아이디를 입력하세요">
        <br>
        <input type="text" name="userPwd" placeholder="비밀번호를 입력하세요">
        <input type="submit" value="로그인" >

<%--    로그인&회원가입 버튼 --%>
        <br>
        <br>
        <button type="button" onclick="alert('회원가입 페이지로 이동합니다!')">회원가입</button>

    </form>
</body>
</html>

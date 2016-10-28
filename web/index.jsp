<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Library</title>
    <link href="CSS/LoginPageStyle.css" type="text/css" rel="stylesheet">
    <link href="CSS/Footer.css" rel="stylesheet" type="text/css">
    <link href="CSS/MainPageStyle.css" rel="stylesheet" type="text/css">
</head>
<body>

<header class="greeting">

    <h2>
        Добро пожаловать в нашу онлайн библиотеку!
    </h2>
</header>
<article>
    <form action="Pages/main.jsp" name="LoginForm" method="post">
        <h3> Для входа введите регистрационные данные</h3>
        <input type="text" name="login" placeholder="Введите логин">
        <input type="password" name="password" placeholder="Введите пароль">
        <div class="logButtons">
            <input type="submit" value="Вход" class="search_button">
            <input type="reset" value="Отмена" class="search_button">
        </div>
    </form>
</article>
<h2 class="Attention">Внимание, сайт в разработке! Возможны изменения в стиле и функциональных возможностях!</h2>
<%@ include file="WEB-INF/jspf/Footer.jspf" %>

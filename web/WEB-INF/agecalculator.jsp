<%-- 
    Document   : agecalculator
    Created on : 20-Sep-2022, 10:09:19 AM
    Author     : meeye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age" onsubmit="ageNextBirthday()">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
            <div>${resultMessage}</div>
        </form>   
    </body>
</html>

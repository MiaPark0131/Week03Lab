<%-- 
    Document   : arithmeticcalculator
    Created on : 21-Sep-2022, 6:34:33 PM
    Author     : meeye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="arithmetic"> <input type="submit" value="-" name="arithmetic"> <input type="submit" value="*" name="arithmetic"> <input type="submit" value="%" name="arithmetic">
            <div>Result: ${resultMessage}</div>
            <div><a href="age">Age Calculator</a></div>    
        </form>
    </body>
</html>

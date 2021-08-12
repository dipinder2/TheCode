<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Demo JSP</title>
    </head>
<body class="d-flex justify-content-center">
	<form action="/postcode" method="post" class="form">
		<h1>What is the code?</h1>
		<input name="code" class="group-text" type="text"/>
		<input class="btn btn-primary" type="submit" value="Try Code"/>
		<p class="text-danger"><c:out value="${err}"/></p>
	</form>
</body>
</html>
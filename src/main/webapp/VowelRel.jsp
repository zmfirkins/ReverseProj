<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix= "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vowel Counter</title>
</head>
<body>
	<p>${userSentKeep2}<br /></p>
	<p>Vowel Count: ${userSentence2.getvowelCounter()}</p>
	<a href="index.jsp">Reverse Another Sentence or Count the Vowels!</a>
</body>
</html>
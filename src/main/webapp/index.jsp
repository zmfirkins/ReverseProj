<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
Reverse Sentence
</title>
</head>
<body>
<h1>
Sentence Reverser
</h1>
<form action="getSentanceServlet"method="post">
Enter a sentence of your choice to reverse!:
<input type="text"name="userSent"size="10">
<input type="submit"value="Reverse Sentence"/>
</form>
<p>Or....</p>
<form action="getSentenceServlet2"method="post">
Enter a sentence of your choice to count the vowels!:
<input type="text"name="userSent2"size="10">
<input type="submit"value="Vowel Counter"/>
</form>
</body>
</html>
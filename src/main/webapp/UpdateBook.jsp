<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Book</h2>
	
	<form action="updateBook" method="post">
		Book Id:<input type="text" name="bookid">
  <br><br>
  
  Book Name:<input type="text" name="bookname">
  <br><br>
  
  Book Author:<input type="text" name="bookauthor">
  <br><br>
  
  Book Publisher:<input type="text" name="bookpublisher">
  <br><br>
  
  <input type="submit" value="Update">
  
	</form>
</body>
</html>
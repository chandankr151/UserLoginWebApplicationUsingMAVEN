<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<form action="usrLogin" method="post">
		
		<input type="text" id="usr" name="usr" placeholder="Enter User Id" required> <br>
		<input type="password" id="pass" name="pass" placeholder="Enter Password" required><br>
		
		<button>Submit</button>
		
	</form>

</body>
</html>
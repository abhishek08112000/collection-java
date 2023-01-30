<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>
	<h1>Send Details of favourite person</h1>
	<form action="marvel" method="post">
		<pre>
First Name<input type="text" name="fname" />
Last Name<input type="text" name="lname" />
Gender 	
Male <input type="radio" name="gender" value="male"/>
Female <input type="radio" name="gender" value="female"/>
Other <input type="radio" name="gender" value="other"/>
Reason<textarea rows="5" cols="25" name="reason"></textarea>
Address<textarea rows="5" cols="25" name="address"></textarea>
<input type="submit" value="Send"/>
</pre>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.Map"%>
<%@ page import="com.devops.capstone.service.*"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Parking System</title>
	</head>
<body>
	<h1>Parking Management System</h1>
	<br>
	<h2>Select Vehicle Type</h2>
	<form action="ListAllParkingFloorsServlet" method="post">
		Select floor type
		<select id="vehicleType" name="vehicleType">
			<option value="car" selected>Car</option>
			<option value="bike">Bike</option>
		</select>
		<button type="submit">
			Park your Vehicle
			
		</button>									
	</form>
	
	<br>
	<br>
	<form action="unparkVehicle.jsp">
		<button type="submit">
			UnPark Vehicle
			
		</button>	
	
	
	</form>
	
</body>
</html>

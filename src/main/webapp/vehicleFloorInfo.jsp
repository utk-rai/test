<html>
	<head>
		<title>Parking System</title>
	</head>
<body>
	<h1>Available Parking Space</h1>
	
	<br>
	<% String vehicleType = (String)request.getAttribute("vehicleType"); %>
	<% int freeSlot = (Integer)request.getAttribute("freeSlot"); %>
	<p> Free slot available for 
	<%= vehicleType %>
	 is  
	<%= freeSlot %> .</p>
	
	<br>
	
	<form action="VehicleParkServlet" method="post">
		<input name="vehicleType" value='<%=vehicleType %>' size="50" type="text">
		<br>
		Select 0,1,2 for Car, Selet 3,4 for bikes
		Select Floor Number:
		
		
		<input name ="floorNumber" type="number">
		<br>
		Enter Vehicle Number
		<input type="text" name="vehicleNumber">
		<br>
		<button type="submit">
				Park Your Vehicle
			
		</button>									
	</form>
</body>
</html>
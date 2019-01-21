package controller;
import com.devops.capstone.*;
import com.devops.capstone.service.Parkingservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devops.capstone.*;
@WebServlet("/VehicleParkServlet")
public class VehicleParking extends HttpServlet{
	Parkingservice obj = new Parkingservice();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String vehicleNumber = request.getParameter("vehicleNumber");
		String vehicleType = request.getParameter("vehicleType");
		int floorNumber = Integer.parseInt(request.getParameter("floorNumber"));
		
		if(vehicleType.equals("car")&&floorNumber>=0&&floorNumber<3)
		{
			obj.alotParkingSlot(floorNumber, vehicleNumber);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request,response);
		}
		
		else if(vehicleType.equals("bike")&&floorNumber>2&&floorNumber<5)
		{
			obj.alotParkingSlot(floorNumber, vehicleNumber);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request,response);
		}
		
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
			rd.forward(request,response);
			
		}
		
	}

}

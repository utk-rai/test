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
@WebServlet("/VehicleUnParkServlet")

public class vehicleFreeParking extends HttpServlet{
Parkingservice obj = new Parkingservice();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String vehicleNumber = request.getParameter("vehicleNumber");
		int floorNumber = Integer.parseInt(request.getParameter("floorNumber"));
		
		boolean result = obj.freeParkingSlot(floorNumber, vehicleNumber);
		
		if (result==false)
		{
			RequestDispatcher rd = request.getRequestDispatcher("parkingfailure.jsp");
			rd.forward(request,response);
		}
		
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("parkingsuccess.jsp");
			rd.forward(request,response);
		}
	}

}

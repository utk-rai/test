package controller;
import com.devops.capstone.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.devops.capstone.service.Parkingservice;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListAllParkingFloorsServlet")

public class ParkingStatusController extends HttpServlet{
	static Parkingservice obj = new Parkingservice();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("vehicleType");
		
		
		obj.createFloorAndParking();
		int freeSlot = obj.getVehicleTypeSlotStatus(name);
		out.println("Free Space available: " + freeSlot);
		
		if(freeSlot == 0)
		{
			
			response.sendRedirect("fail.jsp");
		}
		else
		{
			System.out.println(response);
			request.setAttribute("freeSlot", freeSlot);
			request.setAttribute("vehicleType", name);
			RequestDispatcher rd = request.getRequestDispatcher("vehicleFloorInfo.jsp");
			rd.forward(request,response);
		}
	}
	

}

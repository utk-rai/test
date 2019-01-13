package controller;
import com.devops.capstone.*;
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
		out.println(name);
		
		obj.createFloorAndParking();
		int freeSlot = obj.getVehicleTypeSlotStatus(name);
		System.out.println(name + freeSlot);
	}

}

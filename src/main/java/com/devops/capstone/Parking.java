package com.devops.capstone;

public class Parking {
	
	int floorNumber;
	String floorType;
	int slotNumber;
	boolean isOccupied;
	String vehicleNumber;
	
	public Parking(int floorNumber, int slotNumber, String floorType, boolean isOccupied, String vehicleNumber) {
		this.floorNumber= floorNumber;
		this.slotNumber= slotNumber;
		this.floorType = floorType;
		this.vehicleNumber = vehicleNumber;
		this.isOccupied = isOccupied;
	}
	
	public String getParkingFloorType() {
		return floorType;
	}
	public void setParkingFloorType(String floorType) {
		this.floorType= floorType;
	}
	
	public int getParkingFloorNumber() {
		return floorNumber;
	}
	public void setParkingFloorNumber(int floorNumber) {
		this.floorNumber= floorNumber;
	}
	
	public int getParkingSlotNumber() {
		return slotNumber;
	}
	public void setParkingSlotNumber(int slotNumber) {
		this.slotNumber= slotNumber;
	}
	
	public boolean getParkingIsOccupied() {
		return isOccupied;
	}
	public void setParkingIsOccupied(boolean isOccupied) {
		this.isOccupied= isOccupied;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber= vehicleNumber;
	}
	

}

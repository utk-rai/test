package com.devops.capstone;
import com.devops.capstone.*;
public class Floor {
	int parkingCapacity;
	int floorNumber;
	String floorType;
	Parking parkingList[];

	public Floor(int floorNumber, int parkingCapacity, String floorType) {
		this.floorNumber= floorNumber;
		this.parkingCapacity= parkingCapacity;
		this.floorType = floorType;
		this.parkingList = new Parking[this.parkingCapacity];
	}
	
	public String getFloorParkingFloorType() {
		return floorType;
	}
	public void setFloorParkingFloorType(String floorType) {
		this.floorType= floorType;
	}
	
	public int getFloorParkingFloorNumber() {
		return floorNumber;
	}
	public void setFloorParkingFloorNumber(int floorNumber) {
		this.floorNumber= floorNumber;
	}
	
	public int getFloorParkingCapacity() {
		return parkingCapacity;
	}
	public void setFloorParkingCapacity(int parkingCapacity) {
		this.parkingCapacity= parkingCapacity;
	}
	
	public Parking [] getFloorParkingList() {
		return parkingList;
	}
	
	public void setFloorParkingList() {
		this.parkingList = new Parking[this.parkingCapacity];
	}
}

package com.devops.capstone.service;
import com.devops.capstone.*;


public class Parkingservice {
	static Floor floorList[] = new Floor[5];
	static int counter = 0;

	public void createFloorAndParking() {
		if (counter==0) {
			
			String floorType = "car";
			
			for(int i=0; i<5; i++)
			{
				this.floorList[i]=new Floor(i, 50, floorType);
				for (int j = 0; j < this.floorList[i].getFloorParkingCapacity(); j++) {
					this.floorList[i].getFloorParkingList()[j] = new Parking(
																	this.floorList[i].getFloorParkingFloorNumber(),
																	j,
																	floorType,
																	false,
																	"");
				}
				if (i > 1) {
					floorType = "bike";
				}
				
			}
			
			this.alotParkingSlot(0, "ABCD");
			this.alotParkingSlot(1, "Rohit");
			this.alotParkingSlot(2, "UTK");
			this.alotParkingSlot(3, "SHASHA");
			counter++;
		}
		
		
	}		
	
	public Parking alotParkingSlot(int floorNumber, String vehicleNumber) {
		for (int i = 0; i < this.floorList.length; i++) {
			if (this.floorList[i].getFloorParkingFloorNumber() == floorNumber) {
				for (int j = 0; j < this.floorList[i].getFloorParkingCapacity(); j++) {
					if (!this.floorList[i].getFloorParkingList()[j].getParkingIsOccupied()) {
						this.floorList[i].getFloorParkingList()[j].setVehicleNumber(vehicleNumber);
						this.floorList[i].getFloorParkingList()[j].setParkingIsOccupied(true);
						return this.floorList[i].getFloorParkingList()[j];
					}
				}
			}
		}
		return null;
	}
	
	public boolean freeParkingSlot(int floorNumber, String vehicleNumber) {
		for (int i = 0; i < this.floorList.length; i++) {
			if (this.floorList[i].getFloorParkingFloorNumber() == floorNumber) {
				for (int j = 0; j < this.floorList[i].getFloorParkingCapacity(); j++) {
					if (this.floorList[i].getFloorParkingList()[j].getVehicleNumber() == vehicleNumber) {
						this.floorList[i].getFloorParkingList()[j].setVehicleNumber("");
						this.floorList[i].getFloorParkingList()[j].setParkingIsOccupied(false);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public int getParking(String floorType) {
		int slots = this.getVehicleTypeSlotStatus(floorType);
		return slots;
	}

	public int getVehicleTypeSlotStatus(String floorType){
		int count = 0;
		for (int i = 0; i < this.floorList.length; i++) {
			if (this.floorList[i].getFloorParkingFloorType().equals(floorType)) {
				count += this.getFreeSlots(this.floorList[i].getFloorParkingFloorNumber());
			}
		}
		return count;
	}
	
	public int getFreeSlots(int floorNumber){
		int count=0;
		int limit = 0;
		int i = 0;
		for (i = 0; i < this.floorList.length; i++) {
			if (this.floorList[i].getFloorParkingFloorNumber() == floorNumber) {
				limit = this.floorList[i].getFloorParkingCapacity();
				break;
			}
		}
		for (int j = 0; j < limit; j++) {
			count += this.floorList[i].getFloorParkingList()[j].getParkingIsOccupied() ? 0 : 1;
		}
		
		return count;
	}
	
	
}

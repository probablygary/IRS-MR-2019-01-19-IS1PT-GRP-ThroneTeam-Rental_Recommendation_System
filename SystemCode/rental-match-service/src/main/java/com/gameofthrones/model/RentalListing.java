package com.gameofthrones.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RentalListing {

	@Id
	private int id;
	private int postal;
	private String street;
	private String block;
	private int level;
	private int unit;
	private float price;
	private int numberOfRoomsRented;
	private String leaseType;
	private String childCare;
	private String school;
	private String market;
	private String foodCourt;
	private String mrt;
	private String busStop;
	private String gym;
	private String typeOfProperty;
	private String furnished;
	private String zone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPostal() {
		return postal;
	}
	public void setPostal(int postal) {
		this.postal = postal;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumberOfRoomsRented() {
		return numberOfRoomsRented;
	}
	public void setNumberOfRoomsRented(int numberOfRoomsRented) {
		this.numberOfRoomsRented = numberOfRoomsRented;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}
	public String getChildCare() {
		return childCare;
	}
	public void setChildCare(String childCare) {
		this.childCare = childCare;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getFoodCourt() {
		return foodCourt;
	}
	public void setFoodCourt(String foodCourt) {
		this.foodCourt = foodCourt;
	}
	public String getMrt() {
		return mrt;
	}
	public void setMrt(String mrt) {
		this.mrt = mrt;
	}
	public String getBusStop() {
		return busStop;
	}
	public void setBusStop(String busStop) {
		this.busStop = busStop;
	}
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public String getTypeOfProperty() {
		return typeOfProperty;
	}
	public void setTypeOfProperty(String typeOfProperty) {
		this.typeOfProperty = typeOfProperty;
	}
	public String getFurnished() {
		return furnished;
	}
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}
	@Override
	public String toString() {
		return "RentalListing [id=" + id + ", postal=" + postal + ", street=" + street + ", block=" + block + ", level="
				+ level + ", unit=" + unit + ", price=" + price + ", numberOfRoomsRented=" + numberOfRoomsRented
				+ ", leaseType=" + leaseType + ", childCare=" + childCare + ", school=" + school + ", market=" + market
				+ ", foodCourt=" + foodCourt + ", mrt=" + mrt + ", busStop=" + busStop + ", gym=" + gym
				+ ", typeOfProperty=" + typeOfProperty + ", furnished=" + furnished + "]";
	}
}

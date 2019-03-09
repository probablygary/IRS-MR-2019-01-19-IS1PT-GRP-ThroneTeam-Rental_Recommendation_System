package com.gameofthrones.model;

public class SearchCriteria {

	private float price;
	private String zone;
	private String leaseType;
	private String noOfRooms;
	private String spouseWork;
	private String userWork;
	private String childCare;
	private String gym;
	private String market;
	private String mrt;
	private String busStop;
	private String school;
	private String foodCourt;
	private String furnished;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getLeaseType() {
		return leaseType;
	}
	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}
	public String getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(String noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public String getSpouseWork() {
		return spouseWork;
	}
	public void setSpouseWork(String spouseWork) {
		this.spouseWork = spouseWork;
	}
	public String getUserWork() {
		return userWork;
	}
	public void setUserWork(String userWork) {
		this.userWork = userWork;
	}
	public String getChildCare() {
		return childCare;
	}
	public void setChildCare(String childCare) {
		this.childCare = childCare;
	}
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getFoodCourt() {
		return foodCourt;
	}
	public void setFoodCourt(String foodCourt) {
		this.foodCourt = foodCourt;
	}
	public String getFurnished() {
		return furnished;
	}
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}
	
	@Override
	public String toString() {
		return "SearchCriteria [price=" + price + ", zone=" + zone + ", leaseType=" + leaseType + ", noOfRooms="
				+ noOfRooms + ", spouseWork=" + spouseWork + ", userWork=" + userWork + ", childCare=" + childCare
				+ ", gym=" + gym + ", market=" + market + ", mrt=" + mrt + ", busStop=" + busStop + ", school=" + school
				+ ", foodCourt=" + foodCourt + ", furnished=" + furnished + "]";
	}
	
}

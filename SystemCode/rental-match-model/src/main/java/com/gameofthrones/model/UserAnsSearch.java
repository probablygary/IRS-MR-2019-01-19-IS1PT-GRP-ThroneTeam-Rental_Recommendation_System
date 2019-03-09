package com.gameofthrones.model;

import java.io.Serializable;

public class UserAnsSearch implements Serializable{
	
	//User Answers
	private String qnsBudget;
	private String qnsPurpose;
	private String qnsLocationWork;
	private String qnsStayingFamily;
	private String qnsNoOfChild;
	private String qnsNoOfAdult;
	private String qnsSpouseWork;
	private String qnsCook;
	private String qnsTransport;
	private String qnsExercise;
	
	//Search Criteria
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
	
	public String getQnsBudget() {
		return qnsBudget;
	}
	public void setQnsBudget(String qnsBudget) {
		this.qnsBudget = qnsBudget;
	}
	public String getQnsPurpose() {
		return qnsPurpose;
	}
	public void setQnsPurpose(String qnsPurpose) {
		this.qnsPurpose = qnsPurpose;
	}
	public String getQnsLocationWork() {
		return qnsLocationWork;
	}
	public void setQnsLocationWork(String qnsLocationWork) {
		this.qnsLocationWork = qnsLocationWork;
	}
	public String getQnsStayingFamily() {
		return qnsStayingFamily;
	}
	public void setQnsStayingFamily(String qnsStayingFamily) {
		this.qnsStayingFamily = qnsStayingFamily;
	}
	public String getQnsNoOfChild() {
		return qnsNoOfChild;
	}
	public void setQnsNoOfChild(String qnsNoOfChild) {
		this.qnsNoOfChild = qnsNoOfChild;
	}
	public String getQnsNoOfAdult() {
		return qnsNoOfAdult;
	}
	public void setQnsNoOfAdult(String qnsNoOfAdult) {
		this.qnsNoOfAdult = qnsNoOfAdult;
	}
	public String getQnsSpouseWork() {
		return qnsSpouseWork;
	}
	public void setQnsSpouseWork(String qnsSpouseWork) {
		this.qnsSpouseWork = qnsSpouseWork;
	}
	public String getQnsCook() {
		return qnsCook;
	}
	public void setQnsCook(String qnsCook) {
		this.qnsCook = qnsCook;
	}
	public String getQnsTransport() {
		return qnsTransport;
	}
	public void setQnsTransport(String qnsTransport) {
		this.qnsTransport = qnsTransport;
	}
	public String getQnsExercise() {
		return qnsExercise;
	}
	public void setQnsExercise(String qnsExercise) {
		this.qnsExercise = qnsExercise;
	}
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
		return "UserAnsSearch [qnsBudget=" + qnsBudget + ", qnsPurpose=" + qnsPurpose + ", qnsLocationWork="
				+ qnsLocationWork + ", qnsStayingFamily=" + qnsStayingFamily + ", qnsNoOfChild=" + qnsNoOfChild
				+ ", qnsNoOfAdult=" + qnsNoOfAdult + ", qnsSpouseWork=" + qnsSpouseWork + ", qnsCook=" + qnsCook
				+ ", qnsTransport=" + qnsTransport + ", qnsExercise=" + qnsExercise + ", price=" + price + ", zone="
				+ zone + ", leaseType=" + leaseType + ", noOfRooms=" + noOfRooms + ", spouseWork=" + spouseWork
				+ ", userWork=" + userWork + ", childCare=" + childCare + ", gym=" + gym + ", market=" + market
				+ ", mrt=" + mrt + ", busStop=" + busStop + ", school=" + school + ", foodCourt=" + foodCourt
				+ ", furnished=" + furnished + "]";
	}
}

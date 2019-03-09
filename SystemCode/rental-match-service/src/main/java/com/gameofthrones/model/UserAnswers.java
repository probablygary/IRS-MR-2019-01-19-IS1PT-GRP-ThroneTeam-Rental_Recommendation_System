package com.gameofthrones.model;

public class UserAnswers {
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
	@Override
	public String toString() {
		return "UserAnswers [qnsBudget=" + qnsBudget + ", qnsPurpose=" + qnsPurpose + ", qnsLocationWork="
				+ qnsLocationWork + ", qnsStayingFamily=" + qnsStayingFamily + ", qnsNoOfChild=" + qnsNoOfChild
				+ ", qnsNoOfAdult=" + qnsNoOfAdult + ", qnsSpouseWork=" + qnsSpouseWork + ", qnsCook=" + qnsCook
				+ ", qnsTransport=" + qnsTransport + ", qnsExercise=" + qnsExercise + "]";
	}
	
}

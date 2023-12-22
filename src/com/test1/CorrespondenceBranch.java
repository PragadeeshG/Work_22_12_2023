package com.test1;

public class CorrespondenceBranch {
	private long branchId;
	private String branchName;
	private String institutionName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;

	public CorrespondenceBranch() {

	}

	public CorrespondenceBranch(long branchId, String branchName, String institutionName, String address1,
			String address2, String city, String state, String country) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.institutionName = institutionName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

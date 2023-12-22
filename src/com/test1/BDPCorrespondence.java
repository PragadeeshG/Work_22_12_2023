package com.test1;

public class BDPCorrespondence {
	private String recordKey;
	private String parentOffice;
	private String headOffice;
	private String reachMinusKey;
	private String agent;
	private String institutionCountry;
	private String currency;
	private String isCorrespondence;
	private String localCorrespondence;
	private String branchName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BDPCorrespondence() {

	}

	public BDPCorrespondence(String recordKey, String parentOffice, String headOffice, String reachMinusKey,
			String agent, String institutionCountry, String currency, String isCorrespondence,
			String localCorrespondence, String branchName, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.recordKey = recordKey;
		this.parentOffice = parentOffice;
		this.headOffice = headOffice;
		this.reachMinusKey = reachMinusKey;
		this.agent = agent;
		this.institutionCountry = institutionCountry;
		this.currency = currency;
		this.isCorrespondence = isCorrespondence;
		this.localCorrespondence = localCorrespondence;
		this.branchName = branchName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(String recordKey) {
		this.recordKey = recordKey;
	}

	public String getParentOffice() {
		return parentOffice;
	}

	public void setParentOffice(String parentOffice) {
		this.parentOffice = parentOffice;
	}

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	public String getReachMinusKey() {
		return reachMinusKey;
	}

	public void setReachMinusKey(String reachMinusKey) {
		this.reachMinusKey = reachMinusKey;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getInstitutionCountry() {
		return institutionCountry;
	}

	public void setInstitutionCountry(String institutionCountry) {
		this.institutionCountry = institutionCountry;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsCorrespondence() {
		return isCorrespondence;
	}

	public void setIsCorrespondence(String isCorrespondence) {
		this.isCorrespondence = isCorrespondence;
	}

	public String getLocalCorrespondence() {
		return localCorrespondence;
	}

	public void setLocalCorrespondence(String localCorrespondence) {
		this.localCorrespondence = localCorrespondence;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

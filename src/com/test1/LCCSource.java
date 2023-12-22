package com.test1;

public class LCCSource {
	private String recordKey;
	private String reachMinusKey;
	private String institutionName;
	private String shortName;
	private String longName;
	private String actionFlag;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LCCSource() {

	}

	public LCCSource(String recordKey, String reachMinusKey, String institutionName, String shortName, String longName,
			String actionFlag, String creationDate, String modifiedDate, String entityState) {
		super();
		this.recordKey = recordKey;
		this.reachMinusKey = reachMinusKey;
		this.institutionName = institutionName;
		this.shortName = shortName;
		this.longName = longName;
		this.actionFlag = actionFlag;
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

	public String getReachMinusKey() {
		return reachMinusKey;
	}

	public void setReachMinusKey(String reachMinusKey) {
		this.reachMinusKey = reachMinusKey;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
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

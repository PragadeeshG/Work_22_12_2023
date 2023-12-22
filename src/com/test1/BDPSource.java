package com.test1;

public class BDPSource {
	private String recordKey;
	private String parentKey;
	private String ssiInfo;
	private String actionMode;
	private String headOffice;
	private String institutionName;
	private String shortName;
	private String longName;
	private String localShortName;
	private String localLongName;

	public BDPSource() {

	}

	public BDPSource(String recordKey, String parentKey, String ssiInfo, String actionMode, String headOffice,
			String institutionName, String shortName, String longName, String localShortName, String localLongName) {
		super();
		this.recordKey = recordKey;
		this.parentKey = parentKey;
		this.ssiInfo = ssiInfo;
		this.actionMode = actionMode;
		this.headOffice = headOffice;
		this.institutionName = institutionName;
		this.shortName = shortName;
		this.longName = longName;
		this.localShortName = localShortName;
		this.localLongName = localLongName;
	}

	public String getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(String recordKey) {
		this.recordKey = recordKey;
	}

	public String getParentKey() {
		return parentKey;
	}

	public void setParentKey(String parentKey) {
		this.parentKey = parentKey;
	}

	public String getSsiInfo() {
		return ssiInfo;
	}

	public void setSsiInfo(String ssiInfo) {
		this.ssiInfo = ssiInfo;
	}

	public String getActionMode() {
		return actionMode;
	}

	public void setActionMode(String actionMode) {
		this.actionMode = actionMode;
	}

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
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

	public String getLocalShortName() {
		return localShortName;
	}

	public void setLocalShortName(String localShortName) {
		this.localShortName = localShortName;
	}

	public String getLocalLongName() {
		return localLongName;
	}

	public void setLocalLongName(String localLongName) {
		this.localLongName = localLongName;
	}

}

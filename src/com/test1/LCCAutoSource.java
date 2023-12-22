package com.test1;

public class LCCAutoSource {
	private String recordKey;
	private String tnapsMode;
	private String tnapsRecord;
	private boolean kbpsRecord;
	private boolean bvpsRecrord;
	private String institutionNameTnaps;
	private String shortNameTnaps;
	private String longNameTnaps;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LCCAutoSource() {

	}

	public LCCAutoSource(String recordKey, String tnapsMode, String tnapsRecord, boolean kbpsRecord,
			boolean bvpsRecrord, String institutionNameTnaps, String shortNameTnaps, String longNameTnaps,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.recordKey = recordKey;
		this.tnapsMode = tnapsMode;
		this.tnapsRecord = tnapsRecord;
		this.kbpsRecord = kbpsRecord;
		this.bvpsRecrord = bvpsRecrord;
		this.institutionNameTnaps = institutionNameTnaps;
		this.shortNameTnaps = shortNameTnaps;
		this.longNameTnaps = longNameTnaps;
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

	public String getTnapsMode() {
		return tnapsMode;
	}

	public void setTnapsMode(String tnapsMode) {
		this.tnapsMode = tnapsMode;
	}

	public String getTnapsRecord() {
		return tnapsRecord;
	}

	public void setTnapsRecord(String tnapsRecord) {
		this.tnapsRecord = tnapsRecord;
	}

	public boolean isKbpsRecord() {
		return kbpsRecord;
	}

	public void setKbpsRecord(boolean kbpsRecord) {
		this.kbpsRecord = kbpsRecord;
	}

	public boolean isBvpsRecrord() {
		return bvpsRecrord;
	}

	public void setBvpsRecrord(boolean bvpsRecrord) {
		this.bvpsRecrord = bvpsRecrord;
	}

	public String getInstitutionNameTnaps() {
		return institutionNameTnaps;
	}

	public void setInstitutionNameTnaps(String institutionNameTnaps) {
		this.institutionNameTnaps = institutionNameTnaps;
	}

	public String getShortNameTnaps() {
		return shortNameTnaps;
	}

	public void setShortNameTnaps(String shortNameTnaps) {
		this.shortNameTnaps = shortNameTnaps;
	}

	public String getLongNameTnaps() {
		return longNameTnaps;
	}

	public void setLongNameTnaps(String longNameTnaps) {
		this.longNameTnaps = longNameTnaps;
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

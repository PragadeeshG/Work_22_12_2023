package com.test1;

public class TnapsBridge {
	private long consumerId;
	private long consumptionMode;
	private String fileName;
	private String apiName;
	private String fileSource;
	private String apiVersion;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TnapsBridge() {

	}

	public TnapsBridge(long consumerId, long consumptionMode, String fileName, String apiName, String fileSource,
			String apiVersion, String creationDate, String modifiedDate, String entityState) {
		super();
		this.consumerId = consumerId;
		this.consumptionMode = consumptionMode;
		this.fileName = fileName;
		this.apiName = apiName;
		this.fileSource = fileSource;
		this.apiVersion = apiVersion;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public long getConsumptionMode() {
		return consumptionMode;
	}

	public void setConsumptionMode(long consumptionMode) {
		this.consumptionMode = consumptionMode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getFileSource() {
		return fileSource;
	}

	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
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

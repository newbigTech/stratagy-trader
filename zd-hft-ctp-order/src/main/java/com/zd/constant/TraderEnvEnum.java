package com.zd.constant;

public enum TraderEnvEnum {

	ZD("1","直达交易"),
	CTP("2","CTP交易");
	
	private String code;
	private String desc;
	
	private TraderEnvEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}

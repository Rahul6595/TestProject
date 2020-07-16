package com.infy.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int SystemId;
	private String SystemName;
	
	public Laptop() {}
	public int getSystemId() {
		return SystemId;
	}
	public void setSystemId(int systemId) {
		SystemId = systemId;
	}
	public String getSystemName() {
		return SystemName;
	}
	public void setSystemName(String systemName) {
		SystemName = systemName;
	}
	@Override
	public String toString() {
		return "Laptop [SystemId=" + SystemId + ", SystemName=" + SystemName + "]";
	}
	
	
}

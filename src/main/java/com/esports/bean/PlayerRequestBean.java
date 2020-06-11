package com.esports.bean;

import lombok.Data;

@Data
public class PlayerRequestBean {
	private long id;
	private String name;
	private String displayName;
	private String iconUrl;
	private double credits;
	private long roleId;
}

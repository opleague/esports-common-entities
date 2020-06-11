package com.esports.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UIBean<T> {
	@JsonProperty(value = "data")
	T data;

    boolean success;
    String response;
}

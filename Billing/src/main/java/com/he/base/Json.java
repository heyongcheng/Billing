package com.he.base;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Json {
	private boolean success;
	private String msg;
	private Object data;
	private List<Object> list;
}

package com.he.utils;

public class Test {
	public static void main(String[] args) {
		String s = "12qwaszx";

		String md5 = Security.MD5(s);
		System.out.println(md5);
	}
}

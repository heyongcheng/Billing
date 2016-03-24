package com.he.utils;

public class Test {
	public static void main(String[] args) {
		String s = "ab8&^cd43fsfsaewhkhk2";
		String md5 = Security.MD5(s);
		System.out.println(md5);
	}
}

package com.he.utils;

import java.security.MessageDigest;

public class Security {
	private static final String ENCODING = "utf-8";
	private static final String SECURITY_MD5 = "MD5";
	/**
	 * MD5加密
	 * @param s
	 * @return
	 */
	public static String MD5(String s){
		if(s == null)
			return null;
		try {
			MessageDigest md = MessageDigest.getInstance(SECURITY_MD5);
			byte[] digest = md.digest(s.getBytes(ENCODING));
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<digest.length;i++){
				int d = digest[i];
				if(d < 0)
					d += 256;
				if(d < 16)
					sb.append("0");
				sb.append(Integer.toHexString(d));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

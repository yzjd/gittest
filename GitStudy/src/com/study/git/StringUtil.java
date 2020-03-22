package com.study.git;

public class StringUtil {
	
	private static String num = "0123456789";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is string util.");
		System.out.println("master print 01");
	    System.out.println("0623 print 01.");
	}
	
	
	/**
	 * 判断是否数字
	 * @param s
	 * @return
	 */
	public static boolean isNum(String s){
		int size = s.length();
		char c;
		for(int i=0; i<size; i++){
			c = s.charAt(i);
			if(!num.contains(String.valueOf(c)))
				return false;
		}
		return true;
	}
	/**
	 * 判断是否空字符
	 * @param s
	 * @return
	 */
	public static boolean isBlank(String s){
		if(s==null || "".equals(s))
			return true;
		return false;
	}
	
	/**
	 * 数字转十六进制
	 * @param n
	 * @return
	 */
	public static String intToHex(int n){
		return Integer.toHexString(n);
	}  
	/*
	 * 去掉空格
	 * @param s
	 * @return
	 */
	public static String trimStr(String s){
		if(isBlank(s)) return "";
		return s.trim();
	}
}

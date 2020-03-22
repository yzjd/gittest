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
	 * �ж��Ƿ�����
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
	 * �ж��Ƿ���ַ�
	 * @param s
	 * @return
	 */
	public static boolean isBlank(String s){
		if(s==null || "".equals(s))
			return true;
		return false;
	}
	
	/**
	 * ����תʮ������
	 * @param n
	 * @return
	 */
	public static String intToHex(int n){
		return Integer.toHexString(n);
	}  
	/*
	 * ȥ���ո�
	 * @param s
	 * @return
	 */
	public static String trimStr(String s){
		if(isBlank(s)) return "";
		return s.trim();
	}
}

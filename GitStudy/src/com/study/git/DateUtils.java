package com.study.git;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("this is date tool");
		System.out.println("master print 01");	
		System.out.println("0623 print .");
		System.out.println("gittest 02 master print 01");
		System.out.println("master print 02");
		System.out.println("master print 03");
		System.out.println("gittest 02 master print 02");
	}
	
	/**
	 * ����ַ�����ʽ������
	 * @param date
	 * @param formate
	 * @return
	 */
	public static String getFormateDate(Date date,String formate){		
		DateFormat f = new SimpleDateFormat(formate);
		return f.format(date);		
	}
	
	/**
	 * ��õ�ǰ���ڵ��ַ���ʽ
	 * @param formate
	 * @return
	 */
	public static String getCurrentDate(String formate){
		DateFormat f = new SimpleDateFormat(formate);
		return f.format(new Date());
	}

}

/*题目：输入某年某月某日，判断这一天是这一年的第几天？*/

package study;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请分别输入年月日：");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		int sum=0;
		sc.close();
		boolean isLeapyear=false;
		if(year%4==0&&year%100!=0||year%400==0) {
			isLeapyear=true;
		}
		switch (month) {
		case 1:
			sum=day;
			break;
		case 2:
			sum=31+day;
			break;
		case 3:
			if(isLeapyear) {
				sum=60+day;
			}else {
				sum=59+day;
			}
			break;
		case 4:
			if(isLeapyear) {
				sum=91+day;
			}else {
				sum=90+day;
			}
			break;
		case 5:
			if(isLeapyear) {
				sum=121+day;
			}else {
				sum=120+day;
			}
			break;
		case 6:
			if(isLeapyear) {
				sum=152+day;
			}else {
				sum=151+day;
			}
			break;
		case 7:
			if(isLeapyear) {
				sum=182+day;
			}else {
				sum=181+day;
			}
			break;
		case 8:
			if(isLeapyear) {
				sum=213+day;
			}else {
				sum=212+day;
			}
			break;
		case 9:
			if(isLeapyear) {
				sum=244+day;
			}else {
				sum=243+day;
			}
			break;
		case 10:
			if(isLeapyear) {
				sum=274+day;
			}else {
				sum=273+day;
			}
			break;
		case 11:
			if(isLeapyear) {
				sum=305+day;
			}else {
				sum=304+day;
			}
			break;
		case 12:
			if(isLeapyear) {
				sum=335+day;
			}else {
				sum=334+day;
			}
			break;
		default:
			break;
		}
		System.out.println("这是今年"+sum+"天");
		
	}

}

/*题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 
*/
package study;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		int count=0;
		while(num!=0) {	
			sum*=10;
			sum+=num%10;
			num/=10;
			count++;
		}
		System.out.println(count);
		System.out.println(sum);
	}

}

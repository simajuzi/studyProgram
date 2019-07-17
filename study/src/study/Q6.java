/*题目：输入两个正整数m和n，求其最大公约数和最小公倍数。*/

package study;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		int t;
		int gcd=m%n;//最大公约数
		int lcm=m*n;//最小公倍数
		if(m<n) {
			t=m;
			m=n;
			n=t;
		}
		while(gcd!=0) {
			gcd=m%n;
			m=n;
			n=gcd;
		}
		gcd=m;
		lcm/=gcd;
		System.out.println("最大公约数"+gcd);
		System.out.println("最小公倍数"+lcm);
	}

}

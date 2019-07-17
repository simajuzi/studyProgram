/*题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。*/
package study;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		sc.close();
		char[] chnum=num.toCharArray();
		boolean isHuiwen=true;
		for(int i=0;i<=chnum.length/2;i++) {
			if(chnum[i]!=chnum[chnum.length-1-i]) {
				isHuiwen=false;
				break;
			}
		}
		if(isHuiwen) {
			System.out.println("是回文数");
		}else {
			System.out.println("不是回文数");
		}
	}

}

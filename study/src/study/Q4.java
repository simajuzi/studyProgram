/*题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。 
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
*/
package study;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int factor=num;
		System.out.print(num+"=");
		int i=2;
		while(factor>i) {
			if(factor%i==0) {
				factor/=i;
				System.out.print(i+"*");
				i=2;
			}else {
				i++;
			}
		}
		System.out.println(factor);
	}

}

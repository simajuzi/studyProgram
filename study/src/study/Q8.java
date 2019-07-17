/*题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
几个数相加有键盘控制。*/

package study;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入数字a(个位数)：");
		int a=sc.nextInt();
		System.out.print("加数个数是：");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		int add=a;
		for(int i=0;i<n;i++) {
			sum+=add;
			add=add*10+a;
		}
		System.out.println(sum);
	}

}

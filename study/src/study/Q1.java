/*
 題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
*/
package study;

public class Q1 {

	public static void main(String[] args) {
		int num[]=new int[36];
		num[0]=1;
		num[1]=1;
		System.out.println("第1个月有兔子1对");
		System.out.println("第2个月有兔子1对");
		for(int i=2;i<36;i++) {
			num[i]=num[i-2]+num[i-1];
			System.out.println("第"+i+"个月有兔子"+num[i]+"对");
		}
	}

}

/*题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ *//*
解题思路：设该数为x，它加100后是A，再加168为B。
则因为A是完全平方数，
所以A为正数，且A=y*y，y为正整数或0。
同理，B为正数，B=z*z，z为正整数。
因为B=A+168>A，所以，我们可设z=y+n，n为正整数，n>0。
由B=A+168，有：(y+n)(y+n)=y*y+168，即：y=84/n-n/2。
又y为正整数，所以84/n-n/2≥0，则得出n≤13
所以，编程时可用的条件有：
0<n≤13
y=84/n-n/2
x=y*y-100，当y为整数时，就是符合题目的y。*/
package study;

public class Q13 {

	public static void main(String[] args) {
		for(int n=1;n<=13;n++) {
			if(84%n==0&&n%2==0) {
				int y=84/n-n/2;
				int x=y*y-100;
				System.out.println("该数为："+x);
			}
		}
	}

}

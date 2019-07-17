/*题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
少米？第10次反弹多高？ */

package study;

public class Q10 {

	public static void main(String[] args) {
		double high=100;
		double sum=100;
		for(int i=0;i<10;i++) {
			high/=2;
			sum=sum+high*2;
		}
		System.out.println("第10次落地，共经过"+sum+"米");
		System.out.println("第10次反弹"+high+"米");
		
	}
}

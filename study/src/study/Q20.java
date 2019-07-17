/*题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 */

package study;

public class Q20 {

	public static void main(String[] args) {
		double a[]=new double[20];
		double b[]=new double[20];
		double sum;
		a[0]=2;
		a[1]=3;
		b[0]=1;
		b[1]=2;
		sum=a[0]/b[0]+a[1]/b[1];
		for(int i=2;i<20;i++) {
			a[i]=a[i-1]+a[i-2];
			b[i]=b[i-1]+b[i-2];
			sum+=a[i]/b[i];
		}
		System.out.println(sum);
	}

}

/*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。*/
package study;

public class Q3 {

	public static void main(String[] args) {
		int i,j,k;//百位、十位、个位
		int sum;
		for(int num=100;num<1000;num++) {
			i=num/100;
			j=(num%100)/10;
			k=num%10;
			sum=i*i*i+j*j*j+k*k*k;
			if(sum==num) {
				System.out.println(num);
			}
		}
	}

}

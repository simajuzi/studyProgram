/*题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完
数。 */

package study;

public class Q9 {

	public static void main(String[] args) {
		for(int num=1;num<1000;num++) {
			int sum=0;
			for(int i=1;i<num;i++){
				if(num%i==0) {
					sum+=i;
				}
			}
			if(sum==num) {
				System.out.println(sum);
			}
		}
	}

}

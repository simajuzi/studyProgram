/*题目：求1+2!+3!+...+20!的和 */

package study;

public class Q21 {

	public static void main(String[] args) {
		int addend=1;
		int sum=0;
		for(int i=1;i<=20;i++) {
			addend*=i;
			sum+=addend;
		}
		System.out.println(sum);
	}

}

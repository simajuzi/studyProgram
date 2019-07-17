/*题目：利用递归方法求5!。 */

package study;

public class Q22 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(rec(n));
	}
	private static int rec(int n) {
		int value;
		if(n==1) {
			value=1;
		}else {
			value=rec(n-1)*n;
		}
		return value;
	}
}

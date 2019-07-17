/*题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问
第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个
人多大？*/

package study;

public class Q23 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(age(n));
	}

	private static int age(int n) {
		int a;
		if(n==1){
			a=10;
		}else {
			a=age(n-1)+2;
		}
		return a;
	}

}

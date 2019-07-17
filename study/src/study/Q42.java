/*题目：809*??=800*??+9*??+1 
其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 */

package study;

public class Q42 {

	public static void main(String[] args) {
		for(int i=10;i<100;i++) {
			if(8*i<100&&9*i>100) {
				System.out.println(i);
				System.out.println(809*i);
			}
		}
	}

}

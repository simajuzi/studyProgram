/*题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少*/

package study;

public class Q11 {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (j != i) {
					for (int k = 1; k < 5; k++) {
						if(k!=i&&k!=j) {
							System.out.println(i*100+j*10+k);
							count++;
						}

					}
				}

			}
		}
		System.out.println("共有"+count+"个数");
	}

}

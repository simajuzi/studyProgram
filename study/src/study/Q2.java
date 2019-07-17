/*题目：判断101-200之间有多少个素数，并输出所有素数。 
素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子*/

package study;

public class Q2 {

	public static void main(String[] args) {
		int count=0;
		for(int num=101;num<=200;num++) {
			boolean isPrime=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
				System.out.println(num);
			}
		}
		System.out.println("共有质数"+count+"个");
	}

}

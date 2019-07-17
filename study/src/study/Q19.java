/*题目：打印出如下图案（菱形） 
    * 
   *** 
 ****** 
******** 
 ****** 
  *** 
   * */

package study;

public class Q19 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<8;j++) {
				if(j<=4+i&&j>=4-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<8;j++) {
				if(j<=i+1||j>6-i) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

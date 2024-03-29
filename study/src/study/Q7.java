/*题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。*/

package study;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int abcCount=0;
		int spaceCount=0;
		int numCount=0;
		int otherCount=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				abcCount++;
			}else if(Character.isSpaceChar(ch[i])) {
				spaceCount++;
			}else if(Character.isDigit(ch[i])) {
				numCount++;
			}else {
				otherCount++;
			}	
		}
		System.out.println("字母数："+abcCount);
		System.out.println("空格数："+spaceCount);
		System.out.println("数字数："+numCount);
		System.out.println("其他："+otherCount);
	}

}

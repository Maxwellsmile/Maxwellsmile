
//6.   程序功能：输入的一个小写字母、将字母后移5个位置后输出。
//如'a'变成'f'，'w'变成'b‘。
package test;

import java.util.Scanner;

public class Cutback {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个小写字母：");	
		//java.lang.String.charAt() 方法返回指定索引处的char值。
		char zm=scan.next().charAt(0);
		char tmp=(char)(zm+5);
		if(tmp>='z') {
			tmp=(char)(tmp-26);
		}
		System.out.print(tmp);
		
	}
}

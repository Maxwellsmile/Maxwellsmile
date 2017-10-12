
//3.  通过键盘定义年份及月份，输出此年此月的天数。
//•提示：1、3、5、7、8、10、12月为31天，4、6、9、11月为30天，2月是闰年29天，不是闰年是28天。
package test;

import java.util.*;
public class Fate {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x=0;
		int y=0;
		System.out.println("请输入年份：");
		x = scan.nextInt();
		System.out.println("请输入月份：");
		y = scan.nextInt();
		switch(y){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(y+"月份有：31天");
				break;
			case 2:
				if((x%4==0 && x%100!=0) || (x%400==0)){
					System.out.println(y+"月份有：29天");
					break;
				}
				else {
					System.out.println(y+"月份有：28天");
					break;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(y+"月份有：30天");
				break;
		default:
			System.out.println("请输入正确的年份和月份");
			break;
		}
	}
}

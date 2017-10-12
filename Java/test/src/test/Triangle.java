//2.  输入三个数值A、B、C，如果以A、B、C为边长可以构成一个三角型，
//则显示“可以构成一个三角型”，否则显示“不可构成一个三角形”，
//如果是直角三角型，需显示“这是一个直角三角形”。最后，求出这个三角形的面积。
//则显示“可以构成一个三角型”，否则显示“不可构成一个三角形”，
//如果是直角三角型，需显示“这是一个直角三角形”。
//最后，求出这个三角形的面积。
package test;

import java.util.Scanner;

public class Triangle {
	public static void main(String []args) {
  	Scanner scan = new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	System.out.println("请输入第一个整数：");		
	a=scan.nextInt();		
	System.out.println("请输入第二个整数：");		
	b=scan.nextInt();
	System.out.println("请输入第三个整数：");		
	c=scan.nextInt();
	if(a>b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
	if(a>c) {
		int tmp=a;
		a=c;
		c=tmp;
	}
	if(b>c) {
		int tmp=b;
		b=c;
		c=tmp;
	}
	
	
	if(a+b>c) {
		if(a==b || b==c) {
			System.out.println("构成一个直角三角形");
			
		}
		System.out.println("可以构成一个三角形");
	}else {
		System.out.println("不可以构成一个三角形");
	}
	double s=(a+b+c)/2;
	double area=s*(s-a)*(s-b)*(s-c);
	System.out.println("三角形面积为："+Math.sqrt(area));
	}
}
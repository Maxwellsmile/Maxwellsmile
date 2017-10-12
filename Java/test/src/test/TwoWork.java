package test;

import java.util.Scanner;

public class TwoWork {
	public static void main(String []args) {
//1! + (1!+2!) + …… +(1!+2!+3!+4!+5!)的值
//		int tmp=1;
//		int sum=0;
//		int res=0;
//		for(int i=1;i<=5;i++) {
//			tmp=tmp*i;
//			sum=sum+tmp;
//			res=res+sum;
//		}
//		System.out.println(res);
		
		
//求三位数的全部水仙花数
//		for(int i=100;i<1000;i++) {
//			int x=i/100;
//			int y=i/10%10;
//			int z=i%10;
//			if(x*x*x+y*y*y+z*z*z==i) {
//				System.out.println(i);
//			}
//		}
		
//运行时输出abcdefg结果。
//		char[] myList = {'a','b','c','d','e','f','g','h','i','m','l','h'};
//		for(int i=6;i>=0;i--) {
//    		int s=2*i-1;
//    		for(int y=6-i;y>=1;y--) {
//    			System.out.print(" ");
//    		}
//    		for(int x=0;x<s;x++) {
//    			
//    			System.out.print(myList[x]);
//    		}
//    		System.out.println();	
//    	}

		
		
		
//定义2个数字，求2个数字中的最大公约数和最小公倍数。
//		Scanner scan = new Scanner(System.in);
//		int a=0;
//		int b=0;
//		System.out.print("请输入第一个整数：");		
//		a=scan.nextInt();		
//		System.out.print("请输入第二个整数：");		
//		b=scan.nextInt();
//		if(a>b) {
//			int tmp=b;
//			b=a;
//			a=tmp;
//		}
//		for(int i=a;i>=1;i--) {
//			if(a%i==0&&b%i==0) {
//				System.out.println("最小公约数为："+i);
//				break;
//			}
//			
//		}
//		for(int i=1;i<=a;i++) {
//			for(int z=a;z<=b;z++) {
//				if(b*i==a*z) {
//					System.out.println("最小公倍数为："+b*i);
//					break;
//				}
//			}
//		}
		
		
		
//编写程序输出一个用“*”号表示的菱形
//		for(int z=1;z<=3;z++) {
//			int p=2*z-1;
//			for(int i=1;i<=4-z;i++) {
//				System.out.print(" ");
//			}
//			for(int x=1;x<=p;x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4;i>=0;i--) {
//    		int s=2*i-1;
//    		for(int y=4-i;y>=1;y--) {
//    			System.out.print(" ");
//    		}
//    		for(int x=0;x<s;x++) {
//    			System.out.print("*");
//    		}
//    		System.out.println();	
//    	}
		
		
//计算10000以内的完全数
//思路：完全数是指该数所有约数（不包含该数）的和等于该数本身	
		//tmp=0;定义在循环外面的变量不会因为一次循环的结束而清零		
		for(int i=1;i<=10000;i++) {
			int tmp=0;
			for(int z=1;z<i;z++) {//约数	
				if(i%z==0) {
					tmp=tmp+z;					
				}
			}
			if(tmp==i) {
				System.out.println(i);
			}
		}

		
	}	
}

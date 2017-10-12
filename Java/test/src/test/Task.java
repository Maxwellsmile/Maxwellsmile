package test;

import java.util.Scanner;

public class Task {
	public static void main(String []args) {
		
		
//    一.  求1! + (1!+2!) + …… +(1!+2!+3!+4!+5!)的值。
//		
//		
		int tmp=1;
		int sum=0;
		int res=0;
		for(int i=1;i<=5;i++) {
			tmp=tmp*i;
			sum=sum+tmp;
			res=res+sum;
		}
		System.out.println(res);
		
		
		
//		二. 计算10000以内的完全数。所谓一个完全数就是一个数等于其因子（不包括其本身之和），如：6的因子为1、2、3，而6=1+2+3，因此6就是完全数。		
//		for(int i=1;i<=10000;i++) {
//			int tmp=0;
//			for(int z=1;z<i;z++) {//约数	
//				if(i%z==0) {
//					tmp=tmp+z;					
//				}
//			}
//			if(tmp==i) {
//				System.out.println(i);
//			}
//		}
		
		
		
//	三. 求三位数的全部水仙花数
//		水仙花数的定义：
//		
//		水仙花数
//		运算规则: 
//		水仙花数是个三位数，它的个、十、百位数字的立方的和等于该数本身， 
//		例如：371=27+343+1 
//		
//		for(int i=100;i<1000;i++) {
//			int x=i/100;
//			int y=i/10%10;
//			int z=i%10;
//			if(x*x*x+y*y*y+z*z*z==i) {
//				System.out.println(i);
//			}
//		}
		
		
		
		
		
//	四.程序功能：运行时输出下列结果。
//		图示：
//      a  b  c  d  e  f  g
//         a  b  c  d  e  
//            a  b  c
//               a
//		
//		
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

		
		
		
		
//	五.编写程序输出一个用“*”号表示的菱形。
//
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
		
		
		
		
		
		
//	六. 定义2个数字，求2个数字中的最大公约数和最小公倍数。
//		最大公约数和最小公倍数的定义如下：
//		2，4，8三个数的最大公约数是2，最小公倍数是8
//		给出的几个数字能最大约去的数字就是最大公约数，
//		例如15和30能最大约去的数字是15，所以15就是他们的最大公约数；
//		同理，几个数字的公共的倍数，其中最小的就是最小公倍数，
//		例如15和30，他们的最小公倍数是30，因为30是15的2倍，是30的1倍，
//		而任何其他的一个数字既要是15的倍数又要是30的倍数都要比30这个数字大，
//		例如60是15的4倍，是30的2倍，但是60比30大，所以30是最小公倍数。
//		
//		
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
		
		
		

		
	}	
}

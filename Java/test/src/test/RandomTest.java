//1.  输入两个数值，得到两个数值之间的随机数(包含两个数)

package test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Random random = new Random();
        int a=0;
        int b=0;
        int s=0;
        System.out.println("请输入第一个整数：");		
    	a=scan.nextInt();		
    	System.out.println("请输入小于第一个数字的整数：");		
    	b=scan.nextInt();
        s = random.nextInt(a)%(a-b+1) + b;
        System.out.println(s);
        
        
        
//        Random random = new Random();
//		Scanner scan = new Scanner(System.in);
//		int i=0;
//		int y=0;
//		int s = 0;
//		System.out.print("请输入第一个整数：");		
//				i=scan.nextInt();
//		System.out.print("请输入第二个整数：");					
//				y=scan.nextInt();
//				if(y>i) {
//					s = random.nextInt(y)%(y-i+1) + i;
//			        System.out.println(s);
//				}else {
//					s = random.nextInt(i)%(i-y+1) + y;
//			        System.out.println(s);
//				}
    }
}
//1.  ����������ֵ���õ�������ֵ֮��������(����������)

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
        System.out.println("�������һ��������");		
    	a=scan.nextInt();		
    	System.out.println("������С�ڵ�һ�����ֵ�������");		
    	b=scan.nextInt();
        s = random.nextInt(a)%(a-b+1) + b;
        System.out.println(s);
        
        
        
//        Random random = new Random();
//		Scanner scan = new Scanner(System.in);
//		int i=0;
//		int y=0;
//		int s = 0;
//		System.out.print("�������һ��������");		
//				i=scan.nextInt();
//		System.out.print("������ڶ���������");					
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
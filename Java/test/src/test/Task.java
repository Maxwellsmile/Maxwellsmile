package test;

import java.util.Scanner;

public class Task {
	public static void main(String []args) {
		
		
//    һ.  ��1! + (1!+2!) + ���� +(1!+2!+3!+4!+5!)��ֵ��
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
		
		
		
//		��. ����10000���ڵ���ȫ������νһ����ȫ������һ�������������ӣ��������䱾��֮�ͣ����磺6������Ϊ1��2��3����6=1+2+3�����6������ȫ����		
//		for(int i=1;i<=10000;i++) {
//			int tmp=0;
//			for(int z=1;z<i;z++) {//Լ��	
//				if(i%z==0) {
//					tmp=tmp+z;					
//				}
//			}
//			if(tmp==i) {
//				System.out.println(i);
//			}
//		}
		
		
		
//	��. ����λ����ȫ��ˮ�ɻ���
//		ˮ�ɻ����Ķ��壺
//		
//		ˮ�ɻ���
//		�������: 
//		ˮ�ɻ����Ǹ���λ�������ĸ���ʮ����λ���ֵ������ĺ͵��ڸ������� 
//		���磺371=27+343+1 
//		
//		for(int i=100;i<1000;i++) {
//			int x=i/100;
//			int y=i/10%10;
//			int z=i%10;
//			if(x*x*x+y*y*y+z*z*z==i) {
//				System.out.println(i);
//			}
//		}
		
		
		
		
		
//	��.�����ܣ�����ʱ������н����
//		ͼʾ��
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

		
		
		
		
//	��.��д�������һ���á�*���ű�ʾ�����Ρ�
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
		
		
		
		
		
		
//	��. ����2�����֣���2�������е����Լ������С��������
//		���Լ������С�������Ķ������£�
//		2��4��8�����������Լ����2����С��������8
//		�����ļ������������Լȥ�����־������Լ����
//		����15��30�����Լȥ��������15������15�������ǵ����Լ����
//		ͬ���������ֵĹ����ı�����������С�ľ�����С��������
//		����15��30�����ǵ���С��������30����Ϊ30��15��2������30��1����
//		���κ�������һ�����ּ�Ҫ��15�ı�����Ҫ��30�ı�����Ҫ��30������ִ�
//		����60��15��4������30��2��������60��30������30����С��������
//		
//		
//		Scanner scan = new Scanner(System.in);
//		int a=0;
//		int b=0;
//		System.out.print("�������һ��������");		
//		a=scan.nextInt();		
//		System.out.print("������ڶ���������");		
//		b=scan.nextInt();
//		if(a>b) {
//			int tmp=b;
//			b=a;
//			a=tmp;
//		}
//		for(int i=a;i>=1;i--) {
//			if(a%i==0&&b%i==0) {
//				System.out.println("��С��Լ��Ϊ��"+i);
//				break;
//			}
//			
//		}
//		for(int i=1;i<=a;i++) {
//			for(int z=a;z<=b;z++) {
//				if(b*i==a*z) {
//					System.out.println("��С������Ϊ��"+b*i);
//					break;
//				}
//			}
//		}
		
		
		

		
	}	
}

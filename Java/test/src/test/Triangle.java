//2.  ����������ֵA��B��C�������A��B��CΪ�߳����Թ���һ�������ͣ�
//����ʾ�����Թ���һ�������͡���������ʾ�����ɹ���һ�������Ρ���
//�����ֱ�������ͣ�����ʾ������һ��ֱ�������Ρ�����������������ε������
//����ʾ�����Թ���һ�������͡���������ʾ�����ɹ���һ�������Ρ���
//�����ֱ�������ͣ�����ʾ������һ��ֱ�������Ρ���
//��������������ε������
package test;

import java.util.Scanner;

public class Triangle {
	public static void main(String []args) {
  	Scanner scan = new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	System.out.println("�������һ��������");		
	a=scan.nextInt();		
	System.out.println("������ڶ���������");		
	b=scan.nextInt();
	System.out.println("�����������������");		
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
			System.out.println("����һ��ֱ��������");
			
		}
		System.out.println("���Թ���һ��������");
	}else {
		System.out.println("�����Թ���һ��������");
	}
	double s=(a+b+c)/2;
	double area=s*(s-a)*(s-b)*(s-c);
	System.out.println("���������Ϊ��"+Math.sqrt(area));
	}
}
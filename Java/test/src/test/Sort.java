
//7.  ����������x y z,���մ�С�����˳�����.
package test;

import java.util.Scanner;

public class Sort {
	public static void main(String []args) {
  	Scanner scan = new Scanner(System.in);
	int x=0;
	int y=0;
	int z=0;
	int i=0;
	System.out.println("�������һ��������");		
	x=scan.nextInt();		
	System.out.println("������ڶ���������");		
	y=scan.nextInt();
	System.out.println("�����������������");		
	z=scan.nextInt();
	if(x>y){
        i=x;
        x=y;
        y=i;
     }
     if(x>z){
         i=x;
         x=z;
         z=i;
     }
     if(y>z){
          i=y;
          y=z;
          z=i;
      }

	System.out.println("�������ִ�С����������ǣ�"+x+"<"+y+"<"+z);
	}
}


//7.  输入三个数x y z,按照从小到大的顺序输出.
package test;

import java.util.Scanner;

public class Sort {
	public static void main(String []args) {
  	Scanner scan = new Scanner(System.in);
	int x=0;
	int y=0;
	int z=0;
	int i=0;
	System.out.println("请输入第一个整数：");		
	x=scan.nextInt();		
	System.out.println("请输入第二个整数：");		
	y=scan.nextInt();
	System.out.println("请输入第三个整数：");		
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

	System.out.println("三个数字从小到大的排序是："+x+"<"+y+"<"+z);
	}
}

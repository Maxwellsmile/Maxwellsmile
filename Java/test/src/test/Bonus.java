
//8.  企业根据利润发奖金：
//（1）利润低于或等于10万时，奖金按利润10%计算；
//（2）利润多于10万，少于20万时，低于10万部分按10%算，高于10万部分按7.5%算。
//（3）依次类推，利润20万到40万，高于20万部分按5%算。
//（4）利润40万到60万，高于40万部分按3%算。
//（5）利润60万到100万，高于60万部分按1.5%算。
//（6）利润高于100万时，高于100万部分按1%算。
//键盘输入当月利润，求应发奖金？
package test;

import java.util.Scanner;

public class Bonus {
	 public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
			System.out.print("请输入第一个整数：");
			int a=0;
			double sum=0.0;
			a=scan.nextInt();		
		if(a<=10) {
			sum=a*0.1;	
		}else if(a>10&&a<20) {
			sum=10*0.1+(a-10)*0.075;
		}else if(a>=20&&a<40) {
			sum=10*(0.1+0.075)+(a-20)*0.05;
		}else if(a>=40&&a<60) {
			sum=10*(0.1+0.075)+20*0.05+(a-40)*0.03;
		}else if(a>=60&&a<100) {
			sum=10*(0.1+0.075)+20*(0.05+0.03)+(a-60)*0.015;
		}else if(a>=100) {
			sum=10*(0.1+0.075)+20*(0.05+0.03+0.015)+(a-100)*0.01;
		}
		System.out.println(sum);
	 }
}
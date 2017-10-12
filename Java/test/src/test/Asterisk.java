
//5.  打印一个由“*” 组成的倒立等腰三角形，一共6行，
//每行的星号的个数由下到上为1、3、5、7、9、11。
package test;

import javax.swing.JOptionPane;

public class Asterisk {
	
	
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("请输入所需的行数：");// 直接输入行数
		int l = Integer.parseInt(n);
		int k = l;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= l; j++)
			System.out.print(" ");
			l--;
		for (int j = 1; j <= i*2-1; j++) {
			System.out.print("*");// 显示星号
		}
			System.out.println();
		}
	}
	
}

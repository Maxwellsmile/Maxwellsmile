
//5.  ��ӡһ���ɡ�*�� ��ɵĵ������������Σ�һ��6�У�
//ÿ�е��Ǻŵĸ������µ���Ϊ1��3��5��7��9��11��
package test;

import javax.swing.JOptionPane;

public class Asterisk {
	
	
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("�����������������");// ֱ����������
		int l = Integer.parseInt(n);
		int k = l;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= l; j++)
			System.out.print(" ");
			l--;
		for (int j = 1; j <= i*2-1; j++) {
			System.out.print("*");// ��ʾ�Ǻ�
		}
			System.out.println();
		}
	}
	
}

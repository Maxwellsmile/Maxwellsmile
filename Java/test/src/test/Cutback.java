
//6.   �����ܣ������һ��Сд��ĸ������ĸ����5��λ�ú������
//��'a'���'f'��'w'���'b����
package test;

import java.util.Scanner;

public class Cutback {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ��Сд��ĸ��");	
		//java.lang.String.charAt() ��������ָ����������charֵ��
		char zm=scan.next().charAt(0);
		char tmp=(char)(zm+5);
		if(tmp>='z') {
			tmp=(char)(tmp-26);
		}
		System.out.print(tmp);
		
	}
}

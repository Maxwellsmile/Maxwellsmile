
//4.  ����1!+2!+����+10!�Ľ׳˺͡�
package test;

public class Factorial {
	public static void main(String[] args) {
		int temp=1,sum=0;
		for(int i=1;i<=10;i++){
		for(int j=1;j<=i;j++){
		temp*=j;
		}
		System.out.println(i+"�Ľ����"+temp);
		sum+=temp;
		temp=1;
		}
		System.out.println("1!+2!+����+10!�Ľ׳˺���"+sum);
		
	}
	
}

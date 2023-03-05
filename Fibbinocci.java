package day1.assignment;

import java.util.Iterator;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int n=11; int n1=0; int n2=1; int s=0;
		System.out.println(n1);
			
			for (int i = 1; i <= n; i++) {
				s=n1+n2;
				n1=n2;
				n2=s;
				System.out.println(s);
				
			}

	}

}

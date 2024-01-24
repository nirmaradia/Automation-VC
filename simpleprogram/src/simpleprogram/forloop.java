package simpleprogram;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int i,sum=0,n;  //find the n value 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A : ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=sum+i;
		}
		
			System.out.println("sum: "+sum);
		}
	}


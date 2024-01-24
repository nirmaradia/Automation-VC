//find the student Actuall result 

package simpleprogram;
import java.util.Scanner;

public class ladder {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name : ");
		sname=sc.next();//when we take string that time use only next()
		System.out.println("enter the roll number of student :");
		rno=sc.nextInt();
		System.out.println("enetr marks subject 1 : ");
		s1=sc.nextInt();
		System.out.println("enter marks subject 2 :");
		s2=sc.nextInt();
		System.out.println("enter marks subject 3 : ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("studant : "+sname);
		System.out.println("Roll No : "+rno);
		System.out.println("Total : "+total);
		System.out.println("percentage :"+per);
				
	
	if(per>70)
	{
		System.out.println("Distinction");
	
	}else if(per>=60)
	{
		System.out.println("first class");
	}
	else if(per>=80) {
		System.out.println("second class");
	}
	else if(per>=50) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}

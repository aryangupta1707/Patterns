package pattern;

import java.util.Scanner;

public class PascalTriangle {
	
	public static int binomail(int n,int k)
	{
		return factorial(n) / (factorial(k) * factorial(n-k));
	}
	
	public static int factorial(int num)
	{
		if(num==0 || num==1) return 1;
		
		return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int space=0;space<row-i-1 ;space++)
			{
				System.out.print(" "); //Add space for formatting
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(binomail(i, j)+ " ");
			}
			System.out.println();
		}
	}
	

}

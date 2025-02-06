package pattern;
/*
1 2 3 4 5 6 7 
2 3 4 5 6 7 1 
3 4 5 6 7 1 2 
4 5 6 7 1 2 3 
5 6 7 1 2 3 4 
6 7 1 2 3 4 5 
7 1 2 3 4 5 6 

 */
public class IncrementRowTillTheDiagonal {

	public static void main(String[] args) {
		
		int size=7;
		for(int i=1;i<=size;i++)
		{
			int temp1=i;
			int temp2=1;
			for(int j=1;j<=size;j++)
			{
				if(i+j<=size+1)
				{
					System.out.print(temp1++ +" ");
				}
				else System.out.print(temp2++ +" ");
			}
			System.out.println();
		}
	}
}

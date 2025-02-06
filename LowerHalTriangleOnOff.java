package pattern;
/*
1         
0 1       
0 1 0     
1 0 1 0   
1 0 1 0 1 
 */
public class LowerHalTriangleOnOff {

	public static void main(String[] args) {
		int size=5;
		int temp=1;
		
		for(int i=1 ;i<=size;i++)
		{	
			for(int j=1;j<=size;j++)
			{
				if(i>=j)
				{
					System.out.print(temp+ " ");
					temp=temp==1? 0: 1;
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}

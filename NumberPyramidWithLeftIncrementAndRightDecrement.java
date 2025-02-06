package pattern;
/*
      1       
    2 3 2     
  3 4 5 4 3   
4 5 6 7 6 5 4 

 */
public class NumberPyramidWithLeftIncrementAndRightDecrement {

	public static void main(String[] args) {
		
		int size=4;
		
		for(int i=1;i<=size;i++)
		{
			int temp=i;
			for(int j=1;j<=size*2-1;j++)
			{
				if(i+j>=size+1 && j-i<=size-1)
				{
					if(j>=size) System.out.print(temp-- +" ");
					else {
						System.out.print(temp++ +" ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

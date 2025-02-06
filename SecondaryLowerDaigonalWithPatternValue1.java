package pattern;
/*
        5 
      4 5 
    3 4 5 
  2 3 4 5 
1 2 3 4 5 
 */
public class SecondaryLowerDaigonalWithPatternValue1 {

	public static void main(String[] args) {
	
	int size=5;
	for(int i=1; i<=5;i++)
	{
		for(int j=1;j<=size;j++)
		{
			
			if(i+j>=size+1)
			{
				System.out.print(j+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}

}

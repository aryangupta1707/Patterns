package pattern;
/*
 *      1
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5 
 */
public class SecondaryLowerDaigonalWithStaticValue {

	public static void main(String[] args) {
		
		int size=5;
		for(int i=1;i<=size;i++)
		{
			int temp=i;
			for(int j=1;j<=size;j++)
			{
				if(j+i>=size+1)
					System.out.print(temp+" ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

package pattern;
/*
    1     
  2 2 2   
3 3 3 3 3 
 */
public class NumberPyramidStaticCloumns {

	public static void main(String[] args) {
		
		int size=3;
		
		for(int i=1;i<=size;i++)
		{
			int temp=i;
			for(int j=1;j<=size*2-1;j++)
			{
				if(i+j>=size+1 && j-i<=size-1){
					System.out.print(temp+ " ");
				}
				else {
					System.out.print("  ");
				}
				}
			System.out.println();
			}
		
		}
	}

package pattern;

import java.util.Iterator;

public class PyramidABC {

	public static void main(String[] args) {
		int size=26;
		
		for(int i=1;i<=size;i++)
		{
			char alpha='A';
			for(int j=1; j<=size*2-1 ;j++)
			{
				if(i+j>=size+1 && j-i<=size-1)
					
				{
					System.out.print(alpha++ +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

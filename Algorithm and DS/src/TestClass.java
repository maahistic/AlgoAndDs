import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		
		int row = s.nextInt();
		int col = s.nextInt();
		int [][] mArr = new int[row][col];
		Set<Integer> rowSet = new HashSet();
		Set<Integer> colSet = new HashSet();
		int max = 0,min = 0;
		int count = 1;
		for(int i = 0, j = 0; i<row && j< col ;j++)
		{
			mArr[i][j] = s.nextInt();
			if (j==col)
			{
				j=0;
				i++;
			}
			System.out.println(mArr[i][j]);
		}
		max = mArr[0][0];
		min = mArr[0][0];
		for (int x = 0, y = 0; x<row && y< col ;y++)
		{
			System.out.println(mArr[x][y]);
			if(mArr[x][y] > max)
			{
				max = mArr[x][y];
				if (x!=0 && y!= 0)
				{
				rowSet.add(x);
				colSet.add(y);
				}
			}
			else if (mArr[x][y] < min)
			{
				min = mArr[x][y];
				if (x!=0 && y!= 0)
				{
				rowSet.add(x);
				colSet.add(y);
				}
			}
			
			if (y==col-1)
			{
				y=0;
				x++;
			}
		}
		System.out.println(rowSet + " /n/n " + colSet);
	}
}

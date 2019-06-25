package Matrix;

public class Addition {
	 static final int  N = 3;
	public static void main (String[] agrs)
	{
	   int a[][] = {{1,2,3},{4,5,6},{7,8,9}};	
	   int b[][] = {{1,4,7},{2,5,8},{3,6,9}};
	   int c[][]= new int[N][N];
	   add(a,b,c);
	   for(int x=0;x<N;x++){
		   for(int y=0;y<N;y++)
			   System.out.print(c[x][y] + " ");
	           System.out.print("\n");
	   }
	}
	
	 static void add(int a[][],int b[][],int c[][])
	 {
		for(int i =0;i<N;i++)
			for(int j=0;j<N;j++)
				c[i][j] = a[i][j]+b[i][j];
	 }

}

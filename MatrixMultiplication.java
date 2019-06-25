
public class MatrixMultiplication {

	static int n = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {1, 1, 1, 1}, 
                {2, 2, 2, 2}, 
                {3, 3, 3, 3}, 
                {4, 4, 4, 4}};
		int mat1[][] = { {1, 1, 1, 1}, 
                {2, 2, 2, 2}, 
                {3, 3, 3, 3}, 
                {4, 4, 4, 4}};
		int res[][] = new int[n][n];
		multiplication(mat, mat1, res);
		 for (int i = 0; i < n; i++) 
	        { 
	            for (int j = 0; j < n; j++) 
	                System.out.print( res[i][j] 
	                                    + " "); 
	            System.out.println(); 
	        } 
       
	}
	
	static void multiplication(int a[][],int b[][],int c[][])
	{
		int i,j ,k;
		for( i=0;i<n;i++){
			for(j=0;j<n;j++){
				c[i][j]= 0;
		      for(k =0;k<n;k++)
		    	  c[i][j]+= a[i][k]*b[k][j];} 
		}
	}

}

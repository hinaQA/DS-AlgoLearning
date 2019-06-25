
public class SearchElementInMatrix {
	static final int n=5;
	public static void main(String[] agrs)
	{
		int m[][]= {{1,23,38,40,79},
				 {59,67,71,72,73},
				 {92,101,119,122,189},
				 {13,145,151,169,230}};
		int x= 72;
	findElement(m, x);
		
	}
	
	static void findElement(int m[][],int x)
	{
		int i=0,j=n-1;
		while(i <n && j >=0){
			if(m[i][j]==x){
				System.out.println(m[i][j] + " index " +i +" "+j );
				break;
			}
			else if(m[i][j]>x)
				j--;
			else
				i++;
		}
		return;
		
	}

}

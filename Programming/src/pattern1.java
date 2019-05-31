
public class pattern1 {
	
	public static void main (String args[]){
		
		
		int a;
		int b;
		a=0/2;
		b=1/2;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=6;i++){
			
			for(int j=5;j>=i;j--)
			{
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("#");
				
			}
			System.out.println();
		}
		


	}

}

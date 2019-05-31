import java.util.Arrays;

public class playwitharray {
	public static void main(String args[]){
		int arr[]= {28,11,99,51,60};
		System.out.println(arr[1]);
		System.out.println(arr.length);
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		String s2= "qqqqqdhdjdkqhhhaaaabbbcccaala";
		int s2length=s2.length();
		int count =0;
		for(int k=0; k<=s2length-1;k++){
			
			for(int l= k+1; l<=s2length-1;l++){
				if(s2.charAt(k)==s2.charAt(l)){
					count++;
				}
				break;
				
			}
	System.out.println(s2.charAt(k) +count);
		}
	}

}

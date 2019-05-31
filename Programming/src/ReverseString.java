import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]){
	Scanner sinput = new Scanner(System.in);//Taking input by keyboard
	System.out.println("Enter the String:");//Print the line
	String str=sinput.nextLine();//Taking string by keyboard
	String rev="";//declared
	int i;
	int len = str.length();
	System.out.println("The length of the String :" +" "  +len);
	for( i=len-1;i>=0;i--){
		rev= rev + str.charAt(i);
		System.out.println("The Charter at " + i +":  " + str.charAt(i));//Print the character at index
		
	}
	System.out.println("The Reverse String:"+" " +rev);//print the reverse string
	System.out.println(str.substring(0,3));//Print the substring
	System.out.println(str.hashCode());//print the hashcode
	System.out.println(str.replaceAll(rev, str));//Print the oring string again.
	System.out.println(str.replaceAll(" ", ""));//Print the string without space
	System.out.println(str.replaceAll("()+", " "));//Print the added space
	System.out.println(str.replaceAll("\\s+", " "));//Print the removal of multiple spaces
	String s2= "qqqqqdhdjdkqhhhaaaabbbcccaala";
	int s2length=s2.length();
	  char[] inp = s2.toCharArray();
	int count =0;
	for(int k=0; k<s2length;k++){
		
		for(int l= k+1; l<s2length;l++){
		//	if(s2.charAt(k)==s2.charAt(l))
			if (inp[k] == inp[l]){
				
				System.out.println(inp[l]  );
				count++;
				break;
			}
			
			
		}
	}
	}
	
}

public class palindrome{

public static void main(String args[]){
int x=666;
int orgnum=x;
int rev = 0;
int rem;
while(x!=0){

rem=x%10;
rev= rev*10 +rem;
x=x/10;




}
System.out.println("Number is " +rev);

if(rev==orgnum)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");

}
}

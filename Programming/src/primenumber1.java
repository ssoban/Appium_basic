import java.util.Scanner;
public class primenumber1{
	
	
public static void main(String args[]){
int count=1;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number");
	int z= s1.nextInt();
	int y= s1.nextInt();
	int i;
	for(i=z;i<=y;i++){
	
	if(i==0 || i==1)
	
{System.out.println("0 or 1 is not prime");}

else{
for(int j=i; j<=i/2;j++){
if(j%i==0){

count++;
break;
}

}
}
	}
if(count==1){
System.out.println("Number is not prime" +i );
}
else {
System.out.println("Number is  prime " +i);
}
}
}
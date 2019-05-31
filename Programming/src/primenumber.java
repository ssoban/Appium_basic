import java.util.Scanner;

public class primenumber{

	
public static void main(String args[]){
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number");
	int z= s1.nextInt();
	int y= s1.nextInt();

int x=28;
int count=1;
for(int i =2; i<=x/2;i++){
if(x%i==0){

count++;
break;
}



}
if(count==1){
System.out.println("Number is not prime ");
}
else {
System.out.println("Number is  prime ");
}

}


}
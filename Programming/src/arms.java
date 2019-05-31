public class arms{
public static void main(String args[]){
int x=155;
int orgnum=x;
//x=(1*1*1 +2*2*2 +3*3*3)

int c=0;
while(x!=0){

int rem=x%10;
c=c+(rem*rem*rem);
x=x/10;




}
System.out.println("Number is " +c);

if(c==orgnum)
System.out.println("Arms");
else
System.out.println("Not Arms");

}


}



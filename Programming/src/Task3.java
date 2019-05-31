class Task3{
int a;
int b;


public void setData2(int a ,int b){
	 

 System.out.println("Value of A ="+a);
 System.out.println("Value of B ="+b);
}
 public void setData(int a ,int b){
	 
 this.a = a;
  this.b = b;
  System.out.println("Value of A ="+a);
  System.out.println("Value of B ="+b);
 }
 
 public static void main(String args[]){
	 Task3 obj = new Task3();
   obj.setData(2,3);

   obj.setData2(2,5);
 }
}
public class findlargest{


public static void main(String args[]){
	
int[] arr= {23,666,8888, 20000, 4, 1, 300000000};

int largest=arr[0];
for (int i=0;i<arr.length;i++){

if(arr[i]>largest){
 largest=arr[i];
}
}

System.out.println(largest);

}





}
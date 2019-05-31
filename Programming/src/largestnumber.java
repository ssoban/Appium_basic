
public class largestnumber{
	
public static void main(String args[]){
	
	int[] array1={4,12,36,3,1};
	for(int i=0;i<=array1.length;i++){
		
		
		for(int j=i+1;j<=array1.length;j++){
			
			if(array1[i]<array1[j]){
				array1[i]=array1[j];
			}
		}
	}
	
	
}

}

import java.util.HashMap;
import java.util.Map;

public class finddupl{
public static void main(String args[]){


String s=" Syed mohammad Soban is good person";
char[] arr = s.toCharArray();


Map<Character,Integer> hm= new HashMap<Character,Integer>();

int count=1;
for(int i=0; i<arr.length;i++){
	
	if(Character.isAlphabetic(arr[i]))
if(hm.containsKey(arr[i])){

count= hm.get(arr[i]);
hm.put(arr[i], ++count);
}
else {
hm.put(arr[i],count);
}


}

System.out.println(hm);
}



}
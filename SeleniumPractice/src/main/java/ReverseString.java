import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hai Java World Welcome!";
        String str2[] = str.split(" ");
        
        //Normal
//        for(int i=0;i<str2.length;i++){
//            for(int j=str2[i].length()-1;j>=0;j--){
//                System.out.print(str2[i].charAt(j));
//            }
//            System.out.print(" ");
//        }
        
        //Using lists
        List<String> li = Arrays.asList(str2);
        for(int i=0; i<li.size();i++) {
        	for(int j=li.get(i).length()-1;j>=0;j--) {
        		System.out.print(li.get(i).charAt(j));
        	}
        	System.out.print(" ");
        }
	}

}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Arrays.sort example
public class Sorting {
    public static void main(String[] args) {
        
    	//Array sorting
    	Integer[] instruments = {3, 2, 5, 10, 8, 5, 7};

        Arrays.sort(instruments);

        System.out.println("Sorted Instruments:");
        for (int instrument : instruments) {
            System.out.println(instrument);
        }
        
        //List sorting
        List<Integer> numbers = Arrays.asList(instruments);
        Collections.sort(numbers);
        numbers.sort(null);
        System.out.println("Sorted List: " + numbers);
        
        //Using Streams
        List<Integer> num = numbers.stream().sorted().toList();
        System.out.println("Streams: "+ num);
        
        
    }
}
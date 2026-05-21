//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;

import java.util.*;

import com.sun.tools.javac.code.Attribute.Array;

public class SecLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Using Lists
		Integer num[]={2,5,3,8,10};
		List<Integer> numL = Arrays.asList(num);
//		numL.sort(Comparator.naturalOrder());
//		Collections.sort(numL);
//		System.out.println(numL.get(0));
		
		List<Integer> sortedL = numL.stream().sorted().toList();
		System.out.println(sortedL.get(1));
		
	}

}

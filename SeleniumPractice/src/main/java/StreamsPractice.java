import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int len=0;
		String[] name = {"Vikash", "Srija", "Sweety", "Gayatri", "Pavan", "Pooja"};
		List<String> names = Arrays.asList(name);
		System.out.println(names.stream().filter(s -> s.startsWith("S")).count());		
		names.stream().filter(s -> s.endsWith("a")).forEach(a->System.out.println(a));
		List<String> out =  names.stream().filter(s -> s.length()>5).sorted().map(a->a.toUpperCase()).collect(Collectors.toList());
		out.stream().forEach(s->System.out.println(s));
		
		
		
	}

}

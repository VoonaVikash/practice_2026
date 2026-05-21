
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name ="Amrutha";
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.print(name.charAt(i));
//		}
//		System.out.println();
		
		String yamuna[] = {"Navya", "Lohitha", "Amrutha", "Akhila"};
//		System.out.println(yamuna[2]);
		for(int i=0;i<yamuna.length;i++)
			System.out.println(yamuna[i]);
		
		for(String n: yamuna) {
			System.out.println(n);
		}
		
//		int age = 15;
//		if(age>=18) {
//			System.out.println("Eligible for voting");
//		}else {
//			System.out.println("Not eligible for voting");
//		}
	}

}
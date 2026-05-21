
public class FibonacciSeries {

	public static void main(String[] args) {
        int a = 2, b = 3;
        int count=1;

        while(a<=1000) {
        	System.out.print(a+" ");
        	if(count==4) {
        		System.out.print(0+" "+0+" ");
        		count=0;
        	}
        	int next = a+b;
        	a=b;
        	b=next;
        	count++;
        }
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.print(a+" "+b);
	}

}

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//For
		
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti..");
		
		//While
		
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While dongusu bitti..");
		
		//Do-While
		int j = 2;
		do {
			System.out.println("Loglandi");
			System.out.println(j);
			j += 2;
		} while(j < 10);
		System.out.println("Do-While dongusu bitti..");

	}

}

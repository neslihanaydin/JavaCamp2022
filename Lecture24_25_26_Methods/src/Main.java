
public class Main {

	public static void main(String[] args) {
		
		//Lecture 24
		//findTheNumber();
		
		//Lecture 25
		String msg = "It's such a beautiful day!";
		String newMsg = msg.substring(0,4);
		String newMsg2 = getCity();

		System.out.println(msg);
		System.out.println(newMsg);
		System.out.println(newMsg2);
		
		//Lecture 26
		
		int total = sumNumbers(2,3,4,5,6,10);
		System.out.println(total);

	}
	
	
	
	public static void findTheNumber() {
		int[] numbers = new int[] {1,2,3,5,6,8};
		int lookingNumber = 9;
		boolean isInclude = false;
		
		for (int number : numbers) {
			if( number == lookingNumber) {
				isInclude = true;
				break;
			}
		}
		
		if(isInclude) {
			System.out.println("The list has the number. The number is : " + lookingNumber);
		} else {
			System.out.println("The number is not here. The number is : " + lookingNumber);
		}
			
	}
	


	public static void add() {
		//something output
	}
	
	public static void remove() {
		//something output

	}
	
	public static void update() {
		//something output

	}
	
	public static String getCity() {
		return "Vancouver";
	}
	
	public static int sumNumbers(int... numbers ) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
	}

}

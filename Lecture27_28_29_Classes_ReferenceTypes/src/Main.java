
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManagerNew = new CustomerManager();
		customerManager = customerManagerNew;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		System.out.println(customerManager.checkCustomerIsNew);
		System.out.println(customerManagerNew.checkCustomerIsNew); //Reference type, they can effect them together.
		
		//value
		
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num1);
		System.out.println(num2);
		
		
		//arrays ?
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 50;
		System.out.println(numbers2[0]); //Arrays are reference type
	}

}


public class CustomerManager {

	public int checkCustomerIsNew = 1;
	public void Add() {
		System.out.println("The customer added.");
	}
	public void Remove() {
		System.out.println("The customer removed.");
	}
	public void Update() {
		System.out.println("The customer updated.");
		checkCustomerIsNew = 2;
	}
}

package org.company;
import org.client.*;
public class Company extends Client {
	private void companyName() {
		System.out.println("Company Name:Greens");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();c.clientName();

	}

}

package org.cap.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
						System.out.println("Hello World!!.........");
						ProductDetails products=new ProductDetails();
						SalesClass class1=new SalesClass();
						greet();
						class1.show();
						products.productDetails();

	}
	
	public static void greet() {
		System.out.println("Hellooo...");
		System.out.println("Swaroopaaa..");
		for(int i=0;i<5;i++) {
			System.out.println("haii"+i);
		}
	}

}

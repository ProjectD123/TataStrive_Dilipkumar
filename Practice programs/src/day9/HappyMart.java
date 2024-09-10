package day9;

import java.util.Arrays;

public class HappyMart {
	public static void main(String[] args) {
		Product[] products = { new Product(2002, "Adapter", 4000), new Product(2045, "Mouse", 150),
				new Product(5353, "Laptop", 50000), new Product(3423, "Modam", 3400), new Product(3555, "Keyboard", 500)
		};
		
		Arrays.sort(products,new SortByPrice());
		Arrays.sort(products,new SortById());
		Arrays.sort(products,new SortByName());
		
		System.out.println("Original");
		for(int i =0;i<products.length;i++) {
		System.out.println(products[i]);
		}
		
		
														/*LAMBDA EXPRESION
		
		
														
														/*System.out.println("Id");
														
														Arrays.sort(products, (o1,o2)->o1.getProductId()-o2.getProductId());
														
														System.out.println("-------------------------");
														
														for(Product p :products) {
															System.out.println(p);
														}
														
														System.out.println("Name");
												      Arrays.sort(products, (o1,o2)->o1.getProductName().compareTo(o2.getProductName()));
														
														System.out.println("-------------------------");
														
														for(Product p :products) {
															System.out.println(p);
														}
														
														System.out.println("Price");
												     Arrays.sort(products, (o1,o2)->Double.compare(o1.getPrice(), o2.getPrice()));
														
														System.out.println("-------------------------");
														
														for(Product p :products) {
															System.out.println(p);
														}*/
														
		

	}

}

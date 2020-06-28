package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {

		String[] cars = { "BMW", "Toyota", "Nissan", "Tesla", "Ferrari", "Ford" };

		for (String car : cars) {

			System.out.println(car);

		}
		
		System.out.println("------------");

		int [] num = {10,20,40,50,70};
		
		int sum =0;
		for (int i = 0; i<num.length;i++ ) {
			sum +=num[i];
			
		}
		System.out.print(sum);
		
		System.out.println("\n--------------");
		
		String[] countries = { "Ukraine", "Italy", "France", "Spain"};
		

		for (String s:countries) {
			
			String capital = null;
			switch(s) {
			case "Ukraine":
				capital = "Kyiv";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Spain":
				capital = "Madrid";
				break;
				default:
				
				
			}
			
			System.out.println("The capital of " + s + " is " + capital  );
		
		
			
			}
		
		
	}

}

package application;

import entities.Lasagna;

public class Program {

	public static void main(String[] args) {
		var lasagna = new Lasagna();
		
		System.out.println(lasagna.expectedMinutesInOven());
		System.out.println(lasagna.remainingMinutesInOven(30));
		System.out.println(lasagna.preparationTimeInMinutes(2));
		System.out.println(lasagna.totalTimeMinutes(3, 20));

	}

}

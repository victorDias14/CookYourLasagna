package entities;

public class Lasagna {
	
	private int expectedMinutes = 40;
	
	public int expectedMinutesInOven() {
		return expectedMinutes;
	}
	
	public int remainingMinutesInOven(int minutes) {
		return expectedMinutes - minutes;
	}
	
	public int preparationTimeInMinutes(int layers) {
		return layers * 2;
	}
	
	public int totalTimeMinutes(int layers, int minutes) {
		return preparationTimeInMinutes(layers) + minutes;
	}

}

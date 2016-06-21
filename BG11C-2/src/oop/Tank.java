package oop;

public class Tank {
	double capacity, max_capacity;
	String type;
	
	public double getCapacity() {
		return capacity;
	}

	public double getMax_capacity() {
		return max_capacity;
	}

	public String getType() {
		return type;
	}

	public Tank(double max_capacity, String type) {
		this.max_capacity = max_capacity;
		this.type = type;
	}
	
	public boolean fill(double amount) {
		if(capacity + amount > max_capacity)
			return false;
		
		capacity += amount;
		return true;
	}
	
	public boolean entnehmen(double amount) {
		if(amount > capacity)
			return false;
		
		capacity -= amount;
		return false;
	}

	public static void main(String[] args) {
	}

}

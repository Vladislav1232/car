package mda.ush.ok;

public class Car {
	
	private static final int TANK_CAPACITY = 100;

	private Wheel leftRearWheel;
	private Wheel rightRearWheel;
	private Wheel leftFrontWheel;
	private Wheel rightFrontWheel;
	private String model;
	private int fuel; 
	private int mileage;
	
	public Car(Wheel leftRearWheel, Wheel rightRearWheel, Wheel leftFrontWheel, Wheel rightFrontWheel, String model) {
		this.leftRearWheel = leftRearWheel;
		this.rightRearWheel = rightRearWheel;
		this.leftFrontWheel = leftFrontWheel;
		this.rightFrontWheel = rightFrontWheel;
		this.model = model;
		this.fuel = 0;
		this.mileage = 0;
	}
	
	public void drive(int distance) {
		if(fuel * 10 >= distance ) {
			mileage += distance;
			fuel -= distance / 10;
			System.out.println("Пробег: " + mileage + "\nОстаток топлива: " + fuel);
		} else {
			System.out.println("Недостаточно топлива ");
		}		
	}
	
	public void fill(int liters) {
		if (fuel + liters <= TANK_CAPACITY) {
			fuel += liters;
			System.out.println("Машина успешно заправлена. Остаток топлива: " + fuel);
		} else {
			System.out.println("Столько топлива не влезет. Можно заправить: " + (TANK_CAPACITY - fuel));
		}
	}
	
	public void printModel() {
		System.out.println(model);
	}
	
	public void changeLeftRearWheel(Wheel newWheel) {
		leftRearWheel = newWheel;
	}
	
	public void changeRightRearWheel(Wheel newWheel) {
		rightRearWheel = newWheel;
	}
	
	public void changeLeftFrontWheel(Wheel newWheel) {
		leftFrontWheel = newWheel;
	}
	
	public void changeRightFrontWheel(Wheel newWheel) {
		rightFrontWheel = newWheel;
	}

	public Wheel getLeftRearWheel() {
		return leftRearWheel;
	}

	public Wheel getRightRearWheel() {
		return rightRearWheel;
	}

	public Wheel getLeftFrontWheel() {
		return leftFrontWheel;
	}

	public Wheel getRightFrontWheel() {
		return rightFrontWheel;
	}
	
	
}


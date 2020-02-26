package mda.ush.ok;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel wheel1 = new Wheel();
		Wheel wheel2 = new Wheel();
		Wheel wheel3 = new Wheel();
		Wheel wheel4 = new Wheel();
		Car car = new Car(wheel1, wheel2, wheel3, wheel4, "Mercedes");
		car.fill(100);
		car.drive(100);
		car.printModel();
		System.out.println("id левого переднего колеса: " + car.getLeftFrontWheel().getId());
		Wheel newWheel = new Wheel();
		car.changeLeftFrontWheel(newWheel);
		System.out.println("id левого переднего колеса после замены: " + car.getLeftFrontWheel().getId());
	}

}

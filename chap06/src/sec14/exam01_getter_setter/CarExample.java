package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		myCar.setStop(true);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());

	}
}

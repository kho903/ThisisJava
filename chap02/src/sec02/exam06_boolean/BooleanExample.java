package sec02.exam06_boolean;

public class BooleanExample {

	public static void main(String[] args) {

		boolean stop = true;

		if (stop) {
			System.out.println("중지");
		}else {
			System.out.println("시작");
		}
		stop = false;

		if (stop) {
			System.out.println("중지");
		}else {
			System.out.println("시작");
		}
	}

}

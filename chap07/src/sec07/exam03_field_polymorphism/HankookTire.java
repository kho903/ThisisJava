package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s HankookTire ���� : %d\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s HankookTire ��ũ ***\n", location);
			return false;
		}
	}
}

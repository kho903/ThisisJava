package sec07.exam01_constructor;

public class KeyboardToString {
	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100];

		System.out.print("�Է� : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);

	}
}

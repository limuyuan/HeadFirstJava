public class MathTest {
	public static void main(String[] args) {
		Math.max(10, 20);
		int b;
		System.out.println("test!");
		BBB bbb = new BBB();
		bbb.atest();
	}

}
class BBB {
	int size = 100;

	public int getSize() {
		return 5;
	}

	public void atest() {
		MathTest test = new MathTest();
		String[] aStrings = {};
		test.main(aStrings);
	}


}

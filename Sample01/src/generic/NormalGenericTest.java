package generic;

public class NormalGenericTest {
	public static void main(String[] args) {
		NormalGeneric<Integer> g = new NormalGeneric<Integer>();
		g.setId(13);
		TestClass.testFunc(g);
	}
}

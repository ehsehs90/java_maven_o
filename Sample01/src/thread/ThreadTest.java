package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Line t1 = new Line("line01");
		Line t2 = new Line("line02");
		t1.start();
		t2.start();
	}

}

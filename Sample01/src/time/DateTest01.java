package time;

import java.util.Calendar;
import java.util.Date;

public class DateTest01 {

	public static void main(String[] args) {
		Date date = new Date();
		//Calendar cal = new Calendar();
		//Calendar는 abstract class 이므로 new를 통해 인스턴스를 생성할 수 없다.
		Calendar cal = Calendar.getInstance();
	}

}

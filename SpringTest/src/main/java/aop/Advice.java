package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void log(Object data) {
		System.out.println("=====log start======");
//		System.out.println(jp.toShortString());
		System.out.println(data.toString());
		System.out.println("=====log end======");
	}
	
	public Object around(ProceedingJoinPoint pp) throws Throwable {
		Object obj;
		System.out.println("=====around start======");
		obj = pp.proceed();
		System.out.println("=====around end======");
		return obj;
	}
}

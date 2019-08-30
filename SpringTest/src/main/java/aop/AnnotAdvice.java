package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotAdvice {
	@Pointcut("execution(* test.CutClass.cutOut(..))")
	public void pointCut() {}
	
	@Before("pointCut()")
	public void log(JoinPoint jp) {
		System.out.println("====before start=====");
		System.out.println(jp.toShortString());
		System.out.println("====before end=====");
	}
	
	@AfterReturning(pointcut = "pointCut()", returning = "data")
	public void after_Throwing(JoinPoint jp, Object data) {
		System.out.println("====after start=====");
		System.out.println(jp.toShortString());
		System.out.println(data.toString() );
		System.out.println("====after end=====");
	}
}

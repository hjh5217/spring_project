package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component 가능은 하지만 용어의 편의상으로 Service로 주로 사용

public class AnoAdvice {
	
	@Before("execution(* aop_p.webToon..* (..))")
	void beforeee(JoinPoint joinPoint) {
		System.out.println("beforeee:"+joinPoint.getSignature().toShortString());
	}
	//ProceedingJoinPoint 는 around 에서만 가능함
	//void afterrr(ProceedingJoinPoint joinPoint) {
	//	System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	//}
	
	@Pointcut("execution(* aop_p.webToon..* (..))")
	void pppiii() {}
	
	@After("pppiii()")
	void afterrr(JoinPoint joinPoint) {
		System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	}
	@AfterReturning(pointcut = "pppiii()", returning = "qq")
	void returnnn(JoinPoint joinPoint,Object qq) {
		System.out.println("returnnn:"+joinPoint.getSignature().toShortString());
	}
	@AfterThrowing(pointcut = "pppiii()", throwing = "ee")
	void errrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println("errrrrrr:"+joinPoint.getSignature().toShortString()+ee.getMessage());
	}
}

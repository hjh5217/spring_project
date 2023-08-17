package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceAdvice {
	
	void beforeee(JoinPoint joinPoint) {
		System.out.println("beforeee:"+joinPoint.getSignature().toShortString());
	}
	//ProceedingJoinPoint 는 around 에서만 가능함
	//void afterrr(ProceedingJoinPoint joinPoint) {
	//	System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	//}
	void afterrr(JoinPoint joinPoint) {
		System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	}
	void returnnn(JoinPoint joinPoint,Object qq) {
		System.out.println("returnnn:"+joinPoint.getSignature().toShortString());
	}
	void errrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println("errrrrrr:"+joinPoint.getSignature().toShortString()+ee.getMessage());
	}
}

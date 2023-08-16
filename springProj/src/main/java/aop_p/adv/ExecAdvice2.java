package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ExecAdvice2 {
	
	void ok(JoinPoint joinPoint) {
		System.out.println("ExecAdvice2 - ok"+joinPoint.getSignature().toShortString());
	}
	void oj(JoinPoint joinPoint) {
		System.out.println("ExecAdvice2 - oj"+joinPoint.getSignature().toShortString());
	}
}

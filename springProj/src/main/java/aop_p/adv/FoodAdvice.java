package aop_p.adv;

import java.util.ArrayList;
import java.util.Arrays;

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

import aop_p.model.Menu;

//@Component 가능은 하지만 용어의 편의상으로 Service로 주로 사용
@Service
@Aspect
public class FoodAdvice {

	//ProceedingJoinPoint 는 around 에서만 가능함
	//void afterrr(ProceedingJoinPoint joinPoint) {
	//	System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	//}
	
	@Pointcut("execution(* aop_p.webToon..* (..))")
	void pppiii() {}
	
	@After("pppiii()")
	void afterrr(JoinPoint joinPoint) {
		System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
		System.out.println(Arrays.toString(joinPoint.getArgs()));	
		ArrayList<Menu> menu = (ArrayList<Menu>) joinPoint.getArgs()[0];
		int jjigae = 0;
		int dupbab = 0;
		System.out.println("=================주문내역 및 계산==================");
		for(Menu m : menu) {
			if(m.getKind().equals("찌개")) {
				jjigae++;
			}else if(m.getKind().equals("덮밥")) {
				dupbab++;
			}
			if(m.getPrice() < 10000) {
				int price = m.getPrice();
				m.setPrice(price+3000);
				System.out.println(m+" 배달비 추가! "+(m.getPrice()-3000)+" + 3000원");
			}else {
				System.out.println(m);
			}
			
		}
		System.out.println("찌개 : "+jjigae+"개"+", 덮밥 : "+dupbab+"개");
	}
}
/*
 * 
 * 식당 주문을 구현하세요
 * 주문 종류에 따라 갯수를 구하세요
 * 종류
 * 찌개 덮밥
 * 가격이 10000 미만인 경우 배달비를 추가하세요
 * 종류와 배달비 계산은 aop, annotation 으로 처리
 * 
 * 
 */
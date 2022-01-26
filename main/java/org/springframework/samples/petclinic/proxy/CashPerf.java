package org.springframework.samples.petclinic.proxy;
//프록시
//빈이 등록될때 자동으로 만들어진다고 생각!

import org.springframework.util.StopWatch;

public class CashPerf implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amount){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		cash.pay(amount);

		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}
}

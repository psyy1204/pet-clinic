package org.springframework.samples.petclinic.proxy;
//storetest에서 성능측정되도록(프록시가 이용되도록)
//새로운 코드를 추가했지만 기존 코드를 건드리지 않았음

public class Store {

	Payment payment;

	public Store(Payment payment){  //생성자
		this.payment = payment;
	}

	public void buySomething(int amount){
		payment.pay(amount);
	}
}

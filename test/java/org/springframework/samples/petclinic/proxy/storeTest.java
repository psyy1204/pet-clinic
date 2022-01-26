package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class storeTest {

	@Test
	public void testPay() {
		CashPerf cashPerf = new CashPerf();
		Store store = new Store(cashPerf);
		store.buySomething(100);
	}

}



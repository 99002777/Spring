package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.examples.Bank;
import com.training.examples.ExceedingException;
import com.training.examples.NegValueException;

class BankTest {
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Test");
		bank=new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		bank=null;
		System.out.println("After Test");
	}

	@Test
	void testWithdraw() throws ExceedingException{
		double balance=bank.withdraw(2000);
		assertEquals(6000,balance,"should be 6000");

	}
	@Test
	void testwithdrawExceeding() {
		//double balance=bank.withdraw(4000);
		assertThrows(ExceedingException.class,()-> bank.withdraw(4100));
			//throw new ExceedingException("amount is greate than 4000");
	}
	
	@Test
	void testwithdrawNeg() {
		
		assertThrows(NegValueException.class,()-> bank.withdraw(-900));
		
	}

	@Test
	void testwithdrawEq() {
		
		assertThrows(ExceedingException.class,()-> bank.withdraw(8000));
		
	}

	@Test
	void testDeposit() {
		double deposit=bank.deposit(2000);
		assertEquals(10000,deposit,"should be 10000");

	}
	@Test
	void testDepositNeg() {
		assertThrows(NegValueException.class,()->bank.deposit(-900));

	}
	@Test
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.deposit(5000));

	}
	
	@Test
    void testAverage() throws NegValueException {
        double actual=bank.avg(1,2,3);
        assertEquals(2,actual);
    }
    @Test
    void testAverageNegative() throws NegValueException {
        assertThrows(NegValueException.class,()->bank.avg(-1, -2, -3));
       
    }

}

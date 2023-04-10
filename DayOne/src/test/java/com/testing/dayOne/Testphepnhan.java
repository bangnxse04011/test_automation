package com.testing.dayOne;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Testphepnhan {
	@Test
	public void Testnhanso1am () {
		int number1 = -1;
		int number2 = 10;
		int expect = 5;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
	@Test
	public void Testnhanso2duong () {
		int number1 = 5;
		int number2 = 1;
		int expect = -5;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
	@Test
	public void Testnhansai () {
		int number1 = 10;
		int number2 = 2;
		int expect = 21;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
	@Test
	public void Testnhanam () {
		int number1 = -10;
		int number2 = -2;
		int expect = 20;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
	@Test
	public void Testnhandung () {
		int number1 = 10;
		int number2 = 3;
		int expect = 30;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
	@Test
	public void Testnhanabs () {
		int number1 = 10;
		int number2 = -3;
		int expect = 20;
		int actual = MathUtil.nhan(number1, number2);
		Assert.assertEquals(expect, actual);
	}
}

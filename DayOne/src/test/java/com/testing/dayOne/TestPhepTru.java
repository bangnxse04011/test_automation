package com.testing.dayOne;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPhepTru {
	@Test
	public void testpheptru() {
		int so1 = 10;
		int so2 = 3;
		int kqd = 7;
		int kq = MathUtil.tru(so1, so2);
		Assert.assertEquals(kqd, kq);
	}

	@Test
	public void testpheptrusai() {
		int so1 = 10;
		int so2 = 3;
		int kqd = 7;
		int kq = MathUtil.tru(so1, so2);
		Assert.assertNotEquals(kqd, kq);
	}
}

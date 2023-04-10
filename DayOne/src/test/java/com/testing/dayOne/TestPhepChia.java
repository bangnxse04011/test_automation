package com.testing.dayOne;

import org.junit.Assert;
import org.junit.Test;

//Khai bao day la class test. =  control + space
public class TestPhepChia {

	// Dinh nghia 1 cai ham - function ten la testPhepChia
	@Test
	public void testPhepChia() {

		int soThu1 = 9;
		int soThu2 = 3;

		int ketQuaDung = 3;

		int ketQua = MathUtil.chia(soThu1, soThu2);

		// So sanh ketQua va ketQuaDung co = nhau ko
		Assert.assertEquals(ketQuaDung, ketQua);

//		int -> so nguyen
//		String -> kieu chu
//		double -> so thap phan
//		float -> so thap phan
	}
	
	// Dinh nghia 1 cai ham - function ten la testPhepChia
		@Test
		public void testPhepChiaSai() {

			int ketQuaDung = 6;

			int ketQua = MathUtil.chia(10, 2);

			// So sanh ketQua va ketQuaDung co = nhau ko
			Assert.assertEquals(ketQuaDung, ketQua);

//			int -> so nguyen
//			String -> kieu chu
//			double -> so thap phan
//			float -> so thap phan
		}
}

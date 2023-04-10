package com.testing.dayTwo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPerson {

	@Test
	public void testPerson() {

		// Lay ra toan bo danh sach casc ban hoc dot dang co
		List<Person> thongTinCacBanHocDot = Person.danhSachBanHocDotTrongLop();
//		int soBanCoTuoiLH10 = 1;

		Person nguoiTenLaDien = null;

		for (Person person : thongTinCacBanHocDot) {
			// kiem tra casc dieu kien trong nay
			if (person.ten.equalsIgnoreCase("Pham Thi Dien")) {
//				equalsIgnoreCase -> so sanh voi kieu chu va ko phan biet hoa thuong Dien = dien = DIEN
				// neu tuoi > 10 thi lam cac viec o day
				nguoiTenLaDien = person;
			}
		}
		System.out.println("Tester tim duoc roi");
		Assert.assertEquals("Pham Thi Dien", nguoiTenLaDien.ten);
	}
}

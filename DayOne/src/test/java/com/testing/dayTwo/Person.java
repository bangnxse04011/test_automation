package com.testing.dayTwo;

import java.util.ArrayList;
import java.util.List;

public class Person {

	// cac thuoc tinh
	public String ten;
	public String diaChia;
	public int tuoi;
	public double diemSo;

	// Tao khai bao class con nguoi voi casc thuoc tinh
	public Person(String ten, String diaChia, int tuoi, double diemSo) {
		super();
		this.ten = ten;
		this.diaChia = diaChia;
		this.tuoi = tuoi;
		this.diemSo = diemSo;
	}

	// khia bao danh sach con nguoi
	public static List<Person> danhSachBanHocDotTrongLop() {

		// Khoi tao thong tin cac ban hoc dot
		List<Person> thongTinBanHocDot = new ArrayList<>();

		Person dien = new Person("Pham Thi Dien", "Ha noi", 29, 9);

		Person vietAnh = new Person("Viet Anh", "Ha noi", 2, 10);

		// add cac ban vao danh sach hoc dot
		thongTinBanHocDot.add(dien);
		thongTinBanHocDot.add(vietAnh);

		return thongTinBanHocDot;

	}

}

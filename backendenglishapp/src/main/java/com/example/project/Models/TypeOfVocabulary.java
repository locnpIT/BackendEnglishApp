package com.example.project.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypeOfVocabulary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String tenLoaiTuVung;
	
	private String hinhAnh;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoaiTuVung() {
		return tenLoaiTuVung;
	}

	public void setTenLoaiTuVung(String tenLoaiTuVung) {
		this.tenLoaiTuVung = tenLoaiTuVung;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
	
	
	
}

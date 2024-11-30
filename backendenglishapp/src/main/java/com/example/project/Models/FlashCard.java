package com.example.project.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flashcard")
public class FlashCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// front
	private String tuVung;
	
	private String amThanh;
	
	private String phienAm;
	
	private String cachDung;
	
	
	//back
	private String dichNghia;
	
	private String hinhAnh;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTuVung() {
		return tuVung;
	}

	public void setTuVung(String tuVung) {
		this.tuVung = tuVung;
	}

	public String getAmThanh() {
		return amThanh;
	}

	public void setAmThanh(String amThanh) {
		this.amThanh = amThanh;
	}

	public String getPhienAm() {
		return phienAm;
	}

	public void setPhienAm(String phienAm) {
		this.phienAm = phienAm;
	}

	public String getCachDung() {
		return cachDung;
	}

	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}

	public String getDichNghia() {
		return dichNghia;
	}

	public void setDichNghia(String dichNghia) {
		this.dichNghia = dichNghia;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	
	
	
	
	
	
	
	
	
	
}

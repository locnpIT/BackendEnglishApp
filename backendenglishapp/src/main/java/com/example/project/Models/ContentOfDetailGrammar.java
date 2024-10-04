package com.example.project.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ContentOfGrammarDetail")
public class ContentOfDetailGrammar {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String congThuc;
	
	private String cachDung;
	
	private String luuY;
	
	private String viDu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCongThuc() {
		return congThuc;
	}

	public void setCongThuc(String congThuc) {
		this.congThuc = congThuc;
	}

	public String getCachDung() {
		return cachDung;
	}

	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}

	public String getLuuY() {
		return luuY;
	}

	public void setLuuY(String luuY) {
		this.luuY = luuY;
	}

	public String getViDu() {
		return viDu;
	}

	public void setViDu(String viDu) {
		this.viDu = viDu;
	}
	
	
	
	
	

}

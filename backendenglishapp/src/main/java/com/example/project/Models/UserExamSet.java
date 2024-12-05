package com.example.project.Models;

import java.time.Instant;

import jakarta.persistence.*;

@Entity
public class UserExamSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "exam_set_id", nullable = false)
    private ExamSet examSet;
    
    private int diem;
    
    private Instant createdAt;
    
    @PrePersist
    public void handleBeforeCreate() {
        this.createdAt = Instant.now();
    }

    

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ExamSet getExamSet() {
        return examSet;
    }

    public void setExamSet(ExamSet examSet) {
        this.examSet = examSet;
    }




	public int getDiem() {
		return diem;
	}




	public void setDiem(int diem) {
		this.diem = diem;
	}




	public Instant getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
    
    
}
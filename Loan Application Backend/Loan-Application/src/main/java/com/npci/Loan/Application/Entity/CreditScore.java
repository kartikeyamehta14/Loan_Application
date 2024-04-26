package com.npci.Loan.Application.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CreditScore")

public class CreditScore {
    @Id
    @Column(name = "pan")
    private String pan;

    @Column(name = "score")
    private int score;

    // Constructors
    public CreditScore() {
    }

    public CreditScore(String pan, int score) {
        this.pan = pan;
        this.score = score;
    }

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CreditScore [pan=" + pan + ", score=" + score + "]";
	}
    
    
    
}

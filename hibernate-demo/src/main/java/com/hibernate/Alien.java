package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Alien {

	@Id
	private int alien_id;
	private String alien_name;
	
	@Transient
	private String tech;

	public int getAlien_id() {
		return alien_id;
	}

	public void setAlien_id(int alien_id) {
		this.alien_id = alien_id;
	}

	public String getAlien_name() {
		return alien_name;
	}

	public void setAlien_name(String alien_name) {
		this.alien_name = alien_name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [alien_id=" + alien_id + ", alien_name=" + alien_name + ", tech=" + tech + "]";
	}

}

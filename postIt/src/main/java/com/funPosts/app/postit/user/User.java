package com.funPosts.app.postit.user;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


public class User {
	
	@Override
	public int hashCode() {
		return Objects.hash(birthDate, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	private Integer id;
	
	@Size(min = 2,message="Name should have atleast 2 characters")
	private String name;
	
	@Past(message="DOB should always be in past")
	private LocalDate birthDate;
	
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}

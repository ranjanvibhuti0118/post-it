package com.funPosts.app.postit.versioning;

public class PersonV1 {

	
	private String name;
//	private String lastName;
	
	public PersonV1(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

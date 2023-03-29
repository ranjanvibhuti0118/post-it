package com.funPosts.app.postit.versioning;

import lombok.Data;

@Data
public class PersonV2 {
	
	public PersonV2(Name name) {
		this.name= name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	private Name name;

}

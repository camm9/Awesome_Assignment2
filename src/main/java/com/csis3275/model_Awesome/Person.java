package com.csis3275.model_Awesome;

public class Person {
	
	private String bio;
	private String image;
	private String name;
	private int age;
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Person(){
		
	}
	
	Person(String bio, String image, String name, int age){
		this.bio = bio;
		this.image = image;
		this.name = name;
		this.age = age;
	}

}

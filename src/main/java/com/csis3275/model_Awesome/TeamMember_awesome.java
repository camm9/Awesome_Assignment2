package com.csis3275.model_Awesome;

public class TeamMember_awesome {
	
	private String bio;
	private String image;
	private String name;
	private int age;
	private String roleName;
	private String linkedinUrl;
	private String githubUrl;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getGithubUrl() {
		return githubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}

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

//Edi: Constructor full
	public TeamMember_awesome(String bio, String image, String name, int age, String rollName, String indeedUrl, String githubUrl) {
		super();
		this.bio = bio;
		this.image = image;
		this.name = name;
		this.age = age;
		this.roleName = rollName;
		this.linkedinUrl = indeedUrl;
		this.githubUrl = githubUrl;
	}
//Edi: Constructor empty
	public TeamMember_awesome(){
		
	}
	
	//Comment out person java old constructor
//	Person(String bio, String image, String name, int age){
//		this.bio = bio;
//		this.image = image;
//		this.name = name;
//		this.age = age;
//	}

}

package csis3275.model_Awesome;

public class Student_wva_06 extends Person{
	
	private String rollName;
	private String indeedUrl;
	private String githubUrl;
	
	
	String bio;
	String image;
	String name;
	int age;
	
	public Student_wva_06(String bio, String image, String name, int age, String rollName,  String indeedUrl, String githubUrl) {
		super();
		this.rollName = rollName;
		this.indeedUrl = indeedUrl;
		this.githubUrl = githubUrl;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	public String getIndeedUrl() {
		return indeedUrl;
	}

	public void setIndeedUrl(String indeedUrl) {
		this.indeedUrl = indeedUrl;
	}

	public String getGithubUrl() {
		return githubUrl;
	}

	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	
	
	
	

}

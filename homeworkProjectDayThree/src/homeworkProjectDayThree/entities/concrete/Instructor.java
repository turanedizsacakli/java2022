package homeworkProjectDayThree.entities.concrete;

import homeworkProjectDayThree.entities.absrtract.Entity;

public class Instructor implements Entity{

	int id;
	String name;
	private String lastName;
	private int coursePiece;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String name, String lastName, int coursePiece) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.coursePiece = coursePiece;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCoursePiece() {
		return coursePiece;
	}
	public void setCoursePiece(int coursePiece) {
		this.coursePiece = coursePiece;
	}
	
	
	
}

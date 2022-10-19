package homeworkProjectDayThree.entities.concrete;

import homeworkProjectDayThree.entities.absrtract.Entity;

public class Category implements Entity{

	int id;
	String name;
	private int coursePiece;
	
	
	public Category(){
		
	}
	
	public Category(int id, String name, int coursePiece) {
		super();
		this.id = id;
		this.name = name;
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
	public int getCoursePiece() {
		return coursePiece;
	}
	public void setCoursePiece(int coursePiece) {
		this.coursePiece = coursePiece;
	}
	
	
}

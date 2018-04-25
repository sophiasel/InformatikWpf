package data;

public class Student extends Person {
	//erbt alles von Person
	//wenn in person Modifier protected und nicht private -> innerhalb von Student kann darauf zugegriffen werden
	
	private int grade;
	
	public Student() {
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student" + " " + super.toString() + " im Jahrgang " + getGrade();
	}
}

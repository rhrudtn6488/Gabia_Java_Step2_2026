package chapter14.treeset;

public class Student implements Comparable<Student>{

	//맴버변수
	private String name;
	private int score;
	
	//생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//메서드
	public String getAnme() {
		return name;
	}
	public void setAnme(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student other) {
		//return Integer.compare(this.score,  other.score); //오름차순
		return Integer.compare(this.score,  other.score)* -1; //내림차순
	}
	
	
	
}

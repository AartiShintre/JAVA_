package assignment4;
class Student{
	String name;
	int rollno;
	public Student() {
	this("arti",25);
	}
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
		}
	void printRecord() {
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+rollno);
		
	}
}

public class constructorChanning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.printRecord();
	}

}

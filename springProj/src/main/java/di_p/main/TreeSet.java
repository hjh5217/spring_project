package di_p.main;

public class TreeSet {

	public static void main(String[] args) {
		Student a = new Student(17, 2);	// 17살 2반
		Student b = new Student(18, 1);	// 18살 1반
		
		
		int isBig = a.compareTo(b);	// a자기자신과 b객체를 비교한다.
		
		if(isBig > 0) {
			System.out.println("a객체가 b객체보다 큽니다.");
		}
		else if(isBig == 0) {
			System.out.println("두 객체의 크기가 같습니다.");
		}
		else {
			System.out.println("a객체가 b객체보다 작습니다.");
		}
		
	}
 
}
 
class Student implements Comparable<Student> {
 
	int age;			// 나이
	int classNumber;	// 학급
	
	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
}
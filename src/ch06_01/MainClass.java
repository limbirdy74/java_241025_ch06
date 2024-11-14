package ch06_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student 클래스로 stu1 이라는 객체 선언(생성)
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "홍길동";
		stu1.age = 18;
		stu1.hakqun = "01234";
		stu1.grade = 4;
		
		stu2.name = "이순신";
		stu2.age = 34;
		stu2.hakqun = "01235";
		stu2.grade = 3;
		
		stu1.study();
		stu2.play();
		
		System.out.println(stu1.name);

	}

}

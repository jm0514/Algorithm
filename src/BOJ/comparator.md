# Comparable과 Comparator


두 인터페이스는 객체를 비교할 수 있도록 만들고 객체의 정렬기준을 정하는데도 필요하다.


Comparable
------

Comparable 인터페이스에는 compareTo(T o)메소드 하나가 선언되어 있는데 Comparable을 사용하려면 compareTo 메소드를 재정의 (Override/구현) 해주어야 한다.  
Comparable의 특징은 자기 자신과 매개변수를 비교하고 compareTo메소드를 반드시 구현해야 한다.

```JAVA
class Student implements Comparable<Student> {
 
	int age;			// 나이
	int classNumber;	// 학급
	
	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
    
		// 자기자신의 age가 o의 age보다 크다면 양수
		if(this.age > o.age) {
			return 1;
		}
		// 자기 자신의 age와 o의 age가 같다면 0
		else if(this.age == o.age) {
			return 0;
		}
		// 자기 자신의 age가 o의 age보다 작다면 음수
		else {
			return -1;
		}
	}
}
```

Comparator
-----
Comparator에서 구현해야 할 것은 compare(T o1, T o2)다. 이미 정해진 정렬기준과 다른 정렬기준을 사용하고 싶을 때 사용한다.  
Comparator 인터페이스의 구현체는 그 자체가 정렬자로 사용된다.
```JAVA
import java.util.Comparator;	// import 필요
class Student implements Comparator<Student> {
 
	int age;			// 나이
	int classNumber;	// 학급
	
	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compare(Student o1, Student o2) {
    
		// o1의 학급이 o2의 학급보다 크다면 양수
		if(o1.classNumber > o2.classNumber) {
			return 1;
		}
		// o1의 학급이 o2의 학급과 같다면 0
		else if(o1.classNumber == o2.classNumber) {
			return 0;
		}
		// o1의 학급이 o2의 학급보다 작다면 음수
		else {
			return -1;
		}
	}
}
```

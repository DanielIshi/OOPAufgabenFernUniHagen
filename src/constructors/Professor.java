package constructors;



class Person {
	private String name;

	
	Person() {		
		//
	}	
	
	Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	private int matriculationNumber;
	
	
	
	Student(String name, int matriculationNumber) {
		super(name);
		this.matriculationNumber = matriculationNumber;
	}
}

class Professor extends Person {
	private int earnings;

	Professor(String name, int earnings) {
		this.earnings = earnings;
	}

	Professor(String name) {
		this(name, 5500);
	}
}
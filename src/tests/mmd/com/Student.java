package tests.mmd.com;

public class Student extends Person {
	int matriculationNr;
	int semester;

	Student(String name, int birthday, int matriculationNr, int semester) {
		super(name, birthday);
		this.matriculationNr = matriculationNr;
		this.semester = semester;
	}

	void print() {
		super.print();
		System.out.println("Matrikelnr: " + matriculationNr);
		System.out.println("Semesterzahl: " + semester);
	}

	int getMatriculationNr() {
		return matriculationNr;
	}
}
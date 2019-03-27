package tests.mmd.com;
class Super {
	void x() {
		System.out.println("Start Methode x in Super");
		y();
		System.out.println("Ende Methode x in Super");
	}

	void y() {
		System.out.println("Start Methode y in Super");
		System.out.println("Ende Methode y in Super");
	}
}

class Sub extends Super {
	void x() {
		System.out.println("Start Methode x in Sub");
		super.x();
		System.out.println("Ende Methode x in Sub");
	}

	void y() {
		System.out.println("Start Methode y in Sub");
		System.out.println("Ende Methode y in Sub");
	}
}

public class VererbungsTest {
	public static void main(String[] args) {
		Super s = new Sub();
		s.x();
	}
}
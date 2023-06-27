package u4d2;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
//		Student aldo = new Student("Aldo", "Baglio");
//		aldo.sayHello();
//
//		Student giovanni = new Student("Giovanni", "Storti");
//		giovanni.sayHello();
//
//		Student giacomo = aldo;
//		giacomo.surname = "Poretti";
//		giacomo.sayHello();
//
//		aldo.sayHello();
//
//		Math.sqrt(4);
//		System.out.println(Math.PI);
//
//		Student.staticMethod();
//		System.out.println(Student.school);

		// ----------- COMPARAZIONE TRA NUMERI ---------------

//		byte x = 2;
//		int y = 2;
//		double z = 2.0;
//
//		if (x == z) {
//			System.out.println("I due numeri sono uguali");
//		}

		// ----------- COMPARAZIONE TRA STRINGHE ---------------
//		String s1 = "ciao";
//		String s2 = "ciao";
//		s2 = "Arrivederci";
//		String s3 = new String("ciao");
//
//		if (s1.equals(s3)) {
//			System.out.println("Le Stringhe sono uguali");
//		} else {
//			System.out.println("Le Stringhe sono diverse");
//		}

		// ----------- COMPARAZIONE TRA OGGETTI ---------------

//		Student aldo = new Student("Aldo", "Baglio");
//		Student aldo2 = new Student("Aldo", "Baglio");
//		Student aldo3 = aldo;
//
//		if (aldo.equals(aldo2)) {
//			System.out.println("Gli studenti sono uguali");
//		} else {
//			System.out.println("Gli studenti sono diversi");
//		}

		// -------------------- TO STRING ---------------------
//		Student aldo = new Student("Aldo", "Baglio");
//		System.out.println(aldo.toString());
//		Student aldo2 = new Student("Aldo", "Baglio");
//		System.out.println(aldo2.toString());
//		Student aldo3 = aldo;
//		System.out.println(aldo3); // Anche se non specifico toString viene chiamato da Java

		// ---------------------- ARRAY ------------------------

		Student aldo = new Student("Aldo", "Baglio");
		Student giovanni = new Student("Giovanni", "Storti");
		Student giacomo = new Student("Giacomo", "Poretti");

		Student[] students = { aldo, giovanni, giacomo };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println(Arrays.toString(students));

	}

}
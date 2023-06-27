package u4d2;

public class Student {
	// Lista attributi di istanza
	String name;
	String surname;
	int age;

	// Lista attributi statici (attributi di classe)
	static String school = "Epicode";

	// Lista costruttori
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Student(String name) {
		this.name = name;
	}

//	public Human() {
//		this.name = "Ajeje";
//		this.surname = "Brazorf";
//	}

	// Lista metodi
	void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname);
	}

	static void staticMethod() {
		System.out.println("Ciao sono un metodo statico!");
	}
}

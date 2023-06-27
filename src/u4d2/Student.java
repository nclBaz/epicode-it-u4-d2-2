package u4d2;

public class Student {
	// Lista attributi di istanza
	String name;
	String surname;
	int id;

	// Lista attributi statici (attributi di classe)
	static final String school = "Epicode";

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
		// System.out.println(this.name); NON posso usare this all'interno dei metodi
		// statici
		System.out.println(Student.school);
	}

	@Override // Annotazione per specificare che sto sovrascrivendo il comportamento di
				// default ereditato da Object
	public boolean equals(Object obj) { // Tutte le classi ereditano da Object una serie di metodi, tra i quali c'è
										// equals
		Student s = (Student) obj;
		if (this.name == s.name && this.surname == s.surname) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + "]";
	}


}

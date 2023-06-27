package u4d2;

public class App {
	public static void main(String[] args) {
		Student aldo = new Student("Aldo", "Baglio");
		aldo.sayHello();

		Student giovanni = new Student("Giovanni", "Storti");
		giovanni.sayHello();

		Student giacomo = aldo;
		giacomo.surname = "Poretti";
		giacomo.sayHello();

		aldo.sayHello();

		Math.sqrt(4);
		System.out.println(Math.PI);

		Student.staticMethod();
		System.out.println(aldo.school);
	}
}
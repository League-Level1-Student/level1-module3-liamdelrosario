package _99_extra;

public class Student {

	static int nextId;
	static String School = "Carmel Valley ";
	int id;
	String name;
	int currentLevel;

	Student(String name, int currentLevel) {
		this.name = name;

		this.currentLevel = currentLevel;
	}

	public static void main(String[] args) {
		Student("Taylor", 8);
		// Mark
		System.out.println(" school is " + School);

		// create 2 students.

		// print their names, ids and school. }}

	}

}

// *Note: static variables belong to the class and other variables belong to
// instance.

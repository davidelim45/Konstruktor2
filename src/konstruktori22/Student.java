package konstruktori22;

public class Student { // klasa
	int id; // data member (instancirana varijabla)
	String ime; //datta member -||-
	int starost; // data member -||-
	
	Student (int i,String n){ //konstruktor so 2 parametri
		id= i ;
		ime= n;
	}
	
	Student (int i,String n, int a){ //konstruktor so 2 parametri
		id= i ;
		ime= n;
		starost= a;
	}
 
void display() { //metod
	  System.out.println(id+""+ime+""+starost);
  }
  public static void main (String args[]) {
	  Student s1= new Student(111,"Petar");// kreiraj objekt s1
	  Student s2= new Student(222,"Marko", 25);// kreiraj objekt s2
	  s1.display(); //pecati - s1
	  s2.display();//pecati-s2
  }
}
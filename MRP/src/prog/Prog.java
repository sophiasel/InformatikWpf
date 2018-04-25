package prog;

import data.Person;
import data.Student;

public class Prog {

	public static void main(String[] args) {
		new Prog();
	}

	public Prog() {
		//
		Person p1 = new Person();
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		p1.setFemale(false);
		//boolean standardm‰ﬂig false gesetzt!
		System.out.println(p1);
		Person.getPersonenListe().add(p1);
		//
		
		Student s1 = new Student();
		s1.setVorname("Paul");
		s1.setNachname("Rinner");
		//s1.setFemale(false);
		s1.setGrade(2018);
		System.out.println(s1);
		Person.getPersonenListe().add(s1);
		//
		//Student s2 = p2; funktioniert nicht!
		Person p3 = s1; //funktioniert!
		Person.getPersonenListe().add(p3);
		System.out.println("----");
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		System.out.println("-----");
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Student);
		System.out.println("-----");
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Student);
		//
		for(Person p : Person.getPersonenListe()) {
			System.out.println(p.getVorname() + " " + p.getNachname());
			
			if (p instanceof Student) {
				Student s = (Student) p;
				System.out.println(s.getGrade());
			}
		}
	}
}

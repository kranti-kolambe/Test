package com.kranti.model;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person p= new Person();
		//p.setId(10);
		p.setName("Bob");
		System.out.println(p.getId()+p.getName());
		
		//Person p1= new Person(10,"Alice");
		
		//System.out.println(p1.getId()+p1.getName());*/
		
		Person p=new Person(1,"John");
		Student s=new Student("Computer",p);
		Person p1=new Person(1,"Alice");
		Employee e=new Employee("IT",p1);
		System.out.println(e.toString());
		System.out.println(s.toString());
	}

}

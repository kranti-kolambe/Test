package com.kranti.model;

public class Employee extends Person {
String dpt;
Person person;

public Employee() {
	super();
}

public Employee(String dpt, Person person) {
	super();
	this.dpt = dpt;
	this.person = person;
}

/**
 * @return the person
 */
public Person getPerson() {
	return person;
}

/**
 * @param person the person to set
 */
public void setPerson(Person person) {
	this.person = person;
}

/**
 * @return the dpt
 */
public String getDpt() {
	return dpt;
}

/**
 * @param dpt the dpt to set
 */
public void setDpt(String dpt) {
	this.dpt = dpt;
}

@Override
public String toString() {
	return "Employee [dpt=" + dpt + ", person=" + person + "]";
}

}

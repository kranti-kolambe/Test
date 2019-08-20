package com.kranti.model;

public class Student extends Person {
String course;
Person person;
public Student(String course, Person person) {
	super();
	this.course = course;
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
 * @return the course
 */
public String getCourse() {
	return course;
}

/**
 * @param course the course to set
 */
public void setCourse(String course) {
	this.course = course;
}

@Override
public String toString() {
	return "Student [course=" + course + ", person=" + person + "]";
}

}

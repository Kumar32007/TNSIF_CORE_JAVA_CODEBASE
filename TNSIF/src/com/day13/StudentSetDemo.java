package com.day13;
import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		Set <Student> set =new HashSet<Student>();
		
		set.add(new Student (101,"hkj",47.09));
		set.add(new Student (102,"sv",50.09));
		set.add(new Student (103,"dsvv",73.09));
		set.add(new Student (104,"sdv",79.09));
		set.add(new Student (103,"sd",43.09));
		
		System.out.println(set);
	}

}

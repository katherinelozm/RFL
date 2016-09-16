/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfl;

import java.util.ArrayList;

/**
 *
 * @author katherinelozano
 */
public class RFL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Ana", "ana@gmail.com");
	Student s2 = new Student("Juan", "juan@gmail.com");
	Student s3 = new Student("Maria", "maria@gmail.com");
	Student s4 = new Student("Luis", "luis@gmail.com");
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	for(Student s : students){
            System.out.println(s.getEmail());
	}
    }
    
}

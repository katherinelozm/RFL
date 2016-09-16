/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfl;

/**
 *
 * @author katherinelozano
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    private String email;

    Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
}

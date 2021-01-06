/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FileTxt.model;

/**
 *
 * @author USUARIO
 */
public class Person {
    private String name;
    private String lastname;
    private String address;
    private int age;
    
    
    public Person(){
        this.name="";
        this.lastname="";
        this.address="";
        this.age=0;
    }
    public Person(String name,String lastname,String address,int age){
        this.name=name;
        this.lastname= lastname;
        this.address=address;
        this.age=age;
    }  

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}

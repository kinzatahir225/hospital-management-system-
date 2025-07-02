/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Patient {
   private int id,age;
   private String name,gender,address,contact;
   
     public Patient() { 
        this.id = 0;
        this.age = 0;
        this.name = "";
        this.gender = "";
        this.address = "";
        this.contact = "";
    }

    public Patient(int id, int age, String name, String gerder, String adress, String contact) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = adress;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contact=" + contact + '}';
    }

  
    
   
    
}

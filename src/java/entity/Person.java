package entity;
// Generated Sep 2, 2015 2:15:40 PM by Hibernate Tools 4.3.1



/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private Integer id;
     private Computer computer;
     private String name;
     private String surname;

    public Person() {
    }

    public Person(Computer computer, String name, String surname) {
       this.computer = computer;
       this.name = name;
       this.surname = surname;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Computer getComputer() {
        return this.computer;
    }
    
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }




}


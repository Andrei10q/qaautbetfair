package oop;

public class Person {
    private String name;
    private String cnp;
    private PersonSex sex;
    private boolean isHungry;


    public Person(String name, String cnp, PersonSex sex) {
        this.name = name;
        this.cnp = cnp;
        this.sex = sex;
    }

    public void eat() {
        if (isHungry) {
            isHungry = false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public PersonSex getSex() {
        return sex;
    }
}

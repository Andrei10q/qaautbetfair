package oop;

public class Teacher extends Person {
    public String teacherID;

    public String discipline;

    public Teacher(String name, String cnp, PersonSex sex, String teacherID, String discipline) {
        super(name, cnp, sex);
        this.teacherID = teacherID;
        this.discipline = discipline;
    }
}

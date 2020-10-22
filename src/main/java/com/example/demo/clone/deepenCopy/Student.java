package com.example.demo.clone.deepenCopy;

public class Student implements Cloneable{
    private Subject subject;
    private int age;
    private String name;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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

    @Override
    protected Object clone(){
        try {
            Student student = (Student)super.clone();
            student.subject = (Subject) subject.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + subject +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

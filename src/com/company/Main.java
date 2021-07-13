package com.company;


class Address{
    int pin;
    Address(int p){
        pin = p;
    }
}
class College{
    Address ColAdd = new Address(761105);
    void Display(){
        System.out.println(ColAdd.pin);
    }
}
class Student{
    Address StuAdd = new Address(761106);
    void Display(){
        System.out.println(StuAdd.pin);
    }
}
class Main {
    public static void main(String[] args) {
        College Col = new College();
        Student Stu = new Student();
        Col.Display();
        Stu.Display();
    }
}

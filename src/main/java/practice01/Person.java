package practice01;

public class Person {
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Person(){
        name = null;
        age = -1;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is"+this.name+". I am "+this.age+ " years old." );
    }
}

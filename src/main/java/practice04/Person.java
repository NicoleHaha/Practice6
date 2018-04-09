package practice04;

public class Person{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person(){
        name = null;
        age = -1;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        String result = "My name is "+this.name+". I am "+this.age+ " years old.";
        return result;
    }
}

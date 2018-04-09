package practice08;

public class Person {
    private String name;
    private int age;
    private int id;
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
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Person(){
        name = null;
        age = -1;
    }
    public Person(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String introduce(){
        String result = "My name is "+this.name+". I am "+this.age+ " years old.";
        return result;
    }
    public boolean equals(Object obj){
        Boolean flag = false;
        if(obj instanceof Person){
            Person p = (Person) obj;
            if(p.getId() == ((Person)obj).getId()){
                flag = true;
            }
            else flag = false;
        }
        return flag;
    }
}

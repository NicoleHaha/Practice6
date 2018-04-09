package practice02;

public class Student extends Person {
    private int klass;
    public int getKlass(){
        return this.klass;
    }
    public Student(String name,int age,int klass){
        super(name,age);
        setKlass(klass);
    }
    public void setKlass(int klass){
        this.klass = klass;
    }
    @Override
    public String introduce(){
        String result = "I am a Student. I am at Class "+getKlass()+".";
        return result;
    }
}

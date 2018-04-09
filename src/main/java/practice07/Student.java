package practice07;

public class Student extends Person {
    private Klass klass;
    public Klass getKlass(){
        return this.klass;
    }
    public Student(String name,int age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public void setKlass(Klass klass){
        this.klass = klass;
    }
    @Override
    public String introduce(){

        String result = " I am a Student. I am at Class "+klass.getNumber()+".";
        return super.introduce()+result;
    }
}

package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Klass getKlass(){
        return this.klass;
    }
    public Teacher(String name,int age){
        super(name,age);
        setKlass(null);
    }
    public Teacher(String name,int age,Klass klass){
        super(name,age);
        setKlass(klass);
    }
    public void setKlass(Klass klass){
        this.klass = klass;
    }
    @Override
    public String introduce(){
        String result = new String();
        if(klass==null){
            result = " I am a Teacher. I teach No Class.";
        }
        else {
            result = " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }

        return super.introduce()+result;
    }
    public String introduceWith(Student student){
        String str = super.introduce() + " I am a Teacher.";

        if(student.getKlass()==this.klass){
            str += " I teach "+ student.getName() + ".";
        }
        else {
            str += " I don't teach "+ student.getName() + ".";
        }
        return str;
    }
}

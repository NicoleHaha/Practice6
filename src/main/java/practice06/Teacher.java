package practice06;

public class Teacher extends Person{
    private int klass;
    public int getKlass(){
        return this.klass;
    }
    public Teacher(String name,int age){
        super(name,age);
        setKlass(0);
    }
    public Teacher(String name,int age,int klass){
        super(name,age);
        setKlass(klass);
    }
    public void setKlass(int klass){
        this.klass = klass;
    }
    @Override
    public String introduce(){
        String result = new String();
        if(getKlass()==0){
            result = " I am a Teacher. I teach No Class.";
        }
        else {
            result = " I am a Teacher. I teach Class "+getKlass()+".";
        }

        return super.introduce()+result;
    }
}

package practice10;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teacher extends Person {
    private Klass klass;
    private int id;
    private HashSet<Klass> classes;
    public Klass getKlass(){
        return this.klass;
    }
    public Teacher(String name,int age,int id){
        super(name,age,id);
        setKlass(null);
    }
    public Teacher(String name,int age,HashSet<Klass> classes,int id){
        super(name,age,id);
        setClasses(classes);
    }
    public HashSet<Klass> getClasses(){
        return this.classes;
    }
    public void setClasses(HashSet<Klass> classes){
        this.classes = classes;
    }
    public void setKlass(Klass klass){
        this.klass = klass;
    }
    @Override
    public String introduce(){
        String result = new String();
        if(classes==null){
            result = " I am a Teacher. I teach No Class.";
        }
        else {
            String str = new String();
            int i = 0;
            int[] a = new int[2];
            String[] temp = new String[2];
            for(Klass klass:classes){
                a[i] = klass.getNumber();
                i++;
            }
            if (a[0] > a[1]) {
                i = a[0];
                a[0] = a[1];
                a[1] = i;
            }

            result = " I am a Teacher. I teach Class "+a[0] +", " + a[1]+".";
        }

        return super.introduce()+result;
    }
    public String introduceWith(Student student){
        String str = super.introduce() + " I am a Teacher.";

        if(classes.contains(student.getKlass())){
            str += " I teach "+ student.getName() + ".";
        }
        else {
            str += " I don't teach "+ student.getName() + ".";
        }
        return str;
    }
    public boolean isTeaching(Student student){
        if(classes.contains(student.getKlass())){
            return true;
        }
        else {
            return false;
        }
    }
}

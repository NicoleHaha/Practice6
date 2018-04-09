package practice08;

public class Klass {
    private int klass;
    private Student leader;
    public Klass(int klass){
        this.setKlass(klass);
    }
    public Student getLeader(){
        return this.leader;
    }

    public String getDisplayName(){
        return "Class "+this.klass;
    }
    public int getNumber(){
        return this.klass;
    }
    public void setKlass(int klass){
        this.klass = klass;
    }
    public void assignLeader(Student student){
        this.leader = student;
    }
}

package practice10;

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
        if(student.getKlass() != this){
            System.out.print("It is not one of us.");

        }
        else {
            this.leader = student;
        }

    }
    public void appendMember(Student student){
        student.setKlass(this);
    }
    public boolean isIn(Student student){
        if(student.getKlass() == this){
            return true;
        }
        else {
            return false;
        }
    }
}

package practice07;

public class Klass {
    private int klass;
    public Klass(int klass){
        this.setKlass(klass);
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
}

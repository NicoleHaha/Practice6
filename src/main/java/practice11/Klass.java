package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass implements Observerable {
    private int klass;
    private Student leader;
    private String message;
    private List<Observer> list;


    public Klass(int klass) {
        this.setKlass(klass);
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty())
            list.remove(o);
    }
    @Override
    public void notifyObserver(){
        for (int i = 0; i <list.size() ; i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public String getDisplayName() {
        return "Class " + this.klass;
    }

    public int getNumber() {
        return this.klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this) {
            System.out.print("It is not one of us.");

        } else {
            this.leader = student;
            message = student.getName()+" become Leader of Class "+this.klass+".";
            notifyObserver();
        }

    }

    public void appendMember(Student student) {
        student.setKlass(this);
        message = student.getName()+" has joined Class " + this.klass+".";
        notifyObserver();
    }

    public boolean isIn(Student student) {
        if (student.getKlass() == this) {
            return true;
        } else {
            return false;
        }
    }
}

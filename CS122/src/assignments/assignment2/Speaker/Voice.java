package assignments.assignment2.Speaker;

import java.util.Locale;

public abstract class Voice implements Speaker{
    protected String name;
    protected String speak;
    protected String info;

    public Voice(String ename, String eInfo) {
        name = ename;
        info = eInfo;
    }

    @Override
    public void speak() {
        speak = "Hello, my name is " + name + "!\n";
        announce(info);

    }

    @Override
    public void announce(String eInfo) {

        speak += eInfo;
        speak += "\n------------------";
        System.out.println(speak);
    }
}

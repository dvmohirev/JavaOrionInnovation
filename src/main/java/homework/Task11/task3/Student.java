package homework.Task11.task3;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    public Set<Lection> lectionSet = new HashSet<>();

    public Student(String name, Set<Lection> lectionSet) {
        this.name = name;
        this.lectionSet = lectionSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.collections.LabStatus.PENDING;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() { this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        } throw new UnsupportedOperationException();
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {

        return (LabStatus) Lab.getStatus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lab lab : labs) {
            sb.append(getLab(lab.getName())).append(" > ").append(lab.getStatus()).append("\n");
        } return sb.toString();
    }
}

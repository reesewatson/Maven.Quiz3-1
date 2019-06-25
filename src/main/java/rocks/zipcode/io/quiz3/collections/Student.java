package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import static rocks.zipcode.io.quiz3.collections.LabStatus.PENDING;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;
    private String labName;
    private LabStatus labStatus;

    public Student() { this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.equals(labName)) {
                return lab;
            }
        } throw new UnsupportedOperationException();
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        return (LabStatus) Lab.getStatus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(labs).append(" > ").append(labStatus).append("\n");
            return sb.toString();
        }
}

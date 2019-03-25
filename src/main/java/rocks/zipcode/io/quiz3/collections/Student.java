package rocks.zipcode.io.quiz3.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<Lab, LabStatus> statusMap;

    public Student() { this((List<Lab>) new TreeMap<Object, Object>()); }

    public Student(List<Lab> labs) { this.statusMap = (Map<Lab, LabStatus>) labs; }

    public Lab getLab(String labName) {

        for (Lab lab : statusMap.keySet()){
            if (labName.equals(lab.getName())){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        if(getLab(labName) == null){
            throw new UnsupportedOperationException("This lab has not been forked!");
        }
        statusMap.put(getLab(labName), labStatus);
    }

    public void forkLab(Lab lab) {

        statusMap.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        return statusMap.get(getLab(labName));
    }

    @Override
    public String toString() {

        return "Student{" + "statusMap=" + statusMap + '}';
    }
}

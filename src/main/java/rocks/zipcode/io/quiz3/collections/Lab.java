package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    private static LabStatus labStatus;
    private  String name;

    public Lab() {
        this(null);
    }

    public Lab(String labName) { this.name = labName; }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) { this.labStatus = labStatus; }

    public static LabStatus getStatus() {
        return labStatus;
    }
}

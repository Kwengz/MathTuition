import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
    // data/attributes
    private Name name;
    private String IC;
    private Address address;
    private String school, schoolAddress;
    private float marks[] = new float[5];

    public Student() {
        System.out.println("Student object created");
    }

    // methods or operations
    public float calcAvg() {
        float total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        float avg = total / 5;
        return avg;
    }

    public float calcMin() {
        float min = 100;
        for (int i = 0; i < 5; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    public void setName(String first, String middle, String last) {
        name = new Name(first, middle, last);
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setAddress(String street, String district, String postcode, String state) {
        address = new Address(street, district, postcode, state);
    }

    public void setSchool(String school, String schoolAdd) {
        this.school = school;
        schoolAddress = schoolAdd;
    }

    public String getFName() {
        String firstname = this.name.getFName();
        return firstname;
    }

    public void setMark(float mark, int i) throws Exception {
        if ((mark < 0) || (mark > 100) || (i > marks.length)) {
            // System.out.println("Invalid mark value");
            // return;
            throw new Exception("Error in mark detected");
        }
        marks[i] = mark;
    }

    public void displayMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nMarks " + (i+1) + ": " +  marks[i]);
        }
    }

    public static void main(String args[]) {
        Student stud0 = new Student();

        try {
            stud0.setMark(10, 0);
            stud0.setMark(-10, 1);
        } catch (Exception ex) {
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        stud0.displayMarks();


        try {
            File marksFile = new File("marksData1.txt");
            Scanner sc = new Scanner(marksFile);
            int i = 0;
            while (sc.hasNextLine()) {
                int data = sc.nextInt();
                try {
                    stud0.setMark(data, i++);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error in reading file");
            ex.printStackTrace();
        }

        stud0.displayMarks();



    }
}
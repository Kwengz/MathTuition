import java.util.Scanner;               // For Scanner class
import java.io.File;                    // For File
import java.io.FileNotFoundException;   // For File Exception
import java.util.ArrayList;             // For Array List

public class Main
{
    //application code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        // var = sc.next();
        // var = sc.nextInt();
        Tutor cheku = new Tutor();
        StudentBatch sb2023 = new StudentBatch();

        cheku.setName("Che", "Ku", "Izz");
        cheku.setIC("030711108731");
        cheku.setExp(2);
        cheku.setQual("SPM 11C");

        TutorList utpTutor = new TutorList(3);
        utpTutor.add(cheku);

        TuitionCenter utp = new TuitionCenter("Dzul");

        ListofTuitionCenter PandaiSdnBhd = new ListofTuitionCenter();
        PandaiSdnBhd.add(utp);

        Student hariz = new Student();
        Student izhar = new Student();
        Student imran = new Student();

        try { // try block.. something in here can cause exception
            izhar.setMark(10, 0);
            izhar.setMark(-10, 1);
        } catch (Exception ex) {    // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();

        }

        izhar.displayMarks();

        hariz.setName("Danish", "Hariz", "Rizal");
        izhar.setName("Izhar","Nordin","Zakaria");
        imran.setName("Imran", "Haqeem", "Hassan");
        for (int i = 0; i < 5; i++) {
            try {
                hariz.setMark(100, i);
            } catch (Exception ex) {
                System.out.println("Cannot continue");
                ex.printStackTrace();
            }
        }

        // calculate and print the avg
        System.out.println("Name = " + hariz.getFName());
        System.out.println("Avg = " + hariz.calcAvg());
        System.out.println("Min = " + hariz.calcMin());

        // creating a batch object
        //sb2023.add(hariz, 0); // method 1
        sb2023.add(hariz); // method overloading
        sb2023.add(izhar);

        boolean isIn = sb2023.find("Izhar");

        System.out.println("Izhar in student list? " + isIn);

        sc.close();

    }
}
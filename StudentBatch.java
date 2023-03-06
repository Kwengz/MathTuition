public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"?? an array of Student
    private Student students[] = new Student[10];
    private int currsz = 0;

    // operation

    public void add(Student s, int i) {
        students[i] = s;
    }


    // method overloading
    public void add(Student s) {
        if (currsz == 10) {
            return;
        }
        students[currsz++] = s;
    }

    // find a particular student
    public boolean find(String name) {
        for (int i = 0; i < currsz; i++) {
            if (students[i].getFName() == name) {
                return true;
            }
        }
        return false;
    }

    public int getStudentNum() {
        return (currsz);
    }
}
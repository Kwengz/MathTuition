public class TutorList {
    private Tutor tutors[];
    private int currsz = 0;

    public TutorList(int sz) {
        tutors = new Tutor[sz];
    }

    public void add(Tutor t) {
        if (currsz == tutors.length) {
            return;
        }
        tutors[currsz++] = t;
    }

    public boolean find(String name) {
        for (int i = 0; i < currsz; i++) {
            if (tutors[i].getFName() == name) {
                return true;
            }
        }
        return false;
    }
}

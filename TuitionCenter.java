public class TuitionCenter {
    private TutorList tutorList;
    private StudentBatch sb;
    private Address address;
    private String headmaster;
    private int studentNum, tutorNum;

    public TuitionCenter(String headmaster) {
        this.headmaster = headmaster;
    }

    public void addTL(TutorList tl) {
        tutorList = tl;
    }

    public void addSB(StudentBatch sb) {
        this.sb = sb;
    }

    public void setAddress(String street, String district, String postcode, String state) {
        address = new Address(street, district, postcode, state);
    }

    public int getStudentNum() {
        return sb.getStudentNum();
    }
}

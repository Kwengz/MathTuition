public class Name {
    private String fname, lname, mname;

    // constructor
    // no return, name same as class
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    // public void setFName(String fname) {
    //     // "this" refers to the class attributes
    //     this.fname = fname;
    // }

    // public void setLName(String lname) {
    //     this.lname = lname;
    // }

    // public void setMName(String mname) {
    //     this.mname = mname;
    // }

    public String getFName() {
        return this.fname;
    }
}

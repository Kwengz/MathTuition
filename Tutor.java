public class Tutor {
    // data/attributes
    private Name name, inputName;
    private String IC;
    private Address address;
    private int numyearexp;
    private String qualification;

    // op
    public Tutor() {
        System.out.println("Teacher object created!");
    }

    public void setName(String first, String middle, String last) {
        inputName = new Name(first, middle, last);
        name = inputName;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setAddress(String street, String district, String postcode, String state) {
        address = new Address(street, district, postcode, state);
    }

    public void setExp(int exp) {
        numyearexp = exp;
    }

    public void setQual(String qual) {
        qualification = qual;
    }

    public String getFName() {
        String firstname = this.name.getFName();
        return firstname;
    }
}

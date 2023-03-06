public class Address {
    private String street, district, postcode, state, fullAddress;

    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }

    public String getAddress() {
        fullAddress = street + " " + district + " " + postcode + " " + state;
        return fullAddress;
    }
}

// PhonebookEntry.java
public class PhonebookNode {
    private String name;
    private String address;
    private String city;
    private String phoneNumber;

    public PhonebookNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Address: %s, City: %s, Phone: %s", name, address, city, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void updateDetails(String address, String city, String phoneNumber) {
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
}
package dlogistic.order_components;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(String first_name, String last_name, String email, String phone_number) {
        this.setFirstName(first_name);
        this.setLastName(last_name);
        this.setEmail(email);
        this.setPhoneNumber(phone_number);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
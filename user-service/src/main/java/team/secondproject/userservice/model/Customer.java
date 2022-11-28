package team.secondproject.userservice.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;

    public Customer(Integer customerId, String userName, String firstName, String lastName, String password) {
        this.customerId = customerId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", username='" + userName + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

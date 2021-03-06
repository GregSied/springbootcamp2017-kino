package pl.kodolamacz.spring.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by acacko on 29.10.17
 */
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    private String email;
    private String password;

    // for hibernate:
    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(Long id, String email, String password) {
        super(id);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id = " + getId() +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

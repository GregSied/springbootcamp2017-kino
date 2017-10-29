package pl.kodolamacz.spring.dao.model;

/**
 * Created by acacko on 29.10.17
 */
public class User extends Entity {

    private String email;
    private String password;

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
}
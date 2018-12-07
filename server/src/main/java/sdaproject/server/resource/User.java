package sdaproject.server.resource;

import java.time.LocalDate;
import java.util.Date;

public class User {
    String name;
    String lastname;
    int id = 0;
    LocalDate dateOfBirth;

    public User(String name, String lastname, LocalDate dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.id = id++;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

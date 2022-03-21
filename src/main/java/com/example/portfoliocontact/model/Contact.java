package com.example.portfoliocontact.model;

//import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;

//@Document(collection = "contacts")
public class Contact {

    @Id
    private String id;

    private String fullName;
    private String email;
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

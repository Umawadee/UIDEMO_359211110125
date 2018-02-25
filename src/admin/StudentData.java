package admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData {
    public StudentData(String id, String firstName, String laseName, String email, String DOB) {
        this.id = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty(firstName);
        this.laseName = new SimpleStringProperty(laseName);
        this.email = new SimpleStringProperty(email);
        this.DOB = new SimpleStringProperty(DOB);
    }

    private final StringProperty id;
    private final StringProperty firstName;
    private final StringProperty laseName;
    private final StringProperty email;
    private final StringProperty DOB;

    public StudentData(StringProperty id, StringProperty firstName, StringProperty laseName, StringProperty email, StringProperty DOB) {
        this.id = id;
        this.firstName = firstName;
        this.laseName = laseName;
        this.email = email;
        this.DOB = DOB;
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    //public void setId(String id) {
        //this.id.set(id);
    //}

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLaseName() {
        return laseName.get();
    }

    public StringProperty laseNameProperty() {
        return laseName;
    }

    public void setLaseName(String laseName) {
        this.laseName.set(laseName);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getDOB() {
        return DOB.get();
    }

    public StringProperty DOBProperty() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB.set(DOB);
    }
}

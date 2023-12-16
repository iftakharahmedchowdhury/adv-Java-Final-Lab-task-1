package dev.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Student {
    @NotNull
    private int id;

    /*@Length(min = 5, message = "You have a problem in your fullname")*/
    @NotNull
    private String fullname;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Incorrect email format")
    private String email;

    @NotNull
    @Size(min = 8)
    private String password;

    @NotNull
    @Past
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @IAgeValidatorInterface
    private LocalDate dateOfBirth;

    @NotBlank
    @NotNull
    private String gender;

    @NotBlank
    private String quota = "N/A";

    @NotBlank
    private String country = "Bangladeshi";

    public Student() {
    }

    public Student(int id, String fullname, String email, String password, LocalDate dateOfBirth, String gender, String quota, String country) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.quota = quota;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
 /*   @AssertTrue(message = "Age must be 18 years or older")
    public boolean isAgeAboveOrEqualTo18() {
        if (dateOfBirth == null) {
            return false;
        }

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);

        return period.getYears() >= 18;
    }*/
}

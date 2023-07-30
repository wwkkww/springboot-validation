package com.wwkkww.formvalidation;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.wwkkww.formvalidation.validation.Age;
import com.wwkkww.formvalidation.validation.Username;

public class User {
  @NotBlank(message = "First name cannot be blank")
  @Size(min = 2, message = "First name is too short")
  private String firstName;
  @NotBlank(message = "Last name cannot be blank")
  @Size(min = 2, message = "Last name is too short")
  private String lastName;
  @NotBlank(message = "Username cannot be blank")
  @Size(min = 7, message = "Username must be at least 7 characters")
  @Username(message = "Cannot contain special characters or uppercase characters ")
  private String userName;
  @Email(message = "Invalid email")
  private String email;
  @Past(message = "Must be past date")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @Age(message = "Must be at least 18")
  private Date dateOfBirth;


  public User() {
  }

  public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }


  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

}

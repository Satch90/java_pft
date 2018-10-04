package ru.stqa.oft.addressbook.model;

public class UserData {
  private final String firstName;
  private final String lastName;
  private final String adress;
  private final String email;
  private final String mobile;

  public UserData(String firstName, String lastName, String adress,String email,String mobile) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.adress = adress;
    this.email = email;
    this.mobile = mobile;

  }
  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }

  public String getAdress() { return adress; }

  public String getEmail() { return email; }

  public String getMobile() { return mobile; }


}
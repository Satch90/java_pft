package ru.stqa.oft.addressbook;

public class AddNewData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private final String phonehome;

  public AddNewData(String firstname, String lastname, String address, String phonehome) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.phonehome = phonehome;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getPhonehome() {
    return phonehome;
  }
}
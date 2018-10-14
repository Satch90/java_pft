package ru.stqa.oft.addressbook.model;

public class UserData {
  private int id;
  private final String firstName;
  private final String lastName;
//  private final String adress;
//  private final String email;
//  private final String mobile;
  private String group;

  public UserData(int id, String firstName, String lastName, String group) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
  }

  public UserData( String firstName, String lastName, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
  }

//  public UserData(int id, String firstName, String lastName, String adress, String email,String mobile, String group) {
//    this.id = id;
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.adress = adress;
//    this.email = email;
//    this.mobile = mobile;
//
//    this.group = group;
//  }


  public int getId() { return id; }

  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }

//  public String getAdress() { return adress; }
//
//  public String getEmail() { return email; }
//
//  public String getMobile() { return mobile; }


  public String getGroup() {
    return group;
  }


  public void setId(int id) {
    this.id = id;
  }
}
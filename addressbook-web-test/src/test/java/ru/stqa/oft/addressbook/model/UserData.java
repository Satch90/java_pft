package ru.stqa.oft.addressbook.model;

import java.util.Objects;

public class UserData {
  private int id;
  private final String firstName;
  private final String lastName;
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

  @Override
  public String toString() {
    return "PersonData{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserData that = (UserData) o;
    return Objects.equals(firstName, that.firstName) &&
            Objects.equals(lastName, that.lastName);
  }
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }
  public int getId() { return id; }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }

  public String getGroup() {
    return group;
  }


  public void setId(int id) {
    this.id = id;
  }
}
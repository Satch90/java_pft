package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.oft.addressbook.model.UserData;

public class UserHelper extends HelperBase{
  public UserHelper(ChromeDriver wd) {
    super(wd);
  }


  public void fillUserForm(UserData userData) {
    type(By.name("firstname"),userData.getFirstName());
    type(By.name("lastname"),userData.getLastName());
    type(By.name("address"),userData.getAdress());
    type(By.name("email"),userData.getEmail());
    type(By.name("mobile"),userData.getMobile());

  }

  public void submitUserCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));

  }
}
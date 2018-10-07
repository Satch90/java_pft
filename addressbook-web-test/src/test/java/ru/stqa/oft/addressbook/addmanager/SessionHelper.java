package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }


  public void login(String username, String password) {
//    groupHelper.wd.get("http://localhost/addressbook/group.php");
    type(By.name("user"), username);
    type(By.name("pass"), password);

    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
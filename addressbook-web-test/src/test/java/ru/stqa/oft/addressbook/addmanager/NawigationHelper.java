package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NawigationHelper extends HelperBase{

  public NawigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));

  }

  public void gotoUserPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }
}

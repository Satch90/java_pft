package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NawigationHelper extends HelperBase{

  public NawigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));

  }

  public void gotoUserPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));

  }


}

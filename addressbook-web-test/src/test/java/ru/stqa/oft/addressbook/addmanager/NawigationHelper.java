package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NawigationHelper extends HelperBase{

  public NawigationHelper(ChromeDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));

  }

  public void gotoUserPage() {
    click(By.linkText("add new"));
  }
}

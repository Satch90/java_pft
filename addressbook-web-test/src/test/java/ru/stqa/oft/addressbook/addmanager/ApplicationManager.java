package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {
  ChromeDriver wd;

  private  SessionHelper sessionHelper;
  private  NawigationHelper nawigationHelper;
  private  GroupHelper groupHelper ;
  private  UserHelper userHelper ;





  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    nawigationHelper = new NawigationHelper(wd);
    userHelper = new UserHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public UserHelper getUserHelper() {
    return userHelper;
  }

  public NawigationHelper getNawigationHelper() {
    return nawigationHelper;
  }
}
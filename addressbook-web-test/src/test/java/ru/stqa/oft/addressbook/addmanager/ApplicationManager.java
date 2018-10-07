package ru.stqa.oft.addressbook.addmanager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;


public class ApplicationManager {
  private String browser;
  WebDriver wd;

  private  SessionHelper sessionHelper;
  private  NawigationHelper nawigationHelper;
  private  GroupHelper groupHelper ;
  private  UserHelper userHelper ;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init()
  {
    if  (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    } else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    }

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
package ru.stqa.oft.addressbook.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.oft.addressbook.addmanager.ApplicationManager;

public class TestBase {
  protected final ApplicationManager app = new ApplicationManager();
  //    FirefoxDriver wd;
  ChromeDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
//        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
    app.init();

  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

//  protected void selectGroup() {
//      wd.findElement(By.name("selected[]")).click();
//  }
}

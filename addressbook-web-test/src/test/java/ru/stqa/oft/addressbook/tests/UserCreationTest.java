package ru.stqa.oft.addressbook.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class UserCreationTest extends TestBase {


//  private void logingToAddressbook() {
//    wd.findElement(By.id("content")).click();
//    wd.findElement(By.name("user")).sendKeys("admin");
//    wd.findElement(By.name("pass")).click();
//    wd.findElement(By.name("pass")).sendKeys("secret");
//    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
//  }
  @Test
  public void testUserCreationTest() {
    newPersonCreation();
    fillingTheForm(new personNew("NewUser", "TestName", "TestLastName", "TestCompany", "4872812406", "example@test.com"));
    submittingPersonCreation();
  }
  private void submittingPersonCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }
  private void fillingTheForm(personNew personNew) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).sendKeys(personNew.getFirstName());
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(personNew.getMiddleName());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(personNew.getLastName());
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(personNew.getCompanyName());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(personNew.getMobilePhone());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).sendKeys(personNew.getEmailAddress());
  }
  private void newPersonCreation() {
//    wd.findElement(By.linkText("add new")).click();
  }
  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(ChromeDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
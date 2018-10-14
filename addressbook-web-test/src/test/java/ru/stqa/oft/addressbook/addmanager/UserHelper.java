package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.stqa.oft.addressbook.model.UserData;

import java.util.ArrayList;
import java.util.List;

public class UserHelper extends HelperBase {
  public UserHelper(WebDriver wd) {
    super(wd);
  }


  public void fillUserForm(UserData userData, boolean creation) {
    type(By.name("firstname"), userData.getFirstName());
    type(By.name("lastname"), userData.getLastName());
//    type(By.name("address"), userData.getAdress());
//    type(By.name("email"), userData.getEmail());
//    type(By.name("mobile"), userData.getMobile());


    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userData.getGroup());

    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void submitUserCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));

  }

  public void clicToEditUser() {

    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void clicToUpdateUser() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));

  }

  public void clicToSelectUser() {
    click(By.name("selected[]"));

  }

  public void clicToDeleteUser() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));

  }

  public void closeAlert() {
    wd.switchTo().alert().accept();

  }

  public void checkAlert() {
    try {
      WebDriverWait wait = new WebDriverWait(wd, 1);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = wd.switchTo().alert();
      alert.accept();
    } catch (Exception e) {
      //exception handling
    }
  }

  public void createUser(UserData user) {
    click(By.linkText("add new"));
    fillUserForm(user, true);
    submitUserCreation();

  }

  public boolean isThereAUser() {
    return isElementPresent(By.name("selected[]"));
  }


  public List<UserData> getUserList() {
    List<UserData> users = new ArrayList<UserData>();
    List<WebElement> rows = wd.findElements(By.name("entry"));
    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.tagName("td"));
      String firstName = cells.get(2).getText();
      String lastName = cells.get(1).getText();


      int id = Integer.parseInt(row.findElement(By.tagName("input")).getAttribute("value"));

      UserData user = new UserData(id, firstName, lastName, "test1");
      users.add(user);
    }
      return users;
    }
  }
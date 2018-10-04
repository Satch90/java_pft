package ru.stqa.oft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTests extends TestBase{

  @Test
  public void tesUsertDeletion() throws InterruptedException {
    app.getNawigationHelper().gotoHomePage();
    app.getUserHelper().clicToSelectUser();
    app.getUserHelper().clicToDeleteUser();
    wd.wait(5000);
    wd.switchTo().alert().accept();



  }
}

package ru.stqa.oft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;

public class UserDeletionTests extends TestBase {

  @Test
  public void tesUsertDeletion() throws InterruptedException {
    app.getNawigationHelper().gotoHomePage();
    if (! app.getUserHelper().isThereAUser()) {
      app.getUserHelper().createUser(new UserData("Bartosz","Kasperowicz", "Wroclaw","test@test.pl","667556445", "test1"));
    }
    app.getNawigationHelper().gotoHomePage();
    app.getUserHelper().clicToSelectUser();
    app.getUserHelper().clicToDeleteUser();
    app.getUserHelper().closeAlert();
    
  }
}
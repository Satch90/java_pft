package ru.stqa.oft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;

import java.util.List;

public class UserDeletionTests extends TestBase {

  @Test
  public void tesUsertDeletion() throws InterruptedException {
    app.getNawigationHelper().gotoHomePage();

    if (! app.getUserHelper().isThereAUser()) {
      app.getUserHelper().createUser(new UserData("Bartosz", "Kaspero","test1"));
    }
    List<UserData> before = app.getUserHelper().getUserList();

    app.getNawigationHelper().gotoHomePage();
    app.getUserHelper().clicToSelectUser();
    app.getUserHelper().clicToDeleteUser();
    app.getUserHelper().closeAlert();
    app.getNawigationHelper().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();

    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);


  }
}
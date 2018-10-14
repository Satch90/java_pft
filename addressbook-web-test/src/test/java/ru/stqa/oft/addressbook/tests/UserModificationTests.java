package ru.stqa.oft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;

import java.util.Comparator;
import java.util.List;

public class UserModificationTests extends TestBase{

  @Test
  private void testUserModification(){
    app.getNawigationHelper().gotoHomePage();
    if (! app.getUserHelper().isThereAUser()) {
      app.getUserHelper().createUser(new UserData("Bartosz", "Kaspero","test1"));
    }

    List<UserData> before = app.getUserHelper().getUserList();

    app.getNawigationHelper().gotoHomePage();
    app.getUserHelper().clicToEditUser();
    app.getUserHelper().fillUserForm(new UserData("Bartosz", "Kaspero","test1"), false);
    app.getUserHelper().clicToUpdateUser();
    app.getNawigationHelper().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add((new UserData("Bartosz", "Kaspero","test1")));
    Comparator<? super UserData> byId = (g1 , g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
package ru.stqa.oft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;
import java.util.Comparator;
import java.util.List;

public class UserCreationTests extends TestBase{

  @Test
  public void testUserCreation() {
    app.goTo().gotoHomePage();
    List<UserData> before = app.getUserHelper().getUserList();
    UserData user = new UserData("Bartosz", "Kaspero","test1");
    app.getUserHelper().createUser(user);
    app.goTo().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();
    Assert.assertEquals(after.size(), before.size() +1);


    before.add(user);
    Comparator<? super UserData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId );
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
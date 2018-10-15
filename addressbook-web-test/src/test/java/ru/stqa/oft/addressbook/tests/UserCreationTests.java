package ru.stqa.oft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;
import java.util.HashSet;
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
    Assert.assertEquals(after.size(), before.size() + 1);


    user.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(user);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
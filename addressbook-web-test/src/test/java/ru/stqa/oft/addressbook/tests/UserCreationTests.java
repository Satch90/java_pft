package ru.stqa.oft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;

public class UserCreationTests extends TestBase{

  @Test
  public void testUserCreation() {
    app.getNawigationHelper().gotoUserPage();
    app.getUserHelper().fillUserForm(new UserData("Bartosz","Kasperowicz", "Wroclaw","test@test.pl","667556445"));
    app.getUserHelper().submitUserCreation();

    }
}
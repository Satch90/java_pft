package ru.stqa.oft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.UserData;

public class UserModificationTests extends TestBase{

  @Test
  private void testUserModification(){
    app.getNawigationHelper().gotoHomePage();
    app.getUserHelper().clicToEditUser();
    app.getUserHelper().fillUserForm(new UserData("Beata","Luzniak","Mirkowl","test@test1.p","999888777"));
    app.getUserHelper().clicToUpdateUser();
  }

}
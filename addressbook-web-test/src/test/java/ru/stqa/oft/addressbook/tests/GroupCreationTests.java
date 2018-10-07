package ru.stqa.oft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNawigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }


}
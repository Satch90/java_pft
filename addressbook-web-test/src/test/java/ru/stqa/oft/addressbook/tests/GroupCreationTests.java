package ru.stqa.oft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNawigationHelper().gotoGroupPage();
    int befor = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, befor + 1);
  }


}
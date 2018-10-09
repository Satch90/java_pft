package ru.stqa.oft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.getNawigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
}
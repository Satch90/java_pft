package ru.stqa.oft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.oft.addressbook.model.GroupData;
import ru.stqa.oft.addressbook.model.Groups;


import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupDeletion() {

    Groups before = app.group().all();
    GroupData deleteGroup = before.iterator().next();
    app.group().delete(deleteGroup);
    Groups after = app.group().all();
    assertEquals(after.size(), before.size() - 1);


    assertThat(after, equalTo(before.without(deleteGroup)));


  }
}

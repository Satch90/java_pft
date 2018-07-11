package ru.stqa.oft.addressbook.addmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.oft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

  public GroupHelper(ChromeDriver wd) {
    super(wd);
  }

  public void submitGroupCreation() {
    click(By.id("content"));
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void returnToGroupPage() {
    click(By.linkText("groups"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));


  }
}

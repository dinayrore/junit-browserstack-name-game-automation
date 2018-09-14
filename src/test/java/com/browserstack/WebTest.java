package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTest extends BrowserStackJUnitTest {

  @Test
  public void validateTitle() throws Exception {
    assertEquals("name game", driver.getTitle());
  }
}

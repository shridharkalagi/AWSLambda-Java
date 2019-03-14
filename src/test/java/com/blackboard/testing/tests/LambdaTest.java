package com.blackboard.testing.tests;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import com.blackboard.testing.common.LambdaBaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Test.class)
public class LambdaTest extends LambdaBaseTest {

    @Test
    public void googleTest() {
        open("http://www.google.com/");
        screenshot("google-home-page");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void blackboardTest() {
        open("http://www.blackboard.com/");
        screenshot("blackboard-home-page");
        assertThat(title(), containsString("Blackboard"));
    }
    @Test
    public void googleTest1() {
        open("http://www.google.com/");
        screenshot("google-home-page2");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void blackboardTest2() {
        open("http://www.blackboard.com/");
        screenshot("blackboard-home-page2");
        assertThat(title(), containsString("Blackboard"));
    }
    @Test
    public void googleTest3() {
        open("http://www.google.com/");
        screenshot("google-home-page4");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void blackboardTest3() {
        open("http://www.blackboard.com/");
        screenshot("blackboard-home-page4");
        assertThat(title(), containsString("Blackboard"));
    }
}

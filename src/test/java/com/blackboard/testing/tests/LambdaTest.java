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
    public void Test1() {
        open("http://www.thoughtworks.com/");
        screenshot("Thoughtworks");
        assertThat(title(), containsString("ThoughtWorks"));
    }

    @Test
    public void Test2() {
        open("http://stackoverflow.com/");
        screenshot("stackoverflow");
        assertThat(title(), containsString("Stack Overflow"));
    }
    @Test
    public void Test3() {
        open("http://serverless.com/");
        screenshot("serverless");
        assertThat(title(), containsString("Serverless"));
    }

    @Test
    public void Test4() {
        open("http://www.blackboard.com/");
        screenshot("blackboard-home-page2");
        assertThat(title(), containsString("Blackboard"));
    }
    @Test
    public void Test5() {
        open("http://www.google.com/");
        screenshot("google-home-page4");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void Test6() {
        open("http://medium.com/");
        screenshot("medium");
        assertThat(title(), containsString("Medium"));
    }
}

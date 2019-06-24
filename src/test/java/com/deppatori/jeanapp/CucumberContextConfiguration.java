package com.deppatori.jeanapp;


import cucumber.api.java.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class CucumberContextConfiguration {
    @Before
    public void setUp() {
    }
}

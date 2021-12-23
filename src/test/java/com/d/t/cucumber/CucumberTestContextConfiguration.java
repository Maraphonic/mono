package com.d.t.cucumber;

import com.d.t.MonoApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = MonoApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

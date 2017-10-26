package com.saksham.gradle.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by saksham on 25/10/17.
 */

@SpringBootApplication
@ComponentScan("com.saksham.gradle.test")
//@EnableWebMvc
public class Application {

  public static void main(String args[]) {
    SpringApplication.run(Application.class);
  }
}
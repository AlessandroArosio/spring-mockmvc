package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alessandro Arosio - 04/11/2019 19:44
 */
@TestPropertySource("classpath:yanny.properties")
@ActiveProfiles("externalized")
@SpringJUnitConfig(classes = PropertyTest.TestConfig.class)
public class PropertyTest {

  @Configuration
  @ComponentScan("org.springframework.samples.petclinic.sfg")
  static class TestConfig {
  }

  @Autowired
  HearingInterpreter hearingInterpreter;

  @Test
  void whatIheard() {
    String word = hearingInterpreter.whatIheard();

    assertEquals("YANNY", word);
  }
}

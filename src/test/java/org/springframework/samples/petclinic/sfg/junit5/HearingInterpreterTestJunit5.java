package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.LaurelConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alessandro Arosio - 04/11/2019 17:58
 */
@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterTestJunit5 {

  @Autowired
  HearingInterpreter hearingInterpreter;

  @Test
  void whatIheard() {
    String word = hearingInterpreter.whatIheard();

    assertEquals("Laurel", word);
  }
}
package me.alex.language;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * This is the main entry point for the program. Currently it is primarily for testing purposes.
 */
public class LangMain {

  /**
   * The actual main method.
   *
   * @param args the list of arguments for main
   */
  public static void main(String... args) {
    System.out.println("Hello Word");

    final ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      final PhonologyDefinition englishDef
          = mapper.readValue(new File("./src/resources/englishPhonolgyDefinitions.json"), PhonologyDefinition.class);

      final SyllableStructure syllableStructure = new SyllableStructure("CCCVCCCCC", 3, 1, 5);

      final Set<OnsetRule> onsetRules = new HashSet<>();

      final OnsetRule engRule1
          = mapper.readValue(new File("./src/resources/englishStopPlusApproximantNotJ.json"), OnsetRule.class);
      final OnsetRule engRule2
          = mapper.readValue(new File("./src/resources/englishVoicelessFricativePlusApproximantNotJ.json"),
          OnsetRule.class);
      final OnsetRule engRule3
          = mapper.readValue(new File("./src/resources/englishNoVelarNasal.json"), OnsetRule.class);
      final OnsetRule engRule4
          = mapper.readValue(new File("./src/resources/englishSPlusVoicelessStop.json"), OnsetRule.class);
      final OnsetRule engRule5
          = mapper.readValue(new File("./src/resources/englishSPlusNasal.json"), OnsetRule.class);
      final OnsetRule engRule6
          = mapper.readValue(new File("./src/resources/englishSPlusVoicelessFricative.json"), OnsetRule.class);

      onsetRules.add(engRule1);
      onsetRules.add(engRule2);
      //onsetRules.add(engRule3);
      onsetRules.add(engRule4);
      onsetRules.add(engRule5);
      onsetRules.add(engRule6);

      final Word word = new Word(syllableStructure, englishDef, onsetRules);
      System.out.println(word.generateMonosyllable());

    } catch (JsonGenerationException ex) {
      ex.printStackTrace();
    } catch (JsonMappingException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
package me.alex.language;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
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

      final Set<OnsetCodaRule> onsetCodaRules = new HashSet<>();

      final OnsetCodaRule engRule1
          = mapper.readValue(new File("./src/resources/modEngOnStopPlusApproximant.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule2
          = mapper.readValue(new File("./src/resources/modEngOnVoicelessFricativePlusApproximant.json"),
          OnsetCodaRule.class);
      final OnsetCodaRule engRule3
          = mapper.readValue(new File("./src/resources/modEngOnNoVelarNasal.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule4
          = mapper.readValue(new File("./src/resources/modEngOnSPlusVoicelessStop.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule5
          = mapper.readValue(new File("./src/resources/modEngOnSPlusNasal.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule6
          = mapper.readValue(new File("./src/resources/modEngOnSPlusVoicelessFricative.json"), OnsetCodaRule.class);

      final OnsetCodaRule engRule7
          = mapper.readValue(new File("./src/resources/modEngCoLateralApproximantPlusFricative.json"),
          OnsetCodaRule.class);
      final OnsetCodaRule engRule8
          = mapper.readValue(new File("./src/resources/modEngCoLateralApproximantPlusNasal.json"),
          OnsetCodaRule.class);
      final OnsetCodaRule engRule9
          = mapper.readValue(new File("./src/resources/modEngCoLateralApproximantPlusStopAffricate.json"),
          OnsetCodaRule.class);
      final OnsetCodaRule engRule10
          = mapper.readValue(new File("./src/resources/modEngCoNasalPlusFricative.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule11
          = mapper.readValue(new File("./src/resources/modEngCoRPlusFricative.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule12
          = mapper.readValue(new File("./src/resources/modEngCoRPlusNasal.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule13
          = mapper.readValue(new File("./src/resources/modEngCoRPlusStopOrAffricate.json"), OnsetCodaRule.class);
      final OnsetCodaRule engRule14
          = mapper.readValue(new File("./src/resources/modEngCoStopPlusVoicelessFricative.json"),
          OnsetCodaRule.class);
      final OnsetCodaRule engRule15
          = mapper.readValue(new File("./src/resources/modEngCoVoicelessFricativePlusVoicelessStop.json"),
          OnsetCodaRule.class);

      onsetCodaRules.add(engRule1);
      onsetCodaRules.add(engRule2);
      //onsetRules.add(engRule3);
      onsetCodaRules.add(engRule4);
      onsetCodaRules.add(engRule5);
      onsetCodaRules.add(engRule6);
      onsetCodaRules.add(engRule7);
      onsetCodaRules.add(engRule8);
      onsetCodaRules.add(engRule9);
      onsetCodaRules.add(engRule10);
      onsetCodaRules.add(engRule11);
      onsetCodaRules.add(engRule12);
      onsetCodaRules.add(engRule13);
      onsetCodaRules.add(engRule14);
      onsetCodaRules.add(engRule15);

      final Word word = new Word(syllableStructure, englishDef, onsetCodaRules);
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
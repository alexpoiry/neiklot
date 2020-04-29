package me.alex.language;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.time.Instant;

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
    final Instant time = Instant.now();

    System.out.println("The time is " + time);

    final ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      final PhonologyDefinition englishDef
          = mapper.readValue(new File("./src/resources/englishPhonolgyDefinitions.json"), PhonologyDefinition.class);

      final SyllableStructure syllableStructure = new SyllableStructure("CCCVCCCCC", 3, 1, 5);
      final Word word = new Word(syllableStructure, englishDef);
      System.out.println(word.generateMonosyllable());

      final OnsetRule engRule1
          = mapper.readValue(new File("./src/resources/englishStopPlusApproximant.json"), OnsetRule.class);

      engRule1.getValidConsonants(Consonant.b, englishDef.getConsonants()).forEach(System.out::println);

    } catch (JsonGenerationException ex) {
      ex.printStackTrace();
    } catch (JsonMappingException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
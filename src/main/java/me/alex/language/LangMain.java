package me.alex.language;

import static me.alex.language.Consonant.*;
import static me.alex.language.Vowel.*;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class LangMain {
  public static void main(String... args) {
    System.out.println("Hello Word");

    final ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      PhonologyDefinition englishDef
              = mapper.readValue(new File("./src/resources/englishPhonolgyDefinitions.json"), PhonologyDefinition.class);

      final SyllableStructure syllableStructure = new SyllableStructure("CCCVCCCCC", 3, 1,5);
      final Word word = new Word(syllableStructure, englishDef);
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
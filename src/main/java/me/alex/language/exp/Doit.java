package me.alex.language.exp;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Doit {

  /**
   * This is for testing purposes.
   *
   * @param args the args required
   */
  public static void main(final String... args) {
    final ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      final Randobject randy = new Randobject();
      randy.setName("Randy");
      final List<String> nicks = Arrays.asList("Rando", "The Rand Man");
      randy.setNicknames(nicks);
      System.out.println(mapper.writeValueAsString(randy));
    } catch (final JsonGenerationException e) {
      e.printStackTrace();
    } catch (final JsonMappingException e) {
      e.printStackTrace();
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }
}

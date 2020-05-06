package me.alex.language.exp;

import java.util.Map;
import java.util.Set;
import me.alex.language.phoneme.Consonant;

public class GraphemeToPhonemeMap {
  private final Map<Consonant, Set<Letter>> characterMap;

  public GraphemeToPhonemeMap(Map<Consonant, Set<Letter>> characterMap) {
    this.characterMap = characterMap;
  }
}

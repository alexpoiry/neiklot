package me.alex.language;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum VowelBackness {
  FRONT(new HashSet<>(Arrays.asList("i", "y", "ɪ", "ʏ", "e", "ø", "ø̞", "ɛ", "œ", "æ", "a", "ɶ"))),
  CENTRAL(new HashSet<>(Arrays.asList("ɨ", "ʉ", "ɘ", "ɵ", "ə", "ɜ", "ɞ", "ɐ", "ä"))),
  BACK(new HashSet<>(Arrays.asList("ɯ", "u", "ʊ", "ɤ", "o", "o̞", "ʌ", "ɔ", "ɑ", "ɒ"))),
  ;

  private final Set<String> vowels;

  VowelBackness(final Set<String> vowels) {
    this.vowels = vowels;
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

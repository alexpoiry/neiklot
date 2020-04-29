package me.alex.language;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum VowelHeight {
  CLOSE(new HashSet<>(Arrays.asList("i", "y", "ɨ", "ʉ", "ɯ", "u"))),
  NEAR_CLOSE(new HashSet<>(Arrays.asList("ɪ", "ʏ", "ʊ"))),
  CLOSE_MID(new HashSet<>(Arrays.asList("e", "ø", "ɘ", "ɵ", "ɤ", "o"))),
  MID(new HashSet<>(Arrays.asList("ø̞", "ə", "o̞"))),
  OPEN_MID(new HashSet<>(Arrays.asList("ɛ", "œ", "ɜ", "ɞ", "ʌ", "ɔ"))),
  NEAR_OPEN(new HashSet<>(Arrays.asList("æ", "ɐ"))),
  OPEN(new HashSet<>(Arrays.asList("a", "ɶ", "ä", "ɑ", "ɒ")));

  private final Set<String> vowels;

  VowelHeight(final Set<String> vowels) {
    this.vowels = vowels;
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

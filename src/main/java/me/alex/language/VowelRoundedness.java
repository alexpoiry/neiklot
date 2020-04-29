package me.alex.language;

import java.util.Arrays;

public enum VowelRoundedness {
  ROUNDED,
  UNROUNDED,
  NONE;

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

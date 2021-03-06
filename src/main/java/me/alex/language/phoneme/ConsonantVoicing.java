package me.alex.language.phoneme;

import java.util.Arrays;

public enum ConsonantVoicing {
  VOICED,
  UNVOICED;

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

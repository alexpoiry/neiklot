package me.alex.language;

import java.util.Set;

public class Syllable {
  private final Set<Consonant> onset;
  private final Nucleus nucleus;

  public Syllable(final Set<Consonant> onset, final Nucleus nucleus) {
    this.onset = onset;
    this.nucleus = nucleus;
  }
}

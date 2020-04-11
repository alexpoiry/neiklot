package me.alex.language;

import java.util.List;

public class Syllable {
  private final List<Consonant> onset;
  private final Nucleus nucleus;

  public Syllable(final List<Consonant> onset, final Nucleus nucleus) {
    this.onset = onset;
    this.nucleus = nucleus;
  }
}

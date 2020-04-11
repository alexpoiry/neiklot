package me.alex.language;

import java.util.Set;

public class Phthong {
  private final Set<Vowel> nPhthong;

  public Phthong(final Set<Vowel> nPhthong) {
    this.nPhthong = nPhthong;

    if (nPhthong.size() > 3) {
      throw new IllegalArgumentException("nPhthongs may not contain more than 3 vowels");
    }
  }
}

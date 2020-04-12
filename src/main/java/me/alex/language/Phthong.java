package me.alex.language;

import com.google.common.base.Objects;

import java.util.EnumSet;

public class Phthong {
  private EnumSet<Vowel> nPhthong;

  public Phthong() {}

  /*
  public Phthong(final EnumSet<Vowel> nPhthong) {
    this.nPhthong = nPhthong;

    if (nPhthong.size() > 3) {
      throw new IllegalArgumentException("nPhthongs may not contain more than 3 vowels");
    }
  }
   */

  public EnumSet<Vowel> getnPhthong() {
    return nPhthong;
  }

  public void setnPhthong(EnumSet<Vowel> nPhthong) {
    this.nPhthong = nPhthong;
  }

  @Override
  public String toString() {
    return "Phthong{" +
            "nPhthong=" + nPhthong +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Phthong phthong = (Phthong) o;
    return Objects.equal(nPhthong, phthong.nPhthong);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nPhthong);
  }
}

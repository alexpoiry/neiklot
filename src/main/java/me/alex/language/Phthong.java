package me.alex.language;

import com.google.common.base.Objects;
import java.util.EnumSet;
import me.alex.language.phoneme.Vowel;

/**
 * This class represents vowel sounds in groups, such as diphthongs.
 */
public class Phthong {
  private EnumSet<Vowel> nphthong;

  /**
   * Default constructor (for Jackson purposes). May be able to remove.
   */
  public Phthong() {
  }

  /*
  public Phthong(final EnumSet<Vowel> nPhthong) {
    this.nPhthong = nPhthong;

    if (nPhthong.size() > 3) {
      throw new IllegalArgumentException("nPhthongs may not contain more than 3 vowels");
    }
  }
  */

  /**
   * Gets the vowel group.
   *
   * @return an {@link EnumSet} of {@link Vowel}s
   */
  public EnumSet<Vowel> getNphthong() {
    return nphthong;
  }

  /**
   * Sets a vowel group.
   *
   * @param nphthong an {@link EnumSet} of {@link Vowel}s
   */
  public void setNphthong(EnumSet<Vowel> nphthong) {
    this.nphthong = nphthong;
  }

  @Override
  public String toString() {
    return "Phthong{"
      + "nphthong=" + nphthong
      + '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Phthong phthong = (Phthong) o;
    return Objects.equal(nphthong, phthong.nphthong);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nphthong);
  }
}

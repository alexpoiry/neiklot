package me.alex.language;

import java.util.Optional;

/**
 * A class that represents the nucleus of a syllable.
 */
public class Nucleus {
  private final Consonant syllabicConsonant;
  private final Consonant coda;
  private final Phthong vowel;

  /**
   * A constructor that creates a nucleus. THIS NEEDS TO BE SPLIT INTO TWO OR THREE CONSTRUCTORS.
   *
   * @param vowel the {@link Phthong} of the nucleus
   * @param syllabicConsonant the syllabic consonant
   * @param coda the consonant representing the coda
   */
  public Nucleus(final Phthong vowel, final Consonant syllabicConsonant, final Consonant coda) {
    this.syllabicConsonant = syllabicConsonant;
    this.coda = coda;
    this.vowel = vowel;

    if (vowel == null ^ syllabicConsonant == null) {
      throw new IllegalArgumentException("A nucleus must have a vowel or syllabic consonant");
    }

    if (syllabicConsonant != null && coda != null) {
      throw new IllegalArgumentException("A nucleus must not have a coda if the syllabic consonant is present");
    }
  }

  /**
   * Gets an optional syllabic consonant.
   *
   * @return an {@link Optional} syllabic {@link Consonant}
   */
  public Optional<Consonant> getSyllabicConsonant() {
    return Optional.ofNullable(syllabicConsonant);
  }

  /**
   * Gets an optional coda.
   *
   * @return an {@link Optional} coda
   */
  public Optional<Consonant> getCoda() {
    return Optional.ofNullable(coda);
  }

  /**
   * Gets an optional phthong.
   *
   * @return an {@link Optional} {@link Phthong}
   */
  public Optional<Phthong> getVowel() {
    return Optional.ofNullable(vowel);
  }
}

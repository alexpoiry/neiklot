package me.alex.language;

import java.util.Optional;

public class Nucleus {
  private final Consonant syllabicConsonant;
  private final Consonant coda;
  private final Phthong vowel;


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

  public Optional<Consonant> getSyllabicConsonant() {
    return Optional.ofNullable(syllabicConsonant);
  }

  public Optional<Consonant> getCoda() {
    return Optional.ofNullable(coda);
  }

  public Optional<Phthong> getVowel() {
    return Optional.ofNullable(vowel);
  }
}

package me.alex.language.exp;

import me.alex.language.LanguageIdentifier;

public class Letter {
  private final Character letter;
  private final LanguageIdentifier languageId;

  public Letter(Character letter, LanguageIdentifier languageId) {
    this.letter = letter;
    this.languageId = languageId;
  }

  public Character getLetter() {
    return letter;
  }

  public LanguageIdentifier getLanguageId() {
    return languageId;
  }
}

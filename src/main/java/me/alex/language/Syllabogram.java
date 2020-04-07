package me.alex.language;

public class Syllabogram {
    private final String phonotacticConstraint;
    private final LanguageIdentifier languageId;

    public Syllabogram(String phonotacticConstraint, LanguageIdentifier languageId) {
        this.phonotacticConstraint = phonotacticConstraint;
        this.languageId = languageId;
    }
}

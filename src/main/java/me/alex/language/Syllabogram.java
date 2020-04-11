package me.alex.language;

public class Syllabogram {
    private final SyllableStructure syllableStructure;
    private final LanguageIdentifier languageId;

    public Syllabogram(SyllableStructure syllableStructure, LanguageIdentifier languageId) {
        this.syllableStructure = syllableStructure;
        this.languageId = languageId;
    }
}

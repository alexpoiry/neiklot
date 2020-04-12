package me.alex.language;

import com.google.common.base.Objects;

public class LanguageIdentifier {
    private String languageName;

    public LanguageIdentifier() { }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        return "LanguageIdentifier{" +
                "languageName='" + languageName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageIdentifier that = (LanguageIdentifier) o;
        return Objects.equal(languageName, that.languageName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(languageName);
    }
}

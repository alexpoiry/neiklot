package me.alex.language;

import com.google.common.base.Objects;

import java.util.EnumSet;
import java.util.Set;

public class PhonologyDefinition {
    private LanguageIdentifier languageIdentifier;
    private EnumSet<Consonant> consonants;
    private EnumSet<Vowel> vowels;
    private Set<Phthong> twoOrMorePhthongs;

    public PhonologyDefinition() {

    }

    /*
    public PhonologyDefinition(LanguageIdentifier languageIdentifier, EnumSet<Consonant> consonants,
                               EnumSet<Vowel> vowels, Set<Phthong> twoOrMorePhthongs) {
        this.languageIdentifier = languageIdentifier;
        this.consonants = consonants;
        this.vowels = vowels;
        this.twoOrMorePhthongs = twoOrMorePhthongs;
    }
    */

    /*
    public void phonoTest() {
        InputStream inputStream = null;
        try {
            final ClassLoader classLoader = getClass().getClassLoader();
            inputStream = classLoader.getResourceAsStream("englishPhonologyDefinition.json");
            final Reader reader = new InputStreamReader(inputStream, "UTF-8");
            final Gson gson = new Gson();
            final String[] consonantsArray = gson.fromJson(reader, String[].class);

            for (String c : consonantsArray) {
                System.out.println(c);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
     */

    public LanguageIdentifier getLanguageIdentifier() {
        return languageIdentifier;
    }

    public EnumSet<Consonant> getConsonants() {
        return consonants;
    }

    public EnumSet<Vowel> getVowels() {
        return vowels;
    }

    public Set<Phthong> getTwoOrMorePhthongs() {
        return twoOrMorePhthongs;
    }

    public void setLanguageIdentifier(LanguageIdentifier languageIdentifier) {
        this.languageIdentifier = languageIdentifier;
    }

    public void setConsonants(EnumSet<Consonant> consonants) {
        this.consonants = consonants;
    }

    public void setVowels(EnumSet<Vowel> vowels) {
        this.vowels = vowels;
    }

    public void setTwoOrMorePhthongs(Set<Phthong> twoOrMorePhthongs) {
        this.twoOrMorePhthongs = twoOrMorePhthongs;
    }

    @Override
    public String toString() {
        return "PhonologyDefinition{" +
                "languageIdentifier=" + languageIdentifier +
                ", consonants=" + consonants +
                ", vowels=" + vowels +
                ", twoOrMorePhthongs=" + twoOrMorePhthongs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhonologyDefinition that = (PhonologyDefinition) o;
        return Objects.equal(languageIdentifier, that.languageIdentifier) &&
                Objects.equal(consonants, that.consonants) &&
                Objects.equal(vowels, that.vowels) &&
                Objects.equal(twoOrMorePhthongs, that.twoOrMorePhthongs);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(languageIdentifier, consonants, vowels, twoOrMorePhthongs);
    }
}

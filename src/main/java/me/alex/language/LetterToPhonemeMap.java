package me.alex.language;

import java.util.Map;
import java.util.Set;

public class LetterToPhonemeMap {
    private final Map<Consonant, Set<Letter>> characterMap;

    public LetterToPhonemeMap(Map<Consonant, Set<Letter>> characterMap) {
        this.characterMap = characterMap;
    }
}

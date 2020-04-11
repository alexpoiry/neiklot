package me.alex.language;

import java.util.Map;
import java.util.Set;

public class GraphemeToPhonemeMap {
    private final Map<Consonant, Set<Letter>> characterMap;

    public GraphemeToPhonemeMap(Map<Consonant, Set<Letter>> characterMap) {
        this.characterMap = characterMap;
    }
}

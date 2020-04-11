package me.alex.language;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
  private final SyllableStructure syllableStructure;
  private final Random random;

  public Word(final SyllableStructure syllableStructure) {
    this.syllableStructure = syllableStructure;
    this.random = new Random();
  }

  public String generateMonosyllable() {
    final StringBuilder word = new StringBuilder();
    final Syllable syllable;

    int onsetSize = getRandomIntBetweenTwoValues(0, syllableStructure.onsetSize);
    getRandomConsontants(onsetSize).forEach(x -> word.append(x.name()));

    word.append(Vowel.getRandomVowel());

    int codaSize = getRandomIntBetweenTwoValues(0, syllableStructure.codaSize);
    getRandomConsontants(codaSize).forEach(x -> word.append(x.name()));

    return word.toString();
  }

  private List<Consonant> getRandomConsontants(final int consonantSize) {
    final List<Consonant> consonants = new ArrayList<>();
    for (int i = 0; i < consonantSize; i++) {
      boolean consecutive = false;
      do {
        final Consonant consonant = Consonant.getRandomConsonant();

        if (consonants.isEmpty()) {
          consonants.add(consonant);
        } else if (consonants.get(consonants.size() - 1) == consonant) {
          consecutive = true;
        } else {
          consonants.add(consonant);
        }
      } while (consecutive);
    }

    return consonants;
  }

  private boolean getRandomBoolean() {
    return random.nextBoolean();
  }

  private int getRandomIntBetweenTwoValues(final int min, final int max) {
    return random.nextInt(max - min + 1) + min;
  }
}

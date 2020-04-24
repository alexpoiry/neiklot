package me.alex.language;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * A class that represents a single word.
 */
public class Word {
  private final SyllableStructure syllableStructure;
  private final PhonologyDefinition phonologyDefinition;
  private final Random random;

  /**
   * Constructor for the word class.
   *
   * @param syllableStructure the word's {@link SyllableStructure}
   * @param phonologyDefinition the word's {@link PhonologyDefinition}
   */
  public Word(final SyllableStructure syllableStructure, final PhonologyDefinition phonologyDefinition) {
    this.syllableStructure = syllableStructure;
    this.phonologyDefinition = phonologyDefinition;
    this.random = new Random();
  }

  /**
   * Generate a single syllable based upon the word's {@link SyllableStructure}.
   *
   * @return a single valid syllable
   */
  public String generateMonosyllable() {
    final StringBuilder word = new StringBuilder();
    final Syllable syllable;
    final EnumSet<Consonant> validConsonants = phonologyDefinition.getConsonants();
    final EnumSet<Vowel> validVowels = phonologyDefinition.getVowels();

    int onsetSize = getRandomIntBetweenTwoValues(0, syllableStructure.onsetSize);
    getRandomConsontants(validConsonants, onsetSize).forEach(x -> word.append(x.name()));

    final Optional<Vowel> vowel = getRandomVowel(validVowels);
    vowel.ifPresent(word::append);

    int codaSize = getRandomIntBetweenTwoValues(0, syllableStructure.codaSize);
    getRandomConsontants(validConsonants, codaSize).forEach(x -> word.append(x.name()));

    return word.toString();
  }

  /**
   * A helper method that gets a list of random consonants.
   *
   * @param validConsonants an {@link EnumSet} of valid {@link Consonant} values
   * @param consonantSize the number of consecutive consonants to generate
   * @return a {@link List} of random but valid consonants of a given length
   */
  private List<Consonant> getRandomConsontants(final EnumSet<Consonant> validConsonants, final int consonantSize) {
    final List<Consonant> consonants = new ArrayList<>();
    for (int i = 0; i < consonantSize; i++) {
      boolean consecutive = false;
      do {
        final Optional<Consonant> consonant = getRandomConsonant(validConsonants);

        if (consonant.isPresent()) {
          if (consonants.isEmpty()) {
            consonants.add(consonant.get());
          } else if (consonants.get(consonants.size() - 1) == consonant.get()) {
            consecutive = true;
          } else {
            consonants.add(consonant.get());
          }
        }
      } while (consecutive);
    }

    return consonants;
  }

  private <E> Optional<Consonant> getRandomConsonant(final EnumSet<Consonant> validConsonants) {

    return validConsonants.stream()
      .skip((int) (validConsonants.size() * random.nextDouble()))
      .findFirst();
  }

  private <E> Optional<Vowel> getRandomVowel(final EnumSet<Vowel> validVowels) {

    return validVowels.stream()
      .skip((int) (validVowels.size() * random.nextDouble()))
      .findFirst();
  }

  private boolean getRandomBoolean() {
    return random.nextBoolean();
  }

  private int getRandomIntBetweenTwoValues(final int min, final int max) {
    return random.nextInt(max - min + 1) + min;
  }
}

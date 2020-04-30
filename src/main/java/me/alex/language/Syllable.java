package me.alex.language;

import java.util.EnumSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class Syllable {
  private static final Random RANDOM = new Random();
  private final Set<Consonant> onset;
  //private final Nucleus nucleus;

  public Syllable(final Set<Consonant> onset) { //, final Nucleus nucleus*/) {
    this.onset = onset;
    //this.nucleus = nucleus;
  }

  public Syllable(final Set<OnsetRule> onsetRules, final EnumSet<Consonant> validConsonants,
                  final int onsetSize) {
    this.onset = generateOnset(onsetRules, validConsonants, onsetSize);
  }

  private static EnumSet<Consonant> generateOnset(final Set<OnsetRule> onsetRules, final EnumSet<Consonant> validConsonants,
                                          final int onsetSize) {
    final EnumSet<Consonant> onset = EnumSet.noneOf(Consonant.class);

    if (onsetSize > 0 && validConsonants.size() > 0) {
      final Consonant initial = getRandomConsonant(validConsonants).get();

      if (onsetSize == 1) {
        return EnumSet.of(initial);
      }

      onset.add(initial);

      final EnumSet<Consonant> validAdditions = EnumSet.noneOf(Consonant.class);
      for (final OnsetRule rule : onsetRules) {
        validAdditions.addAll(rule.getValidConsonants(initial, validConsonants));
      }

      onset.addAll(generateOnset(onsetRules, validAdditions, onsetSize - 1));

      return onset;
    } else {
      return EnumSet.noneOf(Consonant.class);
    }
  }

  public Set<Consonant> getOnset() {
    return onset;
  }

  private static Optional<Consonant> getRandomConsonant(final EnumSet<Consonant> validConsonants) {
    return validConsonants.stream()
      .skip((int) (validConsonants.size() * RANDOM.nextDouble()))
      .findFirst();
  }
}

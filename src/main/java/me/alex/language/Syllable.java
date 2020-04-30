package me.alex.language;

import java.util.EnumSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Syllable {
  private static final Random RANDOM = new Random();
  private final Set<Consonant> onset;
  //private final Nucleus nucleus;
  private final Set<Consonant> coda;

  /**
   * Constructor that creates an onset and coda.
   *
   * @param onsetCodaRules rules required to generate onsets and codas
   * @param validConsonants valid consonants that can be used in onsets and codas
   * @param onsetSize the maximum size of the onset
   * @param codaSize the maximum size of the coda
   */
  public Syllable(final Set<OnsetCodaRule> onsetCodaRules, final EnumSet<Consonant> validConsonants,
                  final int onsetSize, final int codaSize) {
    this.onset = generateOnset(onsetCodaRules, validConsonants, onsetSize);
    this.coda = generateCoda(onsetCodaRules, validConsonants, codaSize);
  }

  private static EnumSet<Consonant> generateOnset(final Set<OnsetCodaRule> onsetCodaRules,
                                                  final EnumSet<Consonant> validConsonants, final int onsetSize) {
    return generateConsonantGroup(
      onsetCodaRules.stream()
        .filter(rule -> rule.getRuleType() == OnsetCodaRule.RuleType.ONSET)
        .collect(Collectors.toSet()),
      validConsonants, onsetSize);
  }

  private static EnumSet<Consonant> generateCoda(final Set<OnsetCodaRule> onsetCodaRules,
                                                  final EnumSet<Consonant> validConsonants, final int codaSize) {
    return generateConsonantGroup(
      onsetCodaRules.stream()
        .filter(rule -> rule.getRuleType() == OnsetCodaRule.RuleType.CODA)
        .collect(Collectors.toSet()),
      validConsonants, codaSize);
  }

  private static EnumSet<Consonant> generateConsonantGroup(final Set<OnsetCodaRule> onsetCodaRules,
                                                           final EnumSet<Consonant> validConsonants, final int onsetSize) {
    final EnumSet<Consonant> onset = EnumSet.noneOf(Consonant.class);

    if (onsetSize > 0 && validConsonants.size() > 0) {
      final Consonant initial = getRandomConsonant(validConsonants).get();

      if (onsetSize == 1) {
        return EnumSet.of(initial);
      }

      onset.add(initial);

      final EnumSet<Consonant> validAdditions = EnumSet.noneOf(Consonant.class);
      for (final OnsetCodaRule rule : onsetCodaRules) {
        validAdditions.addAll(rule.getValidConsonants(initial, validConsonants));
      }

      onset.addAll(generateConsonantGroup(onsetCodaRules, validAdditions, onsetSize - 1));

      return onset;
    } else {
      return EnumSet.noneOf(Consonant.class);
    }
  }

  public Set<Consonant> getOnset() {
    return onset;
  }

  public Set<Consonant> getCoda() {
    return coda;
  }

  private static Optional<Consonant> getRandomConsonant(final EnumSet<Consonant> validConsonants) {
    return validConsonants.stream()
      .skip((int) (validConsonants.size() * RANDOM.nextDouble()))
      .findFirst();
  }
}

package me.alex.language;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class represents rules for valid onset configurations.
 */
public class OnsetRule {
  private LanguageIdentifier languageIdentifier;
  private String ruleIdentifier;
  private List<String> initialDefinition;
  private List<String> validSubsequents;
  private List<String> exceptions;

  //public OnsetRule(final List<String> initialDefinition, final List<String> validSubsequents,
  //  final List<String> exceptions) {
  //  this.initialDefinition = initialDefinition;
  //  this.validSubsequents = validSubsequents;
  //  this.exceptions = exceptions;
  //}

  /**
   * Default constructor (for Jackson purposes). May be able to remove.
   */
  public OnsetRule() {}

  /**
   * Determines the valid consonants that can follow an initial consonant based upon provided rules.
   *
   * @param initial the first consonant in a consonant group within the onset
   * @param validConsonants the list of all valid consonants
   * @return an EnumSet of all consonants that may follow the initial consonant
   */
  public EnumSet<Consonant> getValidConsonants(final Consonant initial, final EnumSet<Consonant> validConsonants) {
    if (initial.getConsonantDescription().containsAll(this.initialDefinition)) {
      return validConsonants.stream()
        .filter(consonant -> !Collections.disjoint(consonant.getConsonantDescription(), validSubsequents))
        .filter(consonant -> {
          for (final String exception : exceptions) {
            if (consonant.getIpaSymbol().equals(exception)) {
              return false;
            }
          }

          return true;
        })
        .collect(Collectors.toCollection(() -> EnumSet.noneOf(Consonant.class)));
    }

    return validConsonants;
  }

  public LanguageIdentifier getLanguageIdentifier() {
    return languageIdentifier;
  }

  public void setLanguageIdentifier(final LanguageIdentifier languageIdentifier) {
    this.languageIdentifier = languageIdentifier;
  }

  public String getRuleIdentifier() {
    return ruleIdentifier;
  }

  public void setRuleIdentifier(final String ruleIdentifier) {
    this.ruleIdentifier = ruleIdentifier;
  }

  public List<String> getInitialDefinition() {
    return initialDefinition;
  }

  public void setInitialDefinition(final List<String> initialDefinition) {
    this.initialDefinition = initialDefinition;
  }

  public List<String> getValidSubsequents() {
    return validSubsequents;
  }

  public void setValidSubsequents(final List<String> validSubsequents) {
    this.validSubsequents = validSubsequents;
  }

  public List<String> getExceptions() {
    return exceptions;
  }

  public void setExceptions(final List<String> exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public String toString() {
    return "OnsetRule{"
      + "languageIdentifier=" + languageIdentifier
      + ", ruleIdentifier='" + ruleIdentifier + '\''
      + ", initialDefinition=" + initialDefinition
      + ", validSubsequents=" + validSubsequents
      + ", exceptions=" + exceptions
      + '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final OnsetRule onsetRule = (OnsetRule) o;
    return Objects.equal(languageIdentifier, onsetRule.languageIdentifier)
      && Objects.equal(ruleIdentifier, onsetRule.ruleIdentifier)
      && Objects.equal(initialDefinition, onsetRule.initialDefinition)
      && Objects.equal(validSubsequents, onsetRule.validSubsequents)
      && Objects.equal(exceptions, onsetRule.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(languageIdentifier, ruleIdentifier, initialDefinition, validSubsequents, exceptions);
  }
}
package me.alex.language;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import me.alex.language.phoneme.Consonant;

/**
 * This class represents rules for valid onset configurations.
 */
public class OnsetCodaRule {
  private LanguageIdentifier languageIdentifier;
  private String ruleIdentifier;
  private RuleType ruleType;
  private List<String> initialDefinition;
  private List<String> logicalAndInclusions;
  private List<String> logicalOrInclusions;
  private List<String> exceptions;

  /**
   * Default constructor (for Jackson purposes). May be able to remove.
   */
  public OnsetCodaRule() {}

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
        .filter(consonant -> {
          if (logicalAndInclusions != null && !logicalAndInclusions.isEmpty()) {
            return consonant.getConsonantDescription().containsAll(logicalAndInclusions);
          }
          return true;
        })
        .filter(consonant -> {
          if (logicalOrInclusions != null && !logicalOrInclusions.isEmpty()) {
            return !Collections.disjoint(consonant.getConsonantDescription(), logicalOrInclusions);
          }
          return true;
        })
        .filter(consonant -> {
          if (exceptions != null && !exceptions.isEmpty()) {
            for (final String exception : exceptions) {
              if (consonant.getIpaSymbol().equals(exception)) {
                return false;
              }
            }
          }
          return true;
        })
        .collect(Collectors.toCollection(() -> EnumSet.noneOf(Consonant.class)));
    }

    return EnumSet.noneOf(Consonant.class);
  }

  public LanguageIdentifier getLanguageIdentifier() {
    return languageIdentifier;
  }

  public void setLanguageIdentifier(final LanguageIdentifier languageIdentifier) {
    this.languageIdentifier = languageIdentifier;
  }

  public RuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(final RuleType ruleType) {
    this.ruleType = ruleType;
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

  public List<String> getLogicalAndInclusions() {
    return logicalAndInclusions;
  }

  public void setLogicalAndInclusions(final List<String> logicalAndInclusions) {
    this.logicalAndInclusions = logicalAndInclusions;
  }

  public List<String> getLogicalOrInclusions() {
    return logicalOrInclusions;
  }

  public void setLogicalOrInclusions(final List<String> logicalOrInclusions) {
    this.logicalOrInclusions = logicalOrInclusions;
  }

  public List<String> getExceptions() {
    return exceptions;
  }

  public void setExceptions(final List<String> exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
      .add("languageIdentifier", languageIdentifier)
      .add("ruleIdentifier", ruleIdentifier)
      .add("ruleType", ruleType)
      .add("initialDefinition", initialDefinition)
      .add("logicalAndInclusions", logicalAndInclusions)
      .add("logicalOrInclusions", logicalOrInclusions)
      .add("exceptions", exceptions)
      .toString();
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final OnsetCodaRule that = (OnsetCodaRule) o;
    return Objects.equal(getLanguageIdentifier(), that.getLanguageIdentifier())
      && Objects.equal(getRuleIdentifier(), that.getRuleIdentifier())
      && getRuleType() == that.getRuleType()
      && Objects.equal(getInitialDefinition(), that.getInitialDefinition())
      && Objects.equal(getLogicalAndInclusions(), that.getLogicalAndInclusions())
      && Objects.equal(getLogicalOrInclusions(), that.getLogicalOrInclusions())
      && Objects.equal(getExceptions(), that.getExceptions());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getLanguageIdentifier(), getRuleIdentifier(), getRuleType(), getInitialDefinition(),
      getLogicalAndInclusions(), getLogicalOrInclusions(), getExceptions());
  }

  public enum RuleType {
    ONSET,
    CODA;
  }
}

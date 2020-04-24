package me.alex.language;

/**
 * This class represents a phonotactically valid syllable structure for a given language.
 */
public class SyllableStructure {
  final String syllableStructureDefinition;
  final int onsetSize;
  final int vowelOrSyllabicConsonant;
  final int codaSize;

  /**
   * Constructs a syllable structure.
   *
   * @param syllableStructureDefinition a String representing the "CV" structure of a syllable
   * @param onsetSize the maximum size of the onset
   * @param vowelOrSyllabicConsonant the maximum size of vowel of syllabic consonant
   * @param codaSize the maximum size of the code
   */
  public SyllableStructure(final String syllableStructureDefinition, final int onsetSize, final int vowelOrSyllabicConsonant,
                           final int codaSize) {
    this.syllableStructureDefinition = syllableStructureDefinition;
    this.onsetSize = onsetSize;
    this.vowelOrSyllabicConsonant = vowelOrSyllabicConsonant;
    this.codaSize = codaSize;
  }

  /**
   * A helper method to validate the syllable structure definition.
   *
   * @param syllableStructureDefinition a String representing the "CV" structure of a syllable
   * @return true if the string is valid, otherwise false
   */
  private boolean syllableStructureDefinitionIsValidForm(final String syllableStructureDefinition) {
    return syllableStructureDefinition.matches(".*[CV].*");
  }
}

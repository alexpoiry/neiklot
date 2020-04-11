package me.alex.language;

public class SyllableStructure {
  final String syllableStructureDefinition;
  final int onsetSize;
  final int vowelOrSyllabicConsonant;
  final int codaSize;

  public SyllableStructure(final String syllableStructureDefinition, final int onsetSize, final int vowelOrSyllabicConsonant, final int codaSize) {
    this.syllableStructureDefinition = syllableStructureDefinition;
    this.onsetSize = onsetSize;
    this.vowelOrSyllabicConsonant = vowelOrSyllabicConsonant;
    this.codaSize = codaSize;
  }

  private boolean syllableStructureDefinitionIsValidForm(final String syllableStructureDefinition) {
    if (!syllableStructureDefinition.matches(".*[CV].*")) {
      return false;
    }

    return true;
  }
}

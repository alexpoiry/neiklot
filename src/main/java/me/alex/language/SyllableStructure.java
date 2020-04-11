package me.alex.language;

public class SyllableStructure {
  final String syllableStructureDefinition;

  public SyllableStructure(final String syllableStructureDefinition) {
    this.syllableStructureDefinition = syllableStructureDefinition;
  }

  private boolean syllableStructureDefinitionIsValidForm(final String syllableStructureDefinition) {
    if (!syllableStructureDefinition.matches(".*[CV].*")) {
      return false;
    }

    return true;
  }
}

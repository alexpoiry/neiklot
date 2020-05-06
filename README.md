# neiklot
A Word Creator/Mutator

## Planned Features

1. The ability to define elements of a language's phonology and phonotactics
2. The ability to define elements of a language's morphology
3. The ability to assign graphemes to a language's phonology
4. Use a language's phonology and phonotactics definitions to create an arbitrary number of syllables using IPA
5. Use a language's syllable generator and definition to morphology to create words in IPA
6. Combine assigned graphemes to create a written word from an IPA word generated from a language's definition

### Stretch Goals

1. Use an existing dictionary with new words to create a randomly generated dictionary
2. Create a UI to allow users to quickly and easily create definitions, make decisions about words, and define their own language aspects
3. Create a UI to allow users to create their own graphemes

### Unlikely to occur but still cool ideas

1. Support pictograms/ideograms
2. Support speech synthesis

## TODOs

### General

1. Build
  1. Cleanup POM
  2. Document POM decisions
  3. Document coding standards and expectations
  4. Setup a local Jenkins

2. Documentation
  1. Write some, maybe a diagram or two.

3. Tests
  1. Write some

### Current Development Specifics (Unordered)

* Generate multiple syllable words
* Add validation to syllable structure definition
* Add validation to OnsetCodaRules
* Come up with a better language identifier
* Reconsider package structure
* Make decision on and cleanup Jackson support
* Make rules readable as a single file with a list of rules
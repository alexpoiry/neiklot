package me.alex.language;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An enum representing a consonants place of articulation, with each place of articulation containing the associated
 * consonant values.
 */
public enum ConsonantPlace {
  BILABIAL(new HashSet<>(Arrays.asList("m̥", "m", "p", "b", "pɸ", "bβ", "ɸ", "β", "ⱱ̟", "ʙ̥", "ʙ"))),
  LABIODENTAL(new HashSet<>(Arrays.asList("ɱ", "p̪", "b̪", "p̪f", "b̪v", "f", "v", "ʋ̥", "ʋ", "ⱱ"))),
  LINGUOLABIAL(new HashSet<>(Arrays.asList("n̼", "t̼", "d̼", "θ̼", "ð̼", "ɾ̼"))),
  DENTAL(new HashSet<>(Arrays.asList("t̪θ", "d̪ð", "θ", "ð"))),
  ALVEOLAR(new HashSet<>(Arrays.asList("n̥", "n", "t", "d", "ts", "dz", "tɹ̝̊", "dɹ̝", "s", "z", "θ̠", "ð̠", "ɹ̥", "ɹ",
    "ɾ̥", "ɾ", "r̥", "r", "tɬ", "dɮ", "ɬ", "ɮ", "l̥", "l", "ɺ"))),
  POSTALVEOLAR(new HashSet<>(Arrays.asList("t̠ʃ", "d̠ʒ", /*"t̠ɹ̠̊˔", "d̠ɹ̠˔,*/ "ʃ", "ʒ" /*"ɹ̠̊˔", "ɹ̠˔*/))),
  RETROFLEX(new HashSet<>(Arrays.asList("ɳ̊", "ɳ", "ʈ", "ɖ", "ʈʂ", "ɖʐ", "ʂ", "ʐ", /*"ɻ˔,*/ "ɻ̊", "ɻ", "ɽ̊", "ɽ", "ɽ̊r̥",
    "ɽr", /*"ʈɭ̊˔", "ɭ̊˔", "ɭ˔,*/ "ɭ̊", "ɭ", "ɭ̆"))),
  PALATAL(new HashSet<>(Arrays.asList("ɲ̊", "ɲ", "c", "ɟ", "tɕ", "dʑ", "cç", "ɟʝ", "ɕ", "ʑ", "ç", "ʝ", "j̊", "j", "cʎ̝̊",
    "ʎ̝̊", "ʎ̝", "ʎ̥", "ʎ", "ʎ̆"))),
  VELAR(new HashSet<>(Arrays.asList("ŋ̊", "ŋ", "k", "ɡ", "kx", "ɡɣ", "x", "ɣ", "ɰ̊", "ɰ", "kʟ̝̊", "ɡʟ̝", "ʟ̝̊", "ʟ̝", "ʟ̥",
    "ʟ", "ʟ̆"))),
  UVULAR(new HashSet<>(Arrays.asList("ɴ", "q", "ɢ", "qχ", "ɢʁ", "χ", "ʁ", "ɢ̆", "ʀ̥", "ʀ", "ʟ̠"))),
  PHARYNGEAL(new HashSet<>(Arrays.asList("ʡ", "ʡʢ", "ħ", "ʕ", "ʡ̆", "ʜ", "ʢ"))),
  GLOTTAL(new HashSet<>(Arrays.asList("ʔ", "ʔh", "h", "ɦ", "ʔ̞")));

  private final Set<String> consonants;

  /**
   * Constructor for the enum.
   *
   * @param consonants a {@link Set} of {@link Consonant}s associated with the place of articulation
   */
  ConsonantPlace(final Set<String> consonants) {
    this.consonants = consonants;
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

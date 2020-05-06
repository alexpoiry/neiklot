package me.alex.language.phoneme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An enum representing a consonants pressure of articulation, with each pressure of articulation containing the associated
 * consonant values.
 */
public enum ConsonantPressure {
  PULMONIC(new HashSet<>(Arrays.asList("m̥", "m", "ɱ", "n̼", "n̥", "n", "ɳ̊", "ɳ", "ɲ̊", "ɲ", "ŋ̊", "ŋ", "ɴ", "p", "b",
    "p̪", "b̪", "t̼", "d̼", "t", "d", "ʈ", "ɖ", "c", "ɟ", "k", "ɡ", "q", "ɢ", "ʡ", "ʔ", "ts", "dz", "t̠ʃ", "d̠ʒ", "ʈʂ",
    "ɖʐ", "tɕ", "dʑ", "pɸ", "bβ", "p̪f", "b̪v", "t̪θ", "d̪ð", "tɹ̝̊", "dɹ̝", /*"t̠ɹ̠̊˔", "d̠ɹ̠˔,*/ "cç", "ɟʝ", "kx", "ɡɣ",
    "qχ", "ɢʁ", "ʡʢ", "ʔh", "s", "z", "ʃ", "ʒ", "ʂ", "ʐ", "ɕ", "ʑ", "ɸ", "β", "f", "v", "θ̼", "ð̼", "θ", "ð", "θ̠", "ð̠",
    /*"ɹ̠̊˔", "ɹ̠˔", "ɻ˔,*/ "ç", "ʝ", "x", "ɣ", "χ", "ʁ", "ħ", "ʕ", "h", "ɦ", "ʋ̥", "ʋ", "ɹ̥", "ɹ", "ɻ̊", "ɻ", "j̊", "j",
    "ɰ̊", "ɰ", "ʔ̞", "ⱱ̟", "ⱱ", "ɾ̼", "ɾ̥", "ɾ", "ɽ̊", "ɽ", "ɢ̆", "ʡ̆", "ʙ̥", "ʙ", "r̥", "r", "ɽ̊r̥", "ɽr", "ʀ̥", "ʀ", "ʜ",
    "ʢ", "tɬ", "dɮ", /*"ʈɭ̊˔,*/ "cʎ̝̊", "kʟ̝̊", "ɡʟ̝", "ɬ", "ɮ", /*"ɭ̊˔", "ɭ˔,*/ "ʎ̝̊", "ʎ̝", "ʟ̝̊", "ʟ̝", "l̥", "l", "ɭ̊",
    "ɭ", "ʎ̥", "ʎ", "ʟ̥", "ʟ", "ʟ̠", "ɺ", "ɭ̆", "ʎ̆", "ʟ̆", "ɥ̊", "ɥ", "ʍ", "w"))),
  EJECTIVE(new HashSet<>(Arrays.asList("pʼ", "tʼ", "ʈʼ", "cʼ", "kʼ", "qʼ", "ʡʼ", "t̪θʼ", "tsʼ", "t̠ʃʼ", "ʈʂʼ", "kxʼ", "qχʼ",
    "ɸʼ", "fʼ", "θʼ", "sʼ", "ʃʼ", "ʂʼ", "ɕʼ", "xʼ", "χʼ", "tɬʼ", "cʎ̝̊ʼ", "kʟ̝̊ʼ", "ɬʼ"))),
  IMPLOSIVE(new HashSet<>(Arrays.asList("ʘ", "ǀ", "ǃ", "‼", "ǂ", "ʞ", "ʘ̬", "ǀ̬", "ǃ̬", "‼̬", "ǂ̬", "ʘ̃", "ǀ̃", "ǃ̃", "‼̃",
    "ǂ̃", "ǁ", "ǁ̬"))),
  CLICK(new HashSet<>(Arrays.asList("ɓ", "ɗ", "ᶑ", "ʄ", "ɠ", "ʛ", "ɓ̥", "ɗ̥", "ᶑ̊", "ʄ̊", "ɠ̊", "ʛ̥")));

  private final Set<String> consonants;

  /**
   * Constructor for the enum.
   *
   * @param consonants a {@link Set} of {@link Consonant}s associated with the pressure of articulation
   */
  ConsonantPressure(final Set<String> consonants) {
    this.consonants = consonants;
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

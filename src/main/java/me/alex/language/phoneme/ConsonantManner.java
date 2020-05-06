package me.alex.language.phoneme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An enum representing a consonants manner of articulation, with each manner of articulation containing the associated
 * consonant values.
 */
public enum ConsonantManner {
  NASAL(new HashSet<>(Arrays.asList("m̥", "m", "ɱ", "n̼", "n̥", "n", "ɳ̊", "ɳ", "ɲ̊", "ɲ", "ŋ̊", "ŋ", "ɴ"))),
  STOP(new HashSet<>(Arrays.asList("p", "b", "p̪", "b̪", "t̼", "d̼", "t", "d", "ʈ", "ɖ", "c", "ɟ", "k", "ɡ", "q", "ɢ", "ʡ",
    "ʔ"))),
  SIBILANT_AFFRICATE(new HashSet<>(Arrays.asList("ts", "dz", "t̠ʃ", "d̠ʒ", "ʈʂ", "ɖʐ", "tɕ", "dʑ"))),
  NON_SIBILANT_AFFRICATE(new HashSet<>(Arrays.asList("pɸ", "bβ", "p̪f", "b̪v", "t̪θ", "d̪ð", "tɹ̝̊", "dɹ̝",
    /*"t̠ɹ̠̊˔", "d̠ɹ̠˔,*/ "cç", "ɟʝ", "kx", "ɡɣ", "qχ", "ɢʁ", "ʡʢ", "ʔh"))),
  SIBILANT_FRICATIVE(new HashSet<>(Arrays.asList("s", "z", "ʃ", "ʒ", "ʂ", "ʐ", "ɕ", "ʑ"))),
  NON_SIBILANT_FRICATIVE(new HashSet<>(Arrays.asList("ɸ", "β", "f", "v", "θ̼", "ð̼", "θ", "ð", "θ̠", "ð̠",
    /*"ɹ̠̊˔", "ɹ̠˔", "ɻ˔,*/ "ç", "ʝ", "x", "ɣ", "χ", "ʁ", "ħ", "ʕ", "h", "ɦ"))),
  APPROXIMANT(new HashSet<>(Arrays.asList("ʋ̥", "ʋ", "ɹ̥", "ɹ", "ɻ̊", "ɻ", "j̊", "j", "ɰ̊", "ɰ", "ʔ̞", "ɥ̊", "ɥ", "ʍ",
    "w"))),
  TAP_FLAP(new HashSet<>(Arrays.asList("ⱱ̟", "ⱱ", "ɾ̼", "ɾ̥", "ɾ", "ɽ̊", "ɽ", "ɢ̆", "ʡ̆"))),
  TRILL(new HashSet<>(Arrays.asList("ʙ̥", "ʙ", "r̥", "r", "ɽ̊r̥", "ɽr", "ʀ̥", "ʀ", "ʜ", "ʢ"))),
  LATERAL_AFFRICATE(new HashSet<>(Arrays.asList("tɬ", "dɮ", /*"ʈɭ̊˔,*/ "cʎ̝̊", "kʟ̝̊", "ɡʟ̝"))),
  LATERAL_FRICATIVE(new HashSet<>(Arrays.asList("ɬ", "ɮ", /*"ɭ̊˔", "ɭ˔,*/ "ʎ̝̊", "ʎ̝", "ʟ̝̊", "ʟ̝"))),
  LATERAL_APPROXIMANT(new HashSet<>(Arrays.asList("l̥", "l", "ɭ̊", "ɭ", "ʎ̥", "ʎ", "ʟ̥", "ʟ", "ʟ̠"))),
  LATERAL_TAP_FLAP(new HashSet<>(Arrays.asList("ɺ", "ɭ̆", "ʎ̆", "ʟ̆")));

  private final Set<String> consonants;

  /**
   * Constructor for the enum.
   *
   * @param consonants a {@link Set} of {@link Consonant}s associated with the manner of articulation
   */
  ConsonantManner(final Set<String> consonants) {
    this.consonants = consonants;
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

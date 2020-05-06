package me.alex.language.phoneme;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

/**
 * A class representing all valid IPA vowels along with their backness, height, and roundness of articulation.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Vowel {
  i(VowelBackness.FRONT, VowelHeight.CLOSE, VowelRoundedness.UNROUNDED),
  y(VowelBackness.FRONT, VowelHeight.CLOSE, VowelRoundedness.ROUNDED),
  ɨ(VowelBackness.CENTRAL, VowelHeight.CLOSE, VowelRoundedness.UNROUNDED),
  ʉ(VowelBackness.CENTRAL, VowelHeight.CLOSE, VowelRoundedness.ROUNDED),
  ɯ(VowelBackness.BACK, VowelHeight.CLOSE, VowelRoundedness.UNROUNDED),
  u(VowelBackness.BACK, VowelHeight.CLOSE, VowelRoundedness.ROUNDED),
  ɪ(VowelBackness.FRONT, VowelHeight.NEAR_CLOSE, VowelRoundedness.UNROUNDED),
  ʏ(VowelBackness.FRONT, VowelHeight.NEAR_CLOSE, VowelRoundedness.ROUNDED),
  ʊ(VowelBackness.BACK, VowelHeight.NEAR_CLOSE, VowelRoundedness.ROUNDED),
  e(VowelBackness.FRONT, VowelHeight.CLOSE_MID, VowelRoundedness.UNROUNDED),
  ø(VowelBackness.FRONT, VowelHeight.CLOSE_MID, VowelRoundedness.ROUNDED),
  ɘ(VowelBackness.CENTRAL, VowelHeight.CLOSE_MID, VowelRoundedness.UNROUNDED),
  ɵ(VowelBackness.CENTRAL, VowelHeight.CLOSE_MID, VowelRoundedness.ROUNDED),
  ɤ(VowelBackness.BACK, VowelHeight.CLOSE_MID, VowelRoundedness.UNROUNDED),
  o(VowelBackness.BACK, VowelHeight.CLOSE_MID, VowelRoundedness.ROUNDED),
  ø̞(VowelBackness.FRONT, VowelHeight.MID, VowelRoundedness.ROUNDED),
  ə(VowelBackness.CENTRAL, VowelHeight.MID, VowelRoundedness.NONE),
  o̞(VowelBackness.BACK, VowelHeight.MID, VowelRoundedness.ROUNDED),
  ɛ(VowelBackness.FRONT, VowelHeight.OPEN_MID, VowelRoundedness.UNROUNDED),
  œ(VowelBackness.FRONT, VowelHeight.OPEN_MID, VowelRoundedness.ROUNDED),
  ɜ(VowelBackness.CENTRAL, VowelHeight.OPEN_MID, VowelRoundedness.UNROUNDED),
  ɞ(VowelBackness.CENTRAL, VowelHeight.OPEN_MID, VowelRoundedness.ROUNDED),
  ʌ(VowelBackness.BACK, VowelHeight.OPEN_MID, VowelRoundedness.UNROUNDED),
  ɔ(VowelBackness.BACK, VowelHeight.OPEN_MID, VowelRoundedness.ROUNDED),
  æ(VowelBackness.FRONT, VowelHeight.NEAR_OPEN, VowelRoundedness.UNROUNDED),
  ɐ(VowelBackness.CENTRAL, VowelHeight.NEAR_OPEN, VowelRoundedness.NONE),
  a(VowelBackness.FRONT, VowelHeight.OPEN, VowelRoundedness.UNROUNDED),
  ɶ(VowelBackness.FRONT, VowelHeight.OPEN, VowelRoundedness.ROUNDED),
  ä(VowelBackness.CENTRAL, VowelHeight.OPEN, VowelRoundedness.UNROUNDED),
  ɑ(VowelBackness.BACK, VowelHeight.OPEN, VowelRoundedness.UNROUNDED),
  ɒ(VowelBackness.BACK, VowelHeight.OPEN, VowelRoundedness.ROUNDED);

  private final VowelBackness backness;
  private final VowelHeight height;
  private final VowelRoundedness roundedness;

  /**
   * Constructs an IPA vowel.
   *
   * @param backness an enum representing the backness of a vowel
   * @param height an enum representing the height of a vowel
   * @param roundedness an enum representing the roundness of a vowel
   */
  Vowel(final VowelBackness backness, final VowelHeight height, final VowelRoundedness roundedness) {
    this.backness = backness;
    this.height = height;
    this.roundedness = roundedness;
  }

  /**
   * Gets the IPA symbol for a particular vowel.
   *
   * @return the IPA symbol in UTF-8
   */
  @JsonValue
  public String getIpaSymbol() {
    return this.name();
  }

  public static String[] getNames(Class<? extends Enum<?>> e) {
    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
}

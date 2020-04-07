package me.alex.language;

public enum Vowel {
  i(VowelBackness.FRONT , VowelHeight.CLOSE , VowelRoundedness.UNROUNDED ),
  y(VowelBackness.FRONT , VowelHeight.CLOSE , VowelRoundedness.ROUNDED ),
  ɨ(VowelBackness.CENTRAL , VowelHeight.CLOSE , VowelRoundedness.UNROUNDED ),
  ʉ(VowelBackness.CENTRAL , VowelHeight.CLOSE , VowelRoundedness.ROUNDED ),
  ɯ(VowelBackness.BACK , VowelHeight.CLOSE , VowelRoundedness.UNROUNDED ),
  u(VowelBackness.BACK , VowelHeight.CLOSE , VowelRoundedness.ROUNDED ),
  ɪ(VowelBackness.FRONT , VowelHeight.NEAR_CLOSE , VowelRoundedness.UNROUNDED ),
  ʏ(VowelBackness.FRONT , VowelHeight.NEAR_CLOSE , VowelRoundedness.ROUNDED ),
  ʊ(VowelBackness.BACK , VowelHeight.NEAR_CLOSE , VowelRoundedness.ROUNDED ),
  e(VowelBackness.FRONT , VowelHeight.CLOSE_MID , VowelRoundedness.UNROUNDED ),
  ø(VowelBackness.FRONT , VowelHeight.CLOSE_MID , VowelRoundedness.ROUNDED ),
  ɘ(VowelBackness.CENTRAL , VowelHeight.CLOSE_MID , VowelRoundedness.UNROUNDED ),
  ɵ(VowelBackness.CENTRAL , VowelHeight.CLOSE_MID , VowelRoundedness.ROUNDED ),
  ɤ(VowelBackness.BACK , VowelHeight.CLOSE_MID , VowelRoundedness.UNROUNDED ),
  o(VowelBackness.BACK , VowelHeight.CLOSE_MID , VowelRoundedness.ROUNDED ),
  ø̞(VowelBackness.FRONT , VowelHeight.MID , VowelRoundedness.ROUNDED ),
  ə(VowelBackness.CENTRAL , VowelHeight.MID , VowelRoundedness.NONE ),
  o̞(VowelBackness.BACK , VowelHeight.MID , VowelRoundedness.ROUNDED ),
  ɛ(VowelBackness.FRONT , VowelHeight.OPEN_MID , VowelRoundedness.UNROUNDED ),
  œ(VowelBackness.FRONT , VowelHeight.OPEN_MID , VowelRoundedness.ROUNDED ),
  ɜ(VowelBackness.CENTRAL , VowelHeight.OPEN_MID , VowelRoundedness.UNROUNDED ),
  ɞ(VowelBackness.CENTRAL , VowelHeight.OPEN_MID , VowelRoundedness.ROUNDED ),
  ʌ(VowelBackness.BACK , VowelHeight.OPEN_MID , VowelRoundedness.UNROUNDED ),
  ɔ(VowelBackness.BACK , VowelHeight.OPEN_MID , VowelRoundedness.ROUNDED ),
  æ(VowelBackness.FRONT , VowelHeight.NEAR_OPEN , VowelRoundedness.UNROUNDED ),
  ɐ(VowelBackness.CENTRAL , VowelHeight.NEAR_OPEN , VowelRoundedness.NONE ),
  a(VowelBackness.FRONT , VowelHeight.OPEN , VowelRoundedness.UNROUNDED ),
  ɶ(VowelBackness.FRONT , VowelHeight.OPEN , VowelRoundedness.ROUNDED ),
  ä(VowelBackness.CENTRAL , VowelHeight.OPEN , VowelRoundedness.UNROUNDED ),
  ɑ(VowelBackness.BACK , VowelHeight.OPEN , VowelRoundedness.UNROUNDED ),
  ɒ(VowelBackness.BACK , VowelHeight.OPEN , VowelRoundedness.ROUNDED );

  private final VowelBackness backness;
  private final VowelHeight height;
  private final VowelRoundedness roundedness;

  Vowel(final VowelBackness backness, final VowelHeight height, final VowelRoundedness roundedness) {
    this.backness = backness;
    this.height = height;
    this.roundedness = roundedness;
  }
}

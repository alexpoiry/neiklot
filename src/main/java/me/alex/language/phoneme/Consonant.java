package me.alex.language.phoneme;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashSet;
import java.util.Set;

/**
 * A class representing all valid IPA consonants along with their manner, place, pressure, and voicing of articulation.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Consonant {
  m̥(ConsonantManner.NASAL, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  m(ConsonantManner.NASAL, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɱ(ConsonantManner.NASAL, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  n̼(ConsonantManner.NASAL, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  n̥(ConsonantManner.NASAL, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  n(ConsonantManner.NASAL, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɳ̊(ConsonantManner.NASAL, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɳ(ConsonantManner.NASAL, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɲ̊(ConsonantManner.NASAL, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɲ(ConsonantManner.NASAL, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ŋ̊(ConsonantManner.NASAL, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ŋ(ConsonantManner.NASAL, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɴ(ConsonantManner.NASAL, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  p(ConsonantManner.STOP, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  b(ConsonantManner.STOP, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  p̪(ConsonantManner.STOP, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  b̪(ConsonantManner.STOP, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  t̼(ConsonantManner.STOP, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  d̼(ConsonantManner.STOP, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  t(ConsonantManner.STOP, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  d(ConsonantManner.STOP, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʈ(ConsonantManner.STOP, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɖ(ConsonantManner.STOP, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  c(ConsonantManner.STOP, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɟ(ConsonantManner.STOP, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  k(ConsonantManner.STOP, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɡ(ConsonantManner.STOP, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  q(ConsonantManner.STOP, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɢ(ConsonantManner.STOP, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʡ(ConsonantManner.STOP, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʔ(ConsonantManner.STOP, ConsonantPlace.GLOTTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ts(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  dz(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  t̠ʃ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.POSTALVEOLAR, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  d̠ʒ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.POSTALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʈʂ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɖʐ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  tɕ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  dʑ(ConsonantManner.SIBILANT_AFFRICATE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  pɸ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  bβ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  p̪f(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  b̪v(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.VOICED),
  t̪θ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.DENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  d̪ð(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.DENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  tɹ̝̊(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  dɹ̝(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  //t̠ɹ̠̊˔( ),
  //d̠ɹ̠˔( ),
  cç(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɟʝ(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  kx(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɡɣ(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  qχ(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɢʁ(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʡʢ(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.VOICED),
  ʔh(ConsonantManner.NON_SIBILANT_AFFRICATE, ConsonantPlace.GLOTTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  s(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  z(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʃ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.POSTALVEOLAR, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  ʒ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.POSTALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʂ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʐ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɕ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʑ(ConsonantManner.SIBILANT_FRICATIVE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɸ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  β(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  f(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  v(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.VOICED),
  θ̼(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  ð̼(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.VOICED),
  θ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.DENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ð(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.DENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  θ̠(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ð̠(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  //ɹ̠̊˔( ),
  //ɹ̠˔( ),
  //ɻ˔( ),
  ç(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʝ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  x(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɣ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  χ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʁ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ħ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC,
    ConsonantVoicing.UNVOICED),
  ʕ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  h(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.GLOTTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɦ(ConsonantManner.NON_SIBILANT_FRICATIVE, ConsonantPlace.GLOTTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʋ̥(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʋ(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɹ̥(ConsonantManner.APPROXIMANT, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɹ(ConsonantManner.APPROXIMANT, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɻ̊(ConsonantManner.APPROXIMANT, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɻ(ConsonantManner.APPROXIMANT, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  j̊(ConsonantManner.APPROXIMANT, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  j(ConsonantManner.APPROXIMANT, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɰ̊(ConsonantManner.APPROXIMANT, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɰ(ConsonantManner.APPROXIMANT, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʔ̞(ConsonantManner.APPROXIMANT, ConsonantPlace.GLOTTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ⱱ̟(ConsonantManner.TAP_FLAP, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ⱱ(ConsonantManner.TAP_FLAP, ConsonantPlace.LABIODENTAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɾ̼(ConsonantManner.TAP_FLAP, ConsonantPlace.LINGUOLABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɾ̥(ConsonantManner.TAP_FLAP, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɾ(ConsonantManner.TAP_FLAP, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɽ̊(ConsonantManner.TAP_FLAP, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɽ(ConsonantManner.TAP_FLAP, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɢ̆(ConsonantManner.TAP_FLAP, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʡ̆(ConsonantManner.TAP_FLAP, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʙ̥(ConsonantManner.TRILL, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʙ(ConsonantManner.TRILL, ConsonantPlace.BILABIAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  r̥(ConsonantManner.TRILL, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  r(ConsonantManner.TRILL, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɽ̊r̥(ConsonantManner.TRILL, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɽr(ConsonantManner.TRILL, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʀ̥(ConsonantManner.TRILL, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʀ(ConsonantManner.TRILL, ConsonantPlace.UVULAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʜ(ConsonantManner.TRILL, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʢ(ConsonantManner.TRILL, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  tɬ(ConsonantManner.LATERAL_AFFRICATE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  dɮ(ConsonantManner.LATERAL_AFFRICATE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  //ʈɭ̊˔( ),
  cʎ̝̊(ConsonantManner.LATERAL_AFFRICATE, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  kʟ̝̊(ConsonantManner.LATERAL_AFFRICATE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɡʟ̝(ConsonantManner.LATERAL_AFFRICATE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɬ(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɮ(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  //ɭ̊˔( ),
  //ɭ˔( ),
  ʎ̝̊(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʎ̝(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʟ̝̊(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʟ̝(ConsonantManner.LATERAL_FRICATIVE, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  l̥(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  l(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɭ̊(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɭ(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʎ̥(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʎ(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʟ̥(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ʟ(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʟ̠(ConsonantManner.LATERAL_APPROXIMANT, ConsonantPlace.PHARYNGEAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɺ(ConsonantManner.LATERAL_TAP_FLAP, ConsonantPlace.ALVEOLAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ɭ̆(ConsonantManner.LATERAL_TAP_FLAP, ConsonantPlace.RETROFLEX, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʎ̆(ConsonantManner.LATERAL_TAP_FLAP, ConsonantPlace.PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʟ̆(ConsonantManner.LATERAL_TAP_FLAP, ConsonantPlace.VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),

  /* Co-Articulated Consonants */
  ɥ̊(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIAL_PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  ɥ(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIAL_PALATAL, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED),
  ʍ(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIAL_VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.UNVOICED),
  w(ConsonantManner.APPROXIMANT, ConsonantPlace.LABIAL_VELAR, ConsonantPressure.PULMONIC, ConsonantVoicing.VOICED);

  /*
    pʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    tʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʈʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    cʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    kʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    qʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʡʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    t̪θʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    tsʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    t̠ʃʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʈʂʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    kxʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    qχʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɸʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    fʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    θʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    sʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʃʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʂʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɕʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    xʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    χʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    tɬʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    cʎ̝̊ʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    kʟ̝̊ʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɬʼ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʘ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǀ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǃ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    //‼( ),
    ǂ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʞ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʘ̬(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǀ̬(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǃ̬(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    //‼̬( ),
    ǂ̬(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʘ̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǀ̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǃ̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    //‼̃( ),
    ǂ̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǁ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ǁ̬(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɓ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɗ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ᶑ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʄ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɠ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʛ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɓ̥(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɗ̥(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ᶑ̊(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʄ̊(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɠ̊(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʛ̥(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    n͡m(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ŋ͡m(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    t͡p(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    d͡b(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    k͡p(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɡ͡b(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    q͡ʡ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɧ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɥ̊(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɥ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ʍw(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    ɫ(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    j̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    w̃(manner, ConsonantPlace., pressure, ConsonantVoicing.),
    h̃(manner, ConsonantPlace., pressure, ConsonantVoicing.);
  */

  private static final String FRICATIVE = "FRICATIVE";
  private static final String AFFRICATE = "AFFRICATE";
  private static final String APPROXIMANT = "APPROXIMANT";

  private final ConsonantManner manner;
  private final ConsonantPlace place;
  private final ConsonantPressure pressure;
  private final ConsonantVoicing voicing;

  /**
   * Constructs an IPA consonant.
   *
   * @param manner an enum representing the manner of articulation
   * @param place an enum representing the place of articulation
   * @param pressure an enum representing the pressure of articulation
   * @param voicing an enum representing the voicing of articulation
   */
  Consonant(ConsonantManner manner, ConsonantPlace place, ConsonantPressure pressure, ConsonantVoicing voicing) {
    this.manner = manner;
    this.place = place;
    this.pressure = pressure;
    this.voicing = voicing;
  }

  /**
   * Gets the IPA symbol for a particular consonant.
   *
   * @return the IPA symbol in UTF-8
   */
  @JsonValue
  public String getIpaSymbol() {
    return this.name();
  }

  public ConsonantManner getManner() {
    return manner;
  }

  public ConsonantPlace getPlace() {
    return place;
  }

  public ConsonantPressure getPressure() {
    return pressure;
  }

  public ConsonantVoicing getVoicing() {
    return voicing;
  }

  /**
   * This gets the articulation information for a consonant as a list of strings.
   *
   * @return the manner, place, pressure, and voicing information for a specific consonant
   */
  public Set<String> getConsonantDescription() {
    final Set<String> descriptiveStrings = new HashSet<>();
    descriptiveStrings.add(this.getIpaSymbol());
    descriptiveStrings.add(Consonant.class.getSimpleName().toUpperCase());
    descriptiveStrings.add(this.place.name());
    descriptiveStrings.add(this.manner.name());
    descriptiveStrings.add(this.pressure.name());
    descriptiveStrings.add(this.voicing.name());

    if (this.manner.name().contains(FRICATIVE)) {
      descriptiveStrings.add(FRICATIVE);
    }

    if (this.manner.name().contains(AFFRICATE)) {
      descriptiveStrings.add(AFFRICATE);
    }

    if (this.manner.name().contains(APPROXIMANT)) {
      descriptiveStrings.add(APPROXIMANT);
    }

    return descriptiveStrings;
  }
}

package me.alex.language;

import java.util.EnumSet;

public enum ConsonantPlace {
    BILABIAL(EnumSet.of(Consonants.m̥, Consonants.m, Consonants.p, Consonants.b, Consonants.pɸ, Consonants.bβ, Consonants.ɸ, Consonants.β, Consonants.ⱱ̟, Consonants.ʙ̥, Consonants.ʙ)),
    LABIODENTAL(EnumSet.of(Consonants.ɱ, Consonants.p̪, Consonants.b̪, Consonants.p̪f, Consonants.b̪v, Consonants.f, Consonants.v, Consonants.ʋ̥, Consonants.ʋ, Consonants.ⱱ)),
    LINGUOLABIAL(EnumSet.of(Consonants.n̼, Consonants.t̼, Consonants.d̼, Consonants.θ̼, Consonants.ð̼, Consonants.ɾ̼)),
    DENTAL(EnumSet.of(Consonants.t̪θ, Consonants.d̪ð, Consonants.θ, Consonants.ð)),
    ALVEOLAR(EnumSet.of(Consonants.n̥, Consonants.n, Consonants.t, Consonants.d, Consonants.ts, Consonants.dz, Consonants.tɹ̝̊, Consonants.dɹ̝, Consonants.s, Consonants.z, Consonants.θ̠, Consonants.ð̠, Consonants.ɹ̥, Consonants.ɹ, Consonants.ɾ̥, Consonants.ɾ, Consonants.r̥, Consonants.r, Consonants.tɬ, Consonants.dɮ, Consonants.ɬ, Consonants.ɮ, Consonants.l̥, Consonants.l, Consonants.ɺ)),
    POSTALVEOLAR(EnumSet.of(Consonants.t̠ʃ, Consonants.d̠ʒ, /*Consonants.t̠ɹ̠̊˔, Consonants.d̠ɹ̠˔,*/ Consonants.ʃ, Consonants.ʒ /*Consonants.ɹ̠̊˔, Consonants.ɹ̠˔*/)),
    RETROFLEX(EnumSet.of(Consonants.ɳ̊, Consonants.ɳ, Consonants.ʈ, Consonants.ɖ, Consonants.ʈʂ, Consonants.ɖʐ, Consonants.ʂ, Consonants.ʐ, /*Consonants.ɻ˔,*/ Consonants.ɻ̊, Consonants.ɻ, Consonants.ɽ̊, Consonants.ɽ, Consonants.ɽ̊r̥, Consonants.ɽr, /*Consonants.ʈɭ̊˔, Consonants.ɭ̊˔, Consonants.ɭ˔,*/ Consonants.ɭ̊, Consonants.ɭ, Consonants.ɭ̆)),
    PALATAL(EnumSet.of(Consonants.ɲ̊, Consonants.ɲ, Consonants.c, Consonants.ɟ, Consonants.tɕ, Consonants.dʑ, Consonants.cç, Consonants.ɟʝ, Consonants.ɕ, Consonants.ʑ, Consonants.ç, Consonants.ʝ, Consonants.j̊, Consonants.j, Consonants.cʎ̝̊, Consonants.ʎ̝̊, Consonants.ʎ̝, Consonants.ʎ̥, Consonants.ʎ, Consonants.ʎ̆)),
    VELAR(EnumSet.of(Consonants.ŋ̊, Consonants.ŋ, Consonants.k, Consonants.ɡ, Consonants.kx, Consonants.ɡɣ, Consonants.x, Consonants.ɣ, Consonants.ɰ̊, Consonants.ɰ, Consonants.kʟ̝̊, Consonants.ɡʟ̝, Consonants.ʟ̝̊, Consonants.ʟ̝, Consonants.ʟ̥, Consonants.ʟ, Consonants.ʟ̆)),
    UVULAR(EnumSet.of(Consonants.ɴ, Consonants.q, Consonants.ɢ, Consonants.qχ, Consonants.ɢʁ, Consonants.χ, Consonants.ʁ, Consonants.ɢ̆, Consonants.ʀ̥, Consonants.ʀ, Consonants.ʟ̠)),
    PHARYNGEAL(EnumSet.of(Consonants.ʡ, Consonants.ʡʢ, Consonants.ħ, Consonants.ʕ, Consonants.ʡ̆, Consonants.ʜ, Consonants.ʢ)),
    GLOTTAL(EnumSet.of(Consonants.ʔ, Consonants.ʔh, Consonants.h, Consonants.ɦ, Consonants.ʔ̞));

    private final EnumSet<Consonants> consonants;

    ConsonantPlace(final EnumSet<Consonants> consonants) {
        this.consonants = consonants;
    }
}

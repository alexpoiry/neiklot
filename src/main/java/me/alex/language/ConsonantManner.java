package me.alex.language;

import java.util.EnumSet;

public enum ConsonantManner {
    NASAL(EnumSet.of(Consonants.m̥, Consonants.m, Consonants.ɱ, Consonants.n̼, Consonants.n̥, Consonants.n, Consonants.ɳ̊, Consonants.ɳ, Consonants.ɲ̊, Consonants.ɲ, Consonants.ŋ̊, Consonants.ŋ, Consonants.ɴ)),
    STOP(EnumSet.of(Consonants.p, Consonants.b, Consonants.p̪, Consonants.b̪, Consonants.t̼, Consonants.d̼, Consonants.t, Consonants.d, Consonants.ʈ, Consonants.ɖ, Consonants.c, Consonants.ɟ, Consonants.k, Consonants.ɡ, Consonants.q, Consonants.ɢ, Consonants.ʡ, Consonants.ʔ)),
    SIBILANT_AFFRICATE(EnumSet.of(Consonants.ts, Consonants.dz, Consonants.t̠ʃ, Consonants.d̠ʒ, Consonants.ʈʂ, Consonants.ɖʐ, Consonants.tɕ, Consonants.dʑ)),
    NON_SIBILANT_AFFRICATE(EnumSet.of(Consonants.pɸ, Consonants.bβ, Consonants.p̪f, Consonants.b̪v, Consonants.t̪θ, Consonants.d̪ð, Consonants.tɹ̝̊, Consonants.dɹ̝, /*Consonants.t̠ɹ̠̊˔, Consonants.d̠ɹ̠˔,*/ Consonants.cç, Consonants.ɟʝ, Consonants.kx, Consonants.ɡɣ, Consonants.qχ, Consonants.ɢʁ, Consonants.ʡʢ, Consonants.ʔh)),
    SIBILANT_FRICATIVE(EnumSet.of(Consonants.s, Consonants.z, Consonants.ʃ, Consonants.ʒ, Consonants.ʂ, Consonants.ʐ, Consonants.ɕ, Consonants.ʑ)),
    NON_SIBILANT_FRICATIVE(EnumSet.of(Consonants.ɸ, Consonants.β, Consonants.f, Consonants.v, Consonants.θ̼, Consonants.ð̼, Consonants.θ, Consonants.ð, Consonants.θ̠, Consonants.ð̠, /*Consonants.ɹ̠̊˔, Consonants.ɹ̠˔, Consonants.ɻ˔,*/ Consonants.ç, Consonants.ʝ, Consonants.x, Consonants.ɣ, Consonants.χ, Consonants.ʁ, Consonants.ħ, Consonants.ʕ, Consonants.h, Consonants.ɦ)),
    APPROXIMANT(EnumSet.of(Consonants.ʋ̥, Consonants.ʋ, Consonants.ɹ̥, Consonants.ɹ, Consonants.ɻ̊, Consonants.ɻ, Consonants.j̊, Consonants.j, Consonants.ɰ̊, Consonants.ɰ, Consonants.ʔ̞)),
    TAP_FLAP(EnumSet.of(Consonants.ⱱ̟, Consonants.ⱱ, Consonants.ɾ̼, Consonants.ɾ̥, Consonants.ɾ, Consonants.ɽ̊, Consonants.ɽ, Consonants.ɢ̆, Consonants.ʡ̆)),
    TRILL(EnumSet.of(Consonants.ʙ̥, Consonants.ʙ, Consonants.r̥, Consonants.r, Consonants.ɽ̊r̥, Consonants.ɽr, Consonants.ʀ̥, Consonants.ʀ, Consonants.ʜ, Consonants.ʢ)),
    LATERAL_AFFRICATE(EnumSet.of(Consonants.tɬ, Consonants.dɮ, /*Consonants.ʈɭ̊˔,*/ Consonants.cʎ̝̊, Consonants.kʟ̝̊, Consonants.ɡʟ̝)),
    LATERAL_FRICATIVE(EnumSet.of(Consonants.ɬ, Consonants.ɮ, /*Consonants.ɭ̊˔, Consonants.ɭ˔,*/ Consonants.ʎ̝̊, Consonants.ʎ̝, Consonants.ʟ̝̊, Consonants.ʟ̝)),
    LATERAL_APPROXIMANT(EnumSet.of(Consonants.l̥, Consonants.l, Consonants.ɭ̊, Consonants.ɭ, Consonants.ʎ̥, Consonants.ʎ, Consonants.ʟ̥, Consonants.ʟ, Consonants.ʟ̠)),
    LATERAL_TAP_FLAP(EnumSet.of(Consonants.ɺ, Consonants.ɭ̆, Consonants.ʎ̆, Consonants.ʟ̆));

    private final EnumSet<Consonants> consonants;

    ConsonantManner(final EnumSet<Consonants> consonants) {
        this.consonants = consonants;
    }
}

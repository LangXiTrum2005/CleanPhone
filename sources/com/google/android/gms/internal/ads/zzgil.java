package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgil extends zzget {
    private final zzgir zza;
    private final zzgvp zzb;
    private final zzgvo zzc;

    @Nullable
    private final Integer zzd;

    private zzgil(zzgir zzgirVar, zzgvp zzgvpVar, zzgvo zzgvoVar, @Nullable Integer num) {
        this.zza = zzgirVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static zzgil zza(zzgiq zzgiqVar, zzgvp zzgvpVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvoVarZzb;
        zzgiq zzgiqVar2 = zzgiq.zzc;
        if (zzgiqVar != zzgiqVar2 && num == null) {
            throw new GeneralSecurityException(DM.B("For given Variant ", zzgiqVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgiqVar == zzgiqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() != 32) {
            throw new GeneralSecurityException(AbstractC3950lJ.p("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgvpVar.zza()));
        }
        zzgir zzgirVarZzc = zzgir.zzc(zzgiqVar);
        if (zzgirVarZzc.zzb() == zzgiqVar2) {
            zzgvoVarZzb = zzgml.zza;
        } else if (zzgirVarZzc.zzb() == zzgiq.zzb) {
            zzgvoVarZzb = zzgml.zza(num.intValue());
        } else {
            if (zzgirVarZzc.zzb() != zzgiq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgirVarZzc.zzb().toString()));
            }
            zzgvoVarZzb = zzgml.zzb(num.intValue());
        }
        return new zzgil(zzgirVarZzc, zzgvpVar, zzgvoVarZzb, num);
    }

    public final zzgir zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}

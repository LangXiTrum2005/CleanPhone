package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghm extends zzget {
    private final zzghr zza;
    private final zzgvo zzb;

    @Nullable
    private final Integer zzc;

    private zzghm(zzghr zzghrVar, zzgvo zzgvoVar, @Nullable Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static zzghm zza(zzghr zzghrVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvoVarZzb;
        if (zzghrVar.zzc() == zzghp.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgvoVarZzb = zzgml.zza;
        } else {
            if (zzghrVar.zzc() != zzghp.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzghrVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgvoVarZzb = zzgml.zzb(num.intValue());
        }
        return new zzghm(zzghrVar, zzgvoVarZzb, num);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}

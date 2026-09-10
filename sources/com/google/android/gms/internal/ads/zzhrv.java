package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrv extends zzhtu {
    private final zzhro zza;
    private final zzhxc zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    private zzhrv(zzhro zzhroVar, zzhxc zzhxcVar, zzhxc zzhxcVar2, @Nullable Integer num) {
        this.zza = zzhroVar;
        this.zzb = zzhxcVar;
        this.zzc = zzhxcVar2;
        this.zzd = num;
    }

    public static zzhrv zzc(zzhrn zzhrnVar, zzhxc zzhxcVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZza;
        zzhro zzhroVarZzb = zzhro.zzb(zzhrnVar);
        zzhrn zzhrnVar2 = zzhrn.zzd;
        if (!zzhrnVar.equals(zzhrnVar2) && num == null) {
            String string = zzhrnVar.toString();
            throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhrnVar.equals(zzhrnVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhxcVar.zzd() != 32) {
            int iZzd = zzhxcVar.zzd();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (zzhroVarZzb.zzc() == zzhrnVar2) {
            zzhxcVarZza = zzhjf.zza;
        } else if (zzhroVarZzb.zzc() == zzhrn.zzb || zzhroVarZzb.zzc() == zzhrn.zzc) {
            zzhxcVarZza = zzhjf.zza(num.intValue());
        } else {
            if (zzhroVarZzb.zzc() != zzhrn.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhroVarZzb.zzc().toString()));
            }
            zzhxcVarZza = zzhjf.zzb(num.intValue());
        }
        return new zzhrv(zzhroVarZzb, zzhxcVar, zzhxcVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhtu, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhxc zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhtu
    public final zzhxc zze() {
        return this.zzc;
    }

    public final zzhro zzf() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhep extends zzhbe {
    private final zzhev zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    private zzhep(zzhev zzhevVar, zzhxe zzhxeVar, zzhxc zzhxcVar, @Nullable Integer num) {
        this.zza = zzhevVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhep zzd(zzheu zzheuVar, zzhxe zzhxeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZzb;
        zzheu zzheuVar2 = zzheu.zzc;
        if (zzheuVar != zzheuVar2 && num == null) {
            String string = zzheuVar.toString();
            throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzheuVar == zzheuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhxeVar.zzd() != 32) {
            int iZzd = zzhxeVar.zzd();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzd, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 75)));
        }
        zzhev zzhevVarZzb = zzhev.zzb(zzheuVar);
        if (zzhevVarZzb.zzc() == zzheuVar2) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (zzhevVarZzb.zzc() == zzheu.zzb) {
            zzhxcVarZzb = zzhjf.zza(num.intValue());
        } else {
            if (zzhevVarZzb.zzc() != zzheu.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhevVarZzb.zzc().toString()));
            }
            zzhxcVarZzb = zzhjf.zzb(num.intValue());
        }
        return new zzhep(zzhevVarZzb, zzhxeVar, zzhxcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzc;
    }

    public final zzhxe zze() {
        return this.zzb;
    }

    public final zzhev zzf() {
        return this.zza;
    }
}

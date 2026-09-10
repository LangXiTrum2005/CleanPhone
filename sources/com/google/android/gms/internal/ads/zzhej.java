package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhej extends zzhbe {
    private final zzheo zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    private zzhej(zzheo zzheoVar, zzhxe zzhxeVar, zzhxc zzhxcVar, @Nullable Integer num) {
        this.zza = zzheoVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhej zzd(zzheo zzheoVar, zzhxe zzhxeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZzb;
        zzhen zzhenVarZzc = zzheoVar.zzc();
        zzhen zzhenVar = zzhen.zzb;
        if (zzhenVarZzc != zzhenVar && num == null) {
            String string = zzheoVar.zzc().toString();
            throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzheoVar.zzc() == zzhenVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhxeVar.zzd() != 32) {
            int iZzd = zzhxeVar.zzd();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzd, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 68)));
        }
        if (zzheoVar.zzc() == zzhenVar) {
            zzhxcVarZzb = zzhjf.zza;
        } else {
            if (zzheoVar.zzc() != zzhen.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzheoVar.zzc().toString()));
            }
            zzhxcVarZzb = zzhjf.zzb(num.intValue());
        }
        return new zzhej(zzheoVar, zzhxeVar, zzhxcVarZzb, num);
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

    public final zzheo zzf() {
        return this.zza;
    }
}

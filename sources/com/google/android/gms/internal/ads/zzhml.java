package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhml extends zzhmo {
    private final zzhmm zza;
    private final zzhxe zzb;

    private zzhml(zzhmm zzhmmVar, zzhxe zzhxeVar) {
        this.zza = zzhmmVar;
        this.zzb = zzhxeVar;
    }

    public static zzhml zzc(zzhmm zzhmmVar, zzhxe zzhxeVar) throws GeneralSecurityException {
        if (zzhmmVar.zzc() == zzhxeVar.zzd()) {
            return new zzhml(zzhmmVar, zzhxeVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhmo, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return null;
    }

    public final zzhxe zzd() {
        return this.zzb;
    }
}

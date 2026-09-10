package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhka implements zzhke {
    private final zzhxc zza;
    private final zzhpd zzb;

    private zzhka(zzhpd zzhpdVar, zzhxc zzhxcVar) {
        this.zzb = zzhpdVar;
        this.zza = zzhxcVar;
    }

    public static zzhka zza(zzhpd zzhpdVar) {
        return new zzhka(zzhpdVar, zzhkl.zza(zzhpdVar.zza()));
    }

    public static zzhka zzb(zzhpd zzhpdVar) throws GeneralSecurityException {
        return new zzhka(zzhpdVar, zzhkl.zzb(zzhpdVar.zza()));
    }

    public final zzhpd zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhke
    public final zzhxc zzf() {
        return this.zza;
    }
}

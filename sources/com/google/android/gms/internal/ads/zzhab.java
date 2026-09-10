package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhab {
    private boolean zza;

    @Nullable
    private final zzhan zzc;
    private final zzgzz zzb = zzgzz.zza;
    private zzhac zzd = null;

    @Nullable
    private zzhad zze = null;

    public /* synthetic */ zzhab(zzhan zzhanVar, byte[] bArr) {
        this.zzc = zzhanVar;
    }

    public final zzhab zza() {
        zzhad zzhadVar = this.zze;
        if (zzhadVar != null) {
            zzhadVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhab zzb() {
        this.zzd = zzhac.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z2) {
        this.zza = false;
    }

    public final /* synthetic */ zzgzz zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhan zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzhac zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzhad zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzhad zzhadVar) {
        this.zze = zzhadVar;
    }
}

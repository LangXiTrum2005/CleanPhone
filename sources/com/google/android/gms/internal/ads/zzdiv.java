package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiv {
    private final List zza;
    private final zzfpi zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzdiv(zzfhr zzfhrVar, zzfpi zzfpiVar) {
        this.zza = zzfhrVar.zzp;
        this.zzb = zzfpiVar;
        this.zzc = zzfhrVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}

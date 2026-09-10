package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcre implements zzdan {
    private final zzfhu zza;
    private final zzfic zzb;
    private final zzfpe zzc;
    private final zzfpi zzd;

    public zzcre(zzfic zzficVar, zzfpi zzfpiVar, zzfpe zzfpeVar) {
        this.zzb = zzficVar;
        this.zzd = zzfpiVar;
        this.zzc = zzfpeVar;
        this.zza = zzficVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}

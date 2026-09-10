package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzvp implements zzxy {
    private final zzxy zza;
    private final zzgtd zzb;

    public zzvp(zzxy zzxyVar, List list) {
        this.zza = zzxyVar;
        this.zzb = zzgtd.zzq(list);
    }

    public final zzgtd zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        return this.zza.zzm(zzliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        return this.zza.zzn();
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zztp implements zzwa {
    private final zzwa zza;
    private final zzfxn zzb;

    public zztp(zzwa zzwaVar, List list) {
        this.zza = zzwaVar;
        this.zzb = zzfxn.zzl(list);
    }

    public final zzfxn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        return this.zza.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

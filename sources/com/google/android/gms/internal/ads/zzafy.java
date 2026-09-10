package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafy implements zzaer {
    private final long zzb;
    private final zzaer zzc;

    public zzafy(long j, zzaer zzaerVar) {
        this.zzb = j;
        this.zzc = zzaerVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final zzaga zzu(int i2, int i3) {
        return this.zzc.zzu(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzw(zzafr zzafrVar) {
        this.zzc.zzw(new zzafx(this, zzafrVar, zzafrVar));
    }
}

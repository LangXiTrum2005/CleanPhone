package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafw extends zzafc {
    private final long zza;

    public zzafw(zzaep zzaepVar, long j) {
        super(zzaepVar);
        zzgqa.zza(zzaepVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafc, com.google.android.gms.internal.ads.zzaep
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafc, com.google.android.gms.internal.ads.zzaep
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafc, com.google.android.gms.internal.ads.zzaep
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}

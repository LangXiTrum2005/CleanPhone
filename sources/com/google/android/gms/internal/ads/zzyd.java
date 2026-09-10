package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzyd implements zzxw {
    private final zzxw zza;
    private final long zzb;

    public zzyd(zzxw zzxwVar, long j) {
        this.zza = zzxwVar;
        this.zzb = j;
    }

    public final zzxw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzd(zzle zzleVar, zzih zzihVar, int i2) {
        int iZzd = this.zza.zzd(zzleVar, zzihVar, i2);
        if (iZzd != -4) {
            return iZzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}

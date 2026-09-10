package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfol;

/* JADX INFO: loaded from: classes2.dex */
final class zzj implements zzfol {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zza(int i, long j) {
        this.zza.zzi.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int i, long j, String str) {
        this.zza.zzi.zze(i, System.currentTimeMillis() - j, str);
    }
}

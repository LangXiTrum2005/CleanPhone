package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfmr implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfmu.zzc != null) {
            zzfmu.zzc.post(zzfmu.zzd);
            zzfmu.zzc.postDelayed(zzfmu.zze, 200L);
        }
    }
}

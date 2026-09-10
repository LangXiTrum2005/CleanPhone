package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzez {
    final /* synthetic */ zzfa zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzez(zzfa zzfaVar, int i2) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i2;
    }

    public final void zza() {
        zzfa zzfaVar = this.zza;
        int iZzi = zzfaVar.zzd().zzi();
        if (!zzfaVar.zzd().zzk() || zzfaVar.zzd().zzh() == 1 || zzfaVar.zzd().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzfaVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j = jElapsedRealtime - this.zze;
            int i2 = this.zzb;
            if (j >= i2) {
                zzfaVar.zze().zza(new zzfb(4, i2));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzfaVar.zzg().zzk(4);
        zzfaVar.zzg().zzi(4, this.zzb);
    }
}

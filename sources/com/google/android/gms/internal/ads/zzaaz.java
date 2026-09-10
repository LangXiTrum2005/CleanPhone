package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaaz {
    public static final zzaat zza = new zzaat(2, -9223372036854775807L, null);
    public static final zzaat zzb = new zzaat(3, -9223372036854775807L, null);
    private final zzabf zzc = zzabf.zzb(zzfj.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzaas.zza);
    private zzaau zzd;
    private IOException zze;

    public zzaaz(String str) {
    }

    public static zzaat zza(boolean z2, long j) {
        return new zzaat(z2 ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzaav zzaavVar, zzaar zzaarVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaau(this, looperMyLooper, zzaavVar, zzaarVar, i2, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzaau zzaauVar = this.zzd;
        zzaauVar.getClass();
        zzaauVar.zzc(false);
    }

    public final void zzg(zzaaw zzaawVar) {
        zzaau zzaauVar = this.zzd;
        if (zzaauVar != null) {
            zzaauVar.zzc(true);
        }
        zzabf zzabfVar = this.zzc;
        zzabfVar.execute(new zzaax(zzaawVar));
        zzabfVar.zza();
    }

    public final void zzh(int i2) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzaau zzaauVar = this.zzd;
        if (zzaauVar != null) {
            zzaauVar.zza(i2);
        }
    }

    public final /* synthetic */ zzabf zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzaau zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzaau zzaauVar) {
        this.zzd = zzaauVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}

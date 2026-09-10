package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyy {
    public static final zzyr zza = new zzyr(2, C.TIME_UNSET, null);
    public static final zzyr zzb = new zzyr(3, C.TIME_UNSET, null);
    private final zzzg zzc;

    @Nullable
    private zzys zzd;

    @Nullable
    private IOException zze;

    public zzyy(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.zzc = zzze.zza(Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzeg
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        }), new zzdb() { // from class: com.google.android.gms.internal.ads.zzyp
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }

    public static zzyr zzb(boolean z, long j) {
        return new zzyr(z ? 1 : 0, j, null);
    }

    public final long zza(zzyt zzytVar, zzyq zzyqVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzcw.zzb(looperMyLooper);
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzys(this, looperMyLooper, zzytVar, zzyqVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzys zzysVar = this.zzd;
        zzcw.zzb(zzysVar);
        zzysVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zzb(i);
        }
    }

    public final void zzj(@Nullable zzyu zzyuVar) {
        zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zza(true);
        }
        this.zzc.execute(new zzyv(zzyuVar));
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}

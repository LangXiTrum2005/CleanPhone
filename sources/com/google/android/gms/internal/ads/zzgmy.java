package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgmy implements zzglz, zzgcb {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgmy(Context context, zzfzm zzfzmVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final ListenableFuture zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgym.zzb() : zzgym.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzb(Map map) {
        long j;
        long j2;
        zze();
        synchronized (this) {
            try {
                j = this.zzh ? this.zzf - this.zze : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzd(Map map) {
        zze();
    }

    public final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        zzgmw zzgmwVar = new zzgmw(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgmwVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j) {
        this.zzg = j;
    }

    public final /* synthetic */ void zzj(boolean z2) {
        this.zzh = z2;
    }
}

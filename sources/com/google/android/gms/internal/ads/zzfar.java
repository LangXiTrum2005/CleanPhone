package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfar implements zzezx {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgyw zzc;
    private final ScheduledExecutorService zzd;
    private final zzeje zze;
    private final zzfik zzf;
    private final VersionInfoParcel zzg;

    public zzfar(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgyw zzgywVar, ScheduledExecutorService scheduledExecutorService, zzeje zzejeVar, zzfik zzfikVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgywVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzejeVar;
        this.zzf = zzfikVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzezx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfar.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        zzfas zzfasVar;
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlN)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzfasVar = new zzfas("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzfasVar = new zzfas("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzfasVar = new zzfas("", 4, null);
        } else {
            zzfasVar = th instanceof TimeoutException ? new zzfas("", 5, null) : new zzfas("", 0, null);
        }
        return zzgym.zza(zzfasVar);
    }
}

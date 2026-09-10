package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcdo {
    public static final zzgyw zza;
    public static final zzgyw zzb;
    public static final zzgyw zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgyx zze;
    public static final zzgyw zzf;
    public static final zzgyw zzg;

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfxk.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcdl("Default")));
        } else {
            zzbgb zzbgbVar = zzbgk.zzmF;
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar) == null || !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar)).booleanValue()) {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcdl("Default"));
            } else {
                zzbgb zzbgbVar2 = zzbgk.zzmG;
                if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar2) != null) {
                    zzbgb zzbgbVar3 = zzbgk.zzmH;
                    if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcdl("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgbVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcdl("Default"));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcdl("Default"));
                }
            }
        }
        zza = new zzcdn(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZza = zzfxk.zza().zza(5, new zzcdl("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcdl("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor3;
        }
        zzb = new zzcdn(executorServiceZza, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfxk.zza().zzc(new zzcdl("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcdl("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor4;
        }
        zzc = new zzcdn(executorServiceZzc, null);
        zzcdk zzcdkVar = new zzcdk(3, new zzcdl("Schedule"));
        zzd = zzcdkVar;
        zze = zzgzd.zzc(zzcdkVar);
        zzf = new zzcdn(new zzcdm(), null);
        zzg = new zzcdn(zzgzd.zza(), null);
    }
}

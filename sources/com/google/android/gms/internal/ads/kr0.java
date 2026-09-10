package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kr0 f16512a = new kr0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", zzt.zzh().f14139k.get());
        if (((Boolean) zzba.zzc().a(am.bg)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZze = zzf.zze(zzt.zzh().f14133e);
            if (memoryInfoZze != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    bundle.putLong("a_ad_mem", memoryInfoZze.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZze.totalMem);
                bundle.putLong("a_avai", memoryInfoZze.availMem);
                bundle.putLong("a_threshold", memoryInfoZze.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZze.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new fq0(1, bundle);
    }
}

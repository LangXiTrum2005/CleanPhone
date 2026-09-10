package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14627b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f14626a = i10;
        this.f14627b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14626a) {
            case 0:
                ((Executor) this.f14627b).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((zzf) this.f14627b).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    zzt.zzc();
                    zzs.zzP(zzt.zzh().f14133e, th2);
                    throw th2;
                }
            default:
                ((ys0) this.f14627b).e(runnable);
                return;
        }
    }

    public g0() {
        this.f14626a = 1;
        this.f14627b = new zzf(Looper.getMainLooper());
    }
}

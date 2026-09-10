package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb implements na.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ tb f23988b = new tb(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tb f23989c = new tb(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23990a;

    public /* synthetic */ tb(int i10) {
        this.f23990a = i10;
    }

    @Override // na.r
    public final Object get() {
        switch (this.f23990a) {
            case 0:
                Object obj = pb.f23842j;
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(sb.f23966a);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof ta.q0 ? (ta.q0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new ta.t0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z10 = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i10 = runningAppProcessInfo.importance;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17);
                    sb2.append("Memory state is: ");
                    sb2.append(i10);
                    Log.i("PhenotypeProcessReaper", sb2.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z10 = true;
                    }
                } catch (RuntimeException e10) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e10);
                }
                return new Boolean(z10);
        }
    }
}

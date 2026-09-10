package kd;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f44600a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f44601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f44602c;

    static {
        fd.a.d();
    }

    public e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f44601b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f44602c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}

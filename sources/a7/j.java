package a7;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f3431a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3432b = 0;

    public static double a(long j10) {
        return (SystemClock.elapsedRealtimeNanos() - j10) * f3431a;
    }
}

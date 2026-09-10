package jn;

import hn.v;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f44026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f44029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f44030f;

    static {
        String property;
        int i10 = v.f42459a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f44025a = property;
        f44026b = hn.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f42459a;
        if (i11 < 2) {
            i11 = 2;
        }
        f44027c = hn.b.l(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f44028d = hn.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f44029e = TimeUnit.SECONDS.toNanos(hn.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f44030f = g.f44020a;
    }
}

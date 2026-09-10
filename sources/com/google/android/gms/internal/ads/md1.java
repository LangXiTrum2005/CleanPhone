package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class md1 extends tc1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jd1 f17401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ee1 f17402k = new ee1(md1.class, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Set f17403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f17404i;

    static {
        Throwable th2;
        jd1 ld1Var;
        try {
            ld1Var = new kd1();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            ld1Var = new ld1();
        }
        Throwable th4 = th2;
        f17401j = ld1Var;
        if (th4 != null) {
            f17402k.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th4);
        }
    }
}

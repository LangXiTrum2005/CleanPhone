package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd1 extends qe1 implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f13499d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee1 f13500e = new ee1(uc1.class, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f13501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vc1 f13502g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f13503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile rc1 f13504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile cd1 f13505c;

    static {
        boolean z10;
        vc1 xc1Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f13501f = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains(X3.f27645d)) {
            try {
                xc1Var = new bd1();
            } catch (Error | Exception e10) {
                try {
                    xc1Var = new wc1();
                } catch (Error | Exception e11) {
                    th4 = e11;
                    xc1Var = new xc1();
                }
                th2 = th4;
                th3 = e10;
            }
        } else {
            try {
                xc1Var = new wc1();
            } catch (NoClassDefFoundError unused2) {
                xc1Var = new xc1();
            }
        }
        th2 = null;
        th3 = null;
        f13502g = xc1Var;
        if (th2 != null) {
            ee1 ee1Var = f13500e;
            Logger loggerB = ee1Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            ee1Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void b(cd1 cd1Var) {
        cd1Var.f13139a = null;
        while (true) {
            cd1 cd1Var2 = this.f13505c;
            if (cd1Var2 != cd1.f13138c) {
                cd1 cd1Var3 = null;
                while (cd1Var2 != null) {
                    cd1 cd1Var4 = cd1Var2.f13140b;
                    if (cd1Var2.f13139a != null) {
                        cd1Var3 = cd1Var2;
                    } else if (cd1Var3 != null) {
                        cd1Var3.f13140b = cd1Var4;
                        if (cd1Var3.f13139a == null) {
                        }
                    } else if (!f13502g.i(this, cd1Var2, cd1Var4)) {
                    }
                    cd1Var2 = cd1Var4;
                }
                return;
            }
            return;
        }
    }
}

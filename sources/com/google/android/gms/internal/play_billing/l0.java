package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.ee1;
import com.ironsource.X3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends v0 implements s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f24397d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee1 f24398e = new ee1(u0.class, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f24399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a.a f24400g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f24401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile f0 f24402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile k0 f24403c;

    static {
        boolean z10;
        a.a i0Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f24399f = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains(X3.f27645d)) {
            try {
                i0Var = new j0();
            } catch (Error | Exception e10) {
                try {
                    i0Var = new h0();
                } catch (Error | Exception e11) {
                    th4 = e11;
                    i0Var = new i0();
                }
                th2 = th4;
                th3 = e10;
            }
        } else {
            try {
                i0Var = new h0();
            } catch (NoClassDefFoundError unused2) {
                i0Var = new i0();
            }
        }
        th2 = null;
        th3 = null;
        f24400g = i0Var;
        if (th2 != null) {
            ee1 ee1Var = f24398e;
            Logger loggerB = ee1Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            ee1Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void b(k0 k0Var) {
        k0Var.f24393a = null;
        while (true) {
            k0 k0Var2 = this.f24403c;
            if (k0Var2 != k0.f24392c) {
                k0 k0Var3 = null;
                while (k0Var2 != null) {
                    k0 k0Var4 = k0Var2.f24394b;
                    if (k0Var2.f24393a != null) {
                        k0Var3 = k0Var2;
                    } else if (k0Var3 != null) {
                        k0Var3.f24394b = k0Var4;
                        if (k0Var3.f24393a == null) {
                        }
                    } else if (!f24400g.O(this, k0Var2, k0Var4)) {
                    }
                    k0Var2 = k0Var4;
                }
                return;
            }
            return;
        }
    }
}

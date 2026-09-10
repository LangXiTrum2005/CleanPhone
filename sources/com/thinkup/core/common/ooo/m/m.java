package com.thinkup.core.common.ooo.m;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final int m = 2;
    public static final int m0 = 8;
    public static final int mm = 10;
    public static final int mn = 11;
    public static final int mo = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42326n = 3;
    public static final int n0 = 12;
    public static final int nm = 14;
    public static final int nn = 15;
    public static final int no = 13;
    public static final int o = 1;
    public static final int o0 = 4;
    public static final int o00 = 16;
    public static final int o0m = 18;
    private static volatile m o0n = null;
    public static final int o0o = 17;
    public static final int om = 6;
    public static final int on = 7;
    public static final int oo = 5;
    private final o oo0 = new o();

    private m() {
    }

    private void n(Runnable runnable) {
        n(runnable, 13);
    }

    public static m o() {
        if (o0n == null) {
            synchronized (m.class) {
                try {
                    if (o0n == null) {
                        o0n = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0n;
    }

    private static void o0() {
    }

    private static boolean oo() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final void m(Runnable runnable, int i2) {
        o(runnable, 0L, i2);
    }

    private void o0(Runnable runnable) {
        o(runnable, 0L, 2);
    }

    private void oo(Runnable runnable) {
        o(runnable, 0L, 2);
    }

    public final void m(final Runnable runnable) {
        if (TextUtils.equals(Thread.currentThread().getName(), o.m(6))) {
            runnable.run();
        } else if (runnable != null) {
            o0 o0Var = new o0() { // from class: com.thinkup.core.common.ooo.m.m.2
                @Override // com.thinkup.core.common.ooo.m.o0
                public final void o() {
                    runnable.run();
                }
            };
            o0Var.o(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            o(o0Var, 6);
        }
    }

    public final void n(Runnable runnable, int i2) {
        if (oo()) {
            o(runnable, i2);
        } else {
            runnable.run();
        }
    }

    public final ExecutorService n() {
        o oVar = this.oo0;
        if (oVar != null) {
            return oVar.m();
        }
        return null;
    }

    public final void o(o0 o0Var, int i2) {
        try {
            this.oo0.o(o0Var, i2);
        } catch (Throwable unused) {
        }
    }

    private void m(Runnable runnable, long j) {
        o(runnable, j, 2);
    }

    public final void o(Runnable runnable, long j) {
        o(runnable, j, 2);
    }

    public final Executor m() {
        o oVar = this.oo0;
        if (oVar != null) {
            return oVar.o();
        }
        return null;
    }

    public final void o(final Runnable runnable, final long j, int i2) {
        if (runnable != null) {
            o0 o0Var = new o0() { // from class: com.thinkup.core.common.ooo.m.m.1
                @Override // com.thinkup.core.common.ooo.m.o0
                public final void o() {
                    long j2 = j;
                    if (j2 > 0) {
                        try {
                            Thread.sleep(j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                    m();
                    runnable.run();
                }
            };
            o0Var.o(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            o(o0Var, i2);
        }
    }

    public final Handler o(int i2) {
        return this.oo0.o(i2);
    }

    public final void o(Runnable runnable) {
        o(runnable, 0L, 2);
    }

    public final void o(Runnable runnable, int i2) {
        o(runnable, 0L, i2);
    }
}

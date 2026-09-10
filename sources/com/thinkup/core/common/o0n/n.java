package com.thinkup.core.common.o0n;

import android.os.SystemClock;
import com.thinkup.core.common.n.o0n;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Runnable f42161n;
    long o;
    boolean o0;
    m om;
    private final o on;
    boolean oo;

    private n(long j, Runnable runnable) {
        this.o0 = false;
        this.oo = true;
        this.on = o0.o();
        this.om = new m() { // from class: com.thinkup.core.common.o0n.n.1
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = n.this;
                nVar.o0 = false;
                nVar.m = -1L;
                if (nVar.oo) {
                    o0n.m().m(n.this.f42161n);
                } else {
                    o0n.m();
                    o0n.n(n.this.f42161n);
                }
            }
        };
        this.m = j;
        this.f42161n = runnable;
    }

    private synchronized void n() {
        if (this.o0) {
            this.o0 = false;
            this.m -= SystemClock.elapsedRealtime() - this.o;
            this.on.o(this.om);
        }
    }

    public final synchronized void m() {
        this.o0 = false;
        this.on.o(this.om);
        this.m = -1L;
    }

    public final synchronized void o() {
        if (this.m >= 0 && !this.o0) {
            this.o0 = true;
            this.o = SystemClock.elapsedRealtime();
            this.on.o(this.om, this.m, false);
        }
    }

    public n(long j, Runnable runnable, byte b2) {
        this(j, runnable);
        this.oo = false;
    }
}

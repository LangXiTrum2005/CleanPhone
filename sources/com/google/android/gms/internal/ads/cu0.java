package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9.a f13251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0 f13252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13253c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f13255e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f13254d = 0;

    public cu0(p9.a aVar, yh0 yh0Var) {
        this.f13251a = aVar;
        this.f13252b = yh0Var;
    }

    public final void a(boolean z10) {
        if (((Boolean) zzba.zzc().a(am.Me)).booleanValue()) {
            lj1 lj1VarA = this.f13252b.a();
            lj1VarA.l("action", "mbs_state");
            lj1VarA.l("mbs_state", true != z10 ? "0" : "1");
            lj1VarA.m();
        }
        if (z10) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        ((p9.b) this.f13251a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f13253c) {
            try {
                if (this.f13255e == 3) {
                    if (this.f13254d + ((Long) zzba.zzc().a(am.f12066a7)).longValue() <= jCurrentTimeMillis) {
                        this.f13255e = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(int i10, int i11) {
        b();
        Object obj = this.f13253c;
        ((p9.b) this.f13251a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f13255e != i10) {
                    return;
                }
                this.f13255e = i11;
                if (this.f13255e == 3) {
                    this.f13254d = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

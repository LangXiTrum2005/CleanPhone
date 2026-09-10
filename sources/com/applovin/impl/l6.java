package com.applovin.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f8349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8350h;

    public l6(u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.f8349g = new WeakReference(u4Var);
        this.f8350h = obj;
    }

    public static void a(long j10, u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        if (j10 <= 0) {
            return;
        }
        lVar.s0().a(new l6(u4Var, obj, str, lVar), f6.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        u4 u4Var = (u4) this.f8349g.get();
        if (u4Var == null || u4Var.d()) {
            return;
        }
        this.f8297a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8297a.Q().d(this.f8298b, "Attempting to timeout pending task " + u4Var.c() + " with " + this.f8350h);
        }
        u4Var.c(this.f8350h);
    }
}

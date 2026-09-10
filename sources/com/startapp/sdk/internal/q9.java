package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9 f41398a;

    public q9(w9 w9Var) {
        this.f41398a = w9Var;
    }

    public final void a(g9 g9Var, int i2) {
        try {
            w9 w9Var = this.f41398a;
            w9Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            m8 m8Var = w9Var.f41623b;
            m8Var.f41243a.post(new r9(w9Var, g9Var, i2, jCurrentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}

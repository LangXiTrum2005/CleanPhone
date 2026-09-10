package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d31 f11921a;

    public a71(c21 c21Var, d31 d31Var) {
        this.f11921a = d31Var;
    }

    public final y61 a(int i10) {
        return new y61(i10, this.f11921a);
    }

    public final void b(int i10) {
        ((g31) this.f11921a).a(i10 - 1, -1L, null, null);
    }

    public final void c(int i10, String str) {
        ((g31) this.f11921a).a(i10 - 1, -1L, str, null);
    }

    public final void d(Throwable th2, int i10) {
        ((g31) this.f11921a).a(i10 - 1, -1L, null, th2);
    }

    public final void e(int i10, ListenableFuture listenableFuture) {
        y61 y61VarA = a(i10);
        y61VarA.a();
        listenableFuture.addListener(new zd1(0, listenableFuture, new z61(this, y61VarA)), td1.f20333a);
    }

    public final void f(int i10, Runnable runnable) {
        y61 y61VarA = a(i10);
        try {
            y61VarA.a();
            runnable.run();
            y61VarA.c();
        } catch (Throwable th2) {
            try {
                y61VarA.b(th2);
                throw th2;
            } catch (Throwable th3) {
                y61VarA.c();
                throw th3;
            }
        }
    }
}

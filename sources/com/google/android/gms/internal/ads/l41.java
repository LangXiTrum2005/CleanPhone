package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.InterfaceC0435l1;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l41 implements t41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd f16710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y61 f16711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16712d;

    public l41(xd xdVar, Map map, h21 h21Var, a71 a71Var) {
        this.f16709a = map;
        this.f16710b = xdVar;
        this.f16711c = a71Var.a(InterfaceC0435l1.d.b.f29113j);
        this.f16712d = h21Var.X();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        je jeVar;
        try {
            try {
                this.f16711c.a();
                ListenableFuture listenableFuture = (ListenableFuture) this.f16709a.get("gs");
                if (listenableFuture != null && (jeVar = (je) listenableFuture.get(this.f16712d, TimeUnit.MILLISECONDS)) != null) {
                    xd xdVar = this.f16710b;
                    synchronized (xdVar) {
                        se seVarY0 = jeVar.y0();
                        xdVar.b();
                        ((je) xdVar.f19193b).n0(seVarY0);
                        long jW0 = jeVar.w0();
                        xdVar.b();
                        ((je) xdVar.f19193b).W(jW0);
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e10) {
                this.f16711c.b(e10);
            }
            this.f16711c.c();
            return null;
        } catch (Throwable th2) {
            this.f16711c.c();
            throw th2;
        }
    }
}

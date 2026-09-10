package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 implements na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je0 f14383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke0 f14384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f14385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f14386d;

    public ff0(je0 je0Var, ke0 ke0Var, Executor executor, k00 k00Var) {
        this.f14383a = je0Var;
        this.f14384b = ke0Var;
        this.f14385c = executor;
        this.f14386d = k00Var;
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        m00 m00Var;
        if (this.f14384b.f16416e) {
            je0 je0Var = this.f14383a;
            km0 km0VarK = je0Var.k();
            if (km0VarK == null) {
                synchronized (je0Var) {
                    listenableFuture = je0Var.f16061m;
                }
                if (listenableFuture != null && ((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue()) {
                    synchronized (je0Var) {
                        listenableFuture2 = je0Var.f16061m;
                    }
                    synchronized (je0Var) {
                        m00Var = je0Var.f16062n;
                    }
                    if (listenableFuture2 == null || m00Var == null) {
                        return;
                    }
                    pd1 pd1Var = new pd1(ca1.z(new ListenableFuture[]{listenableFuture2, m00Var}), false);
                    pd1Var.addListener(new zd1(0, pd1Var, new x11(this, 15)), this.f14386d);
                    return;
                }
            }
            if (km0VarK != null) {
                b30 b30VarJ = je0Var.j();
                b30 b30VarH = je0Var.h();
                if (b30VarJ == null) {
                    b30VarJ = b30VarH == null ? null : b30VarH;
                }
                if (b30VarJ != null) {
                    this.f14385c.execute(new m30(b30VarJ, 5));
                }
            }
        }
    }
}

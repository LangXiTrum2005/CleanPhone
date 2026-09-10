package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q31 implements b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h21 f18911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p31 f18912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n31 f18913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f18914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a71 f18915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f18916f = new AtomicReference();

    public q31(h21 h21Var, p31 p31Var, n31 n31Var, ExecutorService executorService, a71 a71Var) {
        this.f18911a = h21Var;
        this.f18912b = p31Var;
        this.f18913c = n31Var;
        this.f18914d = executorService;
        this.f18915e = a71Var;
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        h21 h21Var = this.f18911a;
        int I = h21Var.I();
        boolean zN = h21Var.N();
        p31 p31Var = this.f18912b;
        p31Var.getClass();
        vd1 vd1VarR = vd1.r(zw1.o(p31Var.f18472d, new o31(p31Var, I)));
        c60 c60Var = c60.f13068n;
        td1 td1Var = td1.f20333a;
        fd1 fd1VarX = zw1.x(vd1VarR, c60Var, td1Var);
        if (zN && I != p31Var.f18474f) {
            fd1VarX = zw1.x(zw1.t(vd1.r(fd1VarX), Throwable.class, i6.f15620u, td1Var), new rr(p31Var), td1Var);
        }
        gd1 gd1VarZ = zw1.z(vd1.r(fd1VarX), new lx(this, 9), td1Var);
        gd1VarZ.addListener(new zd1(0, gd1VarZ, new wv0(this, 4)), this.f18914d);
        return gd1VarZ;
    }
}

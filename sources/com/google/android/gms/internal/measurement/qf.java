package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.ads.z40;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf implements ta.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z40 f23902b;

    public /* synthetic */ qf(z40 z40Var, int i10) {
        this.f23901a = i10;
        this.f23902b = z40Var;
    }

    @Override // ta.y
    public final ListenableFuture call() {
        ListenableFuture listenableFutureA;
        int i10 = this.f23901a;
        z40 z40Var = this.f23902b;
        int i11 = 4;
        switch (i10) {
            case 0:
                ta.u0 u0Var = (ta.u0) z40Var.f22494d;
                try {
                    return ta.k0.d(z40Var.d((Uri) ta.k0.b((ListenableFuture) z40Var.f22492b)));
                } catch (IOException e10) {
                    na.p pVar = (na.p) z40Var.f22496f;
                    pVar.getClass();
                    if ((e10 instanceof af) || (e10.getCause() instanceof af)) {
                        return ta.k0.c(e10);
                    }
                    tf tfVar = (tf) pVar.f46635a;
                    tfVar.getClass();
                    if (e10.getCause() instanceof u1) {
                        ta.n0 n0VarD = ta.k0.d(tfVar.f23997a);
                        pf pfVar = new pf(z40Var, 2);
                        int i12 = tg.f23998a;
                        listenableFutureA = ta.k0.a(ta.k0.g(n0VarD, new ce(i11, dg.a(), pfVar), u0Var), IOException.class, new pd(e10, 5), ta.c0.f50592a);
                    } else {
                        listenableFutureA = ta.k0.c(e10);
                    }
                    pf pfVar2 = new pf(z40Var, 1);
                    int i13 = tg.f23998a;
                    return ta.k0.g(listenableFutureA, new ce(i11, dg.a(), pfVar2), u0Var);
                }
            default:
                pf pfVar3 = new pf(z40Var, 3);
                int i14 = tg.f23998a;
                return ta.k0.e(ta.k0.g((ListenableFuture) z40Var.f22492b, new ce(i11, dg.a(), pfVar3), (ta.u0) z40Var.f22494d));
        }
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.z40;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta.s f23743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z40 f23744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.s1 f23745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.x f23746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.x f23747f = new com.google.android.gms.internal.consent_sdk.x(new h6(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f23748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f23749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23750i;

    public mf(z40 z40Var, ta.s sVar) {
        Object obj = new Object();
        this.f23748g = obj;
        this.f23750i = new ArrayList();
        this.f23744c = z40Var;
        this.f23743b = sVar;
        this.f23742a = (String) z40Var.f22491a;
        this.f23746e = new com.google.android.gms.internal.consent_sdk.x(new qf(z40Var, 1));
        this.f23745d = new m0.s1(26);
        this.f23749h = new f1(16);
        pd pdVar = new pd(this, 4);
        synchronized (obj) {
            this.f23750i.add(pdVar);
        }
    }

    public final ta.t a(sd sdVar, ta.q0 q0Var) {
        pd pdVar = new pd(sdVar, 3);
        int i10 = tg.f23998a;
        ce ceVar = new ce(4, dg.a(), pdVar);
        qk.i0 i0Var = vg.f24100a;
        go.k.o(i0Var, "ticker");
        i0Var.Z();
        String strConcat = "Update ".concat(String.valueOf(this.f23742a));
        this.f23749h.getClass();
        kg kgVarD = f1.d(strConcat);
        try {
            ta.r rVarF = this.f23747f.F();
            m0.s1 s1Var = this.f23745d;
            q6 q6Var = new q6(rVarF, 16);
            ta.c0 c0Var = ta.c0.f50592a;
            s1Var.s(q6Var, c0Var);
            ListenableFuture listenableFutureS = s1Var.s(tg.a(new d8(this, rVarF, ceVar, q0Var, 3)), c0Var);
            ta.k0.propagateCancellation(listenableFutureS, rVarF);
            ta.k0.e(this.f23743b);
            ta.t tVarF = ta.k0.f(listenableFutureS, new na.f(), c0Var);
            kgVarD.a(tVarF);
            kgVarD.close();
            return tVarF;
        } catch (Throwable th2) {
            try {
                kgVarD.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}

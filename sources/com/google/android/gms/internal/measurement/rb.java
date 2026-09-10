package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23930b;

    public /* synthetic */ rb(Object obj, int i10) {
        this.f23929a = i10;
        this.f23930b = obj;
    }

    @Override // na.r
    public final Object get() {
        int i10 = this.f23929a;
        Object obj = this.f23930b;
        switch (i10) {
            case 0:
                Object obj2 = pb.f23842j;
                return new te((ArrayList) obj);
            default:
                oe oeVar = (oe) obj;
                ta.q0 q0Var = (ta.q0) oeVar.f23811c.get();
                q0Var.getClass();
                ic icVar = (ic) oeVar.f23810b.get();
                icVar.getClass();
                bb bbVar = icVar.f23582a;
                com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
                mVarB.f11732d = new q6(bbVar, 8);
                mVarB.f11729a = new i9.c[]{h.f23524c};
                mVarB.f11730b = false;
                ta.a aVarB = ic.b(bbVar.c(0, mVarB.a()));
                e3 e3Var = e3.f23410e;
                int i11 = ta.c.l;
                ta.b bVar = new ta.b(aVarB, gc.class, e3Var);
                aVarB.addListener(bVar, t9.e.s(q0Var, bVar));
                ta.t tVarF = ta.k0.f(bVar, new sd(oeVar, 2), q0Var);
                tVarF.addListener(new ae(tVarF, 4), q0Var);
                return tVarF;
        }
    }
}

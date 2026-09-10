package com.google.android.gms.internal.measurement;

import com.ironsource.Xa;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na.r f24036b;

    public /* synthetic */ ub(na.r rVar, int i10) {
        this.f24035a = i10;
        this.f24036b = rVar;
    }

    @Override // na.r
    public final Object get() {
        int i10 = this.f24035a;
        na.r rVar = this.f24036b;
        switch (i10) {
            case 0:
                Object obj = pb.f23842j;
                return (he) ((na.h) rVar.get()).h();
            default:
                ta.q0 q0Var = (ta.q0) rVar.get();
                q0Var.getClass();
                v7 v7Var = v7.f24080c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ta.x0 x0Var = new ta.x0(v7Var);
                return new ta.r0(x0Var, ((ta.t0) q0Var).f50653b.schedule(x0Var, Xa.f27908s, timeUnit));
        }
    }
}

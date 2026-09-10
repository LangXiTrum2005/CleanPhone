package qm;

import pm.c0;
import pm.m0;
import pm.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends pm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f49171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f49172b;

    public a(b bVar, w0 w0Var) {
        this.f49171a = bVar;
        this.f49172b = w0Var;
    }

    @Override // pm.c
    public final sm.d y(m0 state, sm.c type) {
        kotlin.jvm.internal.n.f(state, "state");
        kotlin.jvm.internal.n.f(type, "type");
        b bVar = this.f49171a;
        c0 c0VarG0 = bVar.g0(this.f49172b.g(1, bVar.q0(type)));
        kotlin.jvm.internal.n.c(c0VarG0);
        return c0VarG0;
    }
}

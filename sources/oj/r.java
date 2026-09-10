package oj;

import fn.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f47524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f47526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i0 i0Var, ak.f fVar) {
        super(fVar);
        this.f47526h = i0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f47524f = obj;
        this.f47525g |= Integer.MIN_VALUE;
        return this.f47526h.emit(null, this);
    }
}

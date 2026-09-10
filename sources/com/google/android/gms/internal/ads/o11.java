package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ln.c f18084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f18086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w11 f18087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18088j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(w11 w11Var, ck.c cVar) {
        super(cVar);
        this.f18087i = w11Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f18086h = obj;
        this.f18088j |= Integer.MIN_VALUE;
        return w11.f(this.f18087i, this);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k11 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ln.a f16263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w11 f16265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(w11 w11Var, ck.c cVar) {
        super(cVar);
        this.f16265h = w11Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f16264g = obj;
        this.f16266i |= Integer.MIN_VALUE;
        return this.f16265h.a(this);
    }
}

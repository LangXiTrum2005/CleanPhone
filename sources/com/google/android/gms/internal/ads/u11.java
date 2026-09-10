package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f20568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w11 f20569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20570j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(w11 w11Var, ck.c cVar) {
        super(cVar);
        this.f20569i = w11Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f20568h = obj;
        this.f20570j |= Integer.MIN_VALUE;
        return w11.i(this.f20569i, this);
    }
}

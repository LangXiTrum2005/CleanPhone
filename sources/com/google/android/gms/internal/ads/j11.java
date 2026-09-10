package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j11 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f15910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w11 f15912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(w11 w11Var, ck.c cVar) {
        super(cVar);
        this.f15912i = w11Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f15911h = obj;
        this.f15913j |= Integer.MIN_VALUE;
        return this.f15912i.b(0L, this);
    }
}

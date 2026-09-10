package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f19273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w11 f19275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r11(w11 w11Var, ck.c cVar) {
        super(cVar);
        this.f19275i = w11Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f19274h = obj;
        this.f19276j |= Integer.MIN_VALUE;
        return w11.j(this.f19275i, this);
    }
}

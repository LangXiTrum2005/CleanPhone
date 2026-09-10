package jh;

import fn.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f43869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f43871h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i0 i0Var, ak.f fVar) {
        super(fVar);
        this.f43871h = i0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f43869f = obj;
        this.f43870g |= Integer.MIN_VALUE;
        return this.f43871h.emit(null, this);
    }
}

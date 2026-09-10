package jh;

import fn.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f43864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f43866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i0 i0Var, ak.f fVar) {
        super(fVar);
        this.f43866h = i0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f43864f = obj;
        this.f43865g |= Integer.MIN_VALUE;
        return this.f43866h.emit(null, this);
    }
}

package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f47505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fn.u f47507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fn.u uVar, ak.f fVar) {
        super(fVar);
        this.f47507h = uVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f47505f = obj;
        this.f47506g |= Integer.MIN_VALUE;
        return this.f47507h.emit(null, this);
    }
}

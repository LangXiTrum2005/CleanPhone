package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f47527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.d f47528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f47529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w0.d dVar, boolean z10, ak.f fVar) {
        super(2, fVar);
        this.f47528g = dVar;
        this.f47529h = z10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        s sVar = new s(this.f47528g, this.f47529h, fVar);
        sVar.f47527f = obj;
        return sVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) create((w0.b) obj, (ak.f) obj2);
        wj.r rVar = wj.r.f53297a;
        sVar.invokeSuspend(rVar);
        return rVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        w0.b bVar = (w0.b) this.f47527f;
        t9.e.z(obj);
        bVar.e(this.f47528g, Boolean.valueOf(this.f47529h));
        return wj.r.f53297a;
    }
}

package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f47547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.d f47548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f47549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w0.d dVar, long j10, ak.f fVar) {
        super(2, fVar);
        this.f47548g = dVar;
        this.f47549h = j10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        x xVar = new x(this.f47548g, this.f47549h, fVar);
        xVar.f47547f = obj;
        return xVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((w0.b) obj, (ak.f) obj2);
        wj.r rVar = wj.r.f53297a;
        xVar.invokeSuspend(rVar);
        return rVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        w0.b bVar = (w0.b) this.f47547f;
        t9.e.z(obj);
        bVar.e(this.f47548g, new Long(this.f47549h));
        return wj.r.f53297a;
    }
}

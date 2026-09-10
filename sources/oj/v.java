package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f47540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.d f47541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f47542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w0.d dVar, double d10, ak.f fVar) {
        super(2, fVar);
        this.f47541g = dVar;
        this.f47542h = d10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        v vVar = new v(this.f47541g, this.f47542h, fVar);
        vVar.f47540f = obj;
        return vVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        v vVar = (v) create((w0.b) obj, (ak.f) obj2);
        wj.r rVar = wj.r.f53297a;
        vVar.invokeSuspend(rVar);
        return rVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        w0.b bVar = (w0.b) this.f47540f;
        t9.e.z(obj);
        bVar.e(this.f47541g, new Double(this.f47542h));
        return wj.r.f53297a;
    }
}

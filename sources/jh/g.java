package jh;

import go.k;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f43877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f43878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j10, ak.f fVar) {
        super(2, fVar);
        this.f43878g = j10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        g gVar = new g(this.f43878g, fVar);
        gVar.f43877f = obj;
        return gVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((w0.b) obj, (ak.f) obj2);
        r rVar = r.f53297a;
        gVar.invokeSuspend(rVar);
        return rVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        w0.b bVar = (w0.b) this.f43877f;
        t9.e.z(obj);
        w0.d dVarQ = k.Q("last_asset_date");
        Long l = new Long(this.f43878g);
        bVar.getClass();
        bVar.f(dVarQ, l);
        return r.f53297a;
    }
}

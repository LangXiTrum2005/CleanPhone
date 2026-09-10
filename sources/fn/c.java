package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ck.i f41037f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(jk.c cVar, ak.k kVar, int i10, en.a aVar) {
        super(cVar, kVar, i10, aVar);
        this.f41037f = (ck.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fn.d
    public final Object e(en.r rVar, ak.f fVar) {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f41033i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f41033i = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (ck.c) fVar);
            }
        } else {
            bVar = new b(this, (ck.c) fVar);
        }
        Object obj = bVar.f41031g;
        int i11 = bVar.f41033i;
        if (i11 == 0) {
            t9.e.z(obj);
            bVar.f41030f = rVar;
            bVar.f41033i = 1;
            Object objE = super.e(rVar, bVar);
            Object obj2 = bk.a.f5708a;
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = bVar.f41030f;
            t9.e.z(obj);
        }
        if (((en.q) rVar).f40176d.w()) {
            return wj.r.f53297a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ck.i, jk.c] */
    @Override // fn.d
    public final d f(ak.k kVar, int i10, en.a aVar) {
        return new c(this.f41037f, kVar, i10, aVar);
    }
}

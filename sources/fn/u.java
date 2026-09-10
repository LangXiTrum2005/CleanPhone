package fn;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41164d;

    public u(f fVar, w0.d dVar, oj.z zVar) {
        this.f41161a = 3;
        this.f41162b = fVar;
        this.f41163c = dVar;
        this.f41164d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) throws Throwable {
        t tVar;
        x xVar;
        oj.m mVar;
        switch (this.f41161a) {
            case 0:
                f fVar2 = (f) this.f41162b;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f41163c;
                if (fVar instanceof t) {
                    tVar = (t) fVar;
                    int i10 = tVar.f41154i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tVar.f41154i = i10 - Integer.MIN_VALUE;
                    } else {
                        tVar = new t(this, fVar);
                    }
                } else {
                    tVar = new t(this, fVar);
                }
                Object objInvoke = tVar.f41152g;
                int i11 = tVar.f41154i;
                wj.r rVar = wj.r.f53297a;
                bk.a aVar = bk.a.f5708a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj = tVar.f41151f;
                            t9.e.z(objInvoke);
                        } else if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    t9.e.z(objInvoke);
                    return rVar;
                }
                t9.e.z(objInvoke);
                if (yVar.f44766a) {
                    tVar.f41151f = null;
                    tVar.f41154i = 1;
                    if (fVar2.emit(obj, tVar) != aVar) {
                        return rVar;
                    }
                } else {
                    androidx.lifecycle.p pVar = (androidx.lifecycle.p) this.f41164d;
                    tVar.f41151f = obj;
                    tVar.f41154i = 2;
                    objInvoke = pVar.invoke(obj, tVar);
                    if (objInvoke != aVar) {
                    }
                }
                return aVar;
                if (((Boolean) objInvoke).booleanValue()) {
                    return rVar;
                }
                yVar.f44766a = true;
                tVar.f41151f = null;
                tVar.f41154i = 3;
                if (fVar2.emit(obj, tVar) != aVar) {
                    return rVar;
                }
                return aVar;
            case 1:
                f fVar3 = (f) this.f41162b;
                if (fVar instanceof x) {
                    xVar = (x) fVar;
                    int i12 = xVar.f41185h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        xVar.f41185h = i12 - Integer.MIN_VALUE;
                    } else {
                        xVar = new x(this, fVar);
                    }
                } else {
                    xVar = new x(this, fVar);
                }
                Object obj2 = xVar.f41183f;
                int i13 = xVar.f41185h;
                wj.r rVar2 = wj.r.f53297a;
                if (i13 != 0) {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj2);
                    return rVar2;
                }
                t9.e.z(obj2);
                kotlin.jvm.internal.a0 a0Var = (kotlin.jvm.internal.a0) this.f41163c;
                int i14 = a0Var.f44754a + 1;
                a0Var.f44754a = i14;
                bk.a aVar2 = bk.a.f5708a;
                if (i14 < 1) {
                    xVar.f41185h = 1;
                    if (fVar3.emit(obj, xVar) != aVar2) {
                        return rVar2;
                    }
                } else {
                    xVar.f41185h = 2;
                    g.d(fVar3, obj, this.f41164d, xVar);
                }
                return aVar2;
            case 2:
                Object objA = gn.b.a((ak.k) this.f41163c, obj, this.f41162b, (b4.c) this.f41164d, fVar);
                return objA == bk.a.f5708a ? objA : wj.r.f53297a;
            default:
                if (fVar instanceof oj.m) {
                    mVar = (oj.m) fVar;
                    int i15 = mVar.f47506g;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        mVar.f47506g = i15 - Integer.MIN_VALUE;
                    } else {
                        mVar = new oj.m(this, fVar);
                    }
                } else {
                    mVar = new oj.m(this, fVar);
                }
                Object obj3 = mVar.f47505f;
                int i16 = mVar.f47506g;
                if (i16 == 0) {
                    t9.e.z(obj3);
                    f fVar4 = (f) this.f41162b;
                    Double d10 = (Double) oj.a0.c(((w0.b) obj).c((w0.d) this.f41163c), ((oj.z) this.f41164d).f47556c);
                    mVar.f47506g = 1;
                    Object objEmit = fVar4.emit(d10, mVar);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objEmit == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj3);
                }
                return wj.r.f53297a;
        }
    }

    public /* synthetic */ u(Serializable serializable, f fVar, Object obj, int i10) {
        this.f41161a = i10;
        this.f41163c = serializable;
        this.f41162b = fVar;
        this.f41164d = obj;
    }

    public u(f fVar, ak.k kVar) {
        this.f41161a = 2;
        this.f41163c = kVar;
        this.f41162b = hn.b.m(kVar);
        this.f41164d = new b4.c(fVar, (ak.f) null, 6);
    }
}

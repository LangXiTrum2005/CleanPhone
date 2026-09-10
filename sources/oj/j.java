package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements fn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fn.f f47494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0.d f47495c;

    public /* synthetic */ j(fn.f fVar, w0.d dVar, int i10) {
        this.f47493a = i10;
        this.f47494b = fVar;
        this.f47495c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        i iVar;
        n nVar;
        p pVar;
        q qVar;
        switch (this.f47493a) {
            case 0:
                if (fVar instanceof i) {
                    iVar = (i) fVar;
                    int i10 = iVar.f47491g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        iVar.f47491g = i10 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, fVar);
                    }
                } else {
                    iVar = new i(this, fVar);
                }
                Object obj2 = iVar.f47490f;
                int i11 = iVar.f47491g;
                if (i11 == 0) {
                    t9.e.z(obj2);
                    Object objC = ((w0.b) obj).c(this.f47495c);
                    iVar.f47491g = 1;
                    Object objEmit = this.f47494b.emit(objC, iVar);
                    bk.a aVar = bk.a.f5708a;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj2);
                }
                return wj.r.f53297a;
            case 1:
                if (fVar instanceof n) {
                    nVar = (n) fVar;
                    int i12 = nVar.f47509g;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        nVar.f47509g = i12 - Integer.MIN_VALUE;
                    } else {
                        nVar = new n(this, fVar);
                    }
                } else {
                    nVar = new n(this, fVar);
                }
                Object obj3 = nVar.f47508f;
                int i13 = nVar.f47509g;
                if (i13 == 0) {
                    t9.e.z(obj3);
                    Object objC2 = ((w0.b) obj).c(this.f47495c);
                    nVar.f47509g = 1;
                    Object objEmit2 = this.f47494b.emit(objC2, nVar);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objEmit2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj3);
                }
                return wj.r.f53297a;
            case 2:
                if (fVar instanceof p) {
                    pVar = (p) fVar;
                    int i14 = pVar.f47519g;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pVar.f47519g = i14 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p(this, fVar);
                    }
                } else {
                    pVar = new p(this, fVar);
                }
                Object obj4 = pVar.f47518f;
                int i15 = pVar.f47519g;
                if (i15 == 0) {
                    t9.e.z(obj4);
                    Object objC3 = ((w0.b) obj).c(this.f47495c);
                    pVar.f47519g = 1;
                    Object objEmit3 = this.f47494b.emit(objC3, pVar);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj4);
                }
                return wj.r.f53297a;
            default:
                if (fVar instanceof q) {
                    qVar = (q) fVar;
                    int i16 = qVar.f47522g;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qVar.f47522g = i16 - Integer.MIN_VALUE;
                    } else {
                        qVar = new q(this, fVar);
                    }
                } else {
                    qVar = new q(this, fVar);
                }
                Object obj5 = qVar.f47521f;
                int i17 = qVar.f47522g;
                if (i17 == 0) {
                    t9.e.z(obj5);
                    Object objC4 = ((w0.b) obj).c(this.f47495c);
                    qVar.f47522g = 1;
                    Object objEmit4 = this.f47494b.emit(objC4, qVar);
                    bk.a aVar4 = bk.a.f5708a;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj5);
                }
                return wj.r.f53297a;
        }
    }
}

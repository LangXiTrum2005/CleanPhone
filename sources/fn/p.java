package fn;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41135c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f41133a = i10;
        this.f41134b = obj;
        this.f41135c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, jk.c] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r8v17, types: [ck.i, jk.d] */
    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        o oVar;
        r rVar;
        z zVar;
        int i10;
        a0 a0Var;
        c0 c0Var;
        j0 j0Var;
        int i11;
        Object obj2;
        f fVar2;
        switch (this.f41133a) {
            case 0:
                if (fVar instanceof o) {
                    oVar = (o) fVar;
                    int i12 = oVar.f41131h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        oVar.f41131h = i12 - Integer.MIN_VALUE;
                    } else {
                        oVar = new o(this, fVar);
                    }
                } else {
                    oVar = new o(this, fVar);
                }
                Object obj3 = oVar.f41129f;
                int i13 = oVar.f41131h;
                try {
                    if (i13 == 0) {
                        t9.e.z(obj3);
                        f fVar3 = (f) this.f41134b;
                        oVar.f41131h = 1;
                        Object objEmit = fVar3.emit(obj, oVar);
                        bk.a aVar = bk.a.f5708a;
                        this = objEmit;
                        if (objEmit == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj3);
                        this = this;
                    }
                    return wj.r.f53297a;
                } catch (Throwable th2) {
                    ((kotlin.jvm.internal.c0) this.f41135c).f44760a = th2;
                    throw th2;
                }
            case 1:
                if (fVar instanceof r) {
                    rVar = (r) fVar;
                    int i14 = rVar.f41143h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        rVar.f41143h = i14 - Integer.MIN_VALUE;
                    } else {
                        rVar = new r(this, fVar);
                    }
                } else {
                    rVar = new r(this, fVar);
                }
                Object obj4 = rVar.f41141f;
                int i15 = rVar.f41143h;
                wj.r rVar2 = wj.r.f53297a;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj4);
                    return rVar2;
                }
                t9.e.z(obj4);
                kotlin.jvm.internal.a0 a0Var2 = (kotlin.jvm.internal.a0) this.f41135c;
                int i16 = a0Var2.f44754a;
                if (i16 < 1) {
                    a0Var2.f44754a = i16 + 1;
                    return rVar2;
                }
                f fVar4 = (f) this.f41134b;
                rVar.f41143h = 1;
                Object objEmit2 = fVar4.emit(obj, rVar);
                bk.a aVar2 = bk.a.f5708a;
                return objEmit2 == aVar2 ? aVar2 : rVar2;
            case 2:
                if (fVar instanceof z) {
                    zVar = (z) fVar;
                    int i17 = zVar.f41192g;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        zVar.f41192g = i17 - Integer.MIN_VALUE;
                    } else {
                        zVar = new z(this, fVar);
                    }
                } else {
                    zVar = new z(this, fVar);
                }
                Object objInvoke = zVar.f41191f;
                int i18 = zVar.f41192g;
                bk.a aVar3 = bk.a.f5708a;
                if (i18 != 0) {
                    if (i18 == 1) {
                        int i19 = zVar.f41195j;
                        Object obj5 = zVar.f41194i;
                        t9.e.z(objInvoke);
                        i10 = i19;
                        obj = obj5;
                    } else {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(objInvoke);
                    }
                    return wj.r.f53297a;
                }
                t9.e.z(objInvoke);
                jh.f fVar5 = (jh.f) this.f41135c;
                zVar.f41194i = obj;
                i10 = 0;
                zVar.f41195j = 0;
                zVar.f41192g = 1;
                objInvoke = fVar5.invoke(obj, zVar);
                if (objInvoke == aVar3) {
                    return aVar3;
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    throw new gn.a(this);
                }
                f fVar6 = (f) this.f41134b;
                zVar.f41194i = null;
                zVar.f41195j = i10;
                zVar.f41192g = 2;
                if (fVar6.emit(obj, zVar) == aVar3) {
                    return aVar3;
                }
                return wj.r.f53297a;
            case 3:
                if (fVar instanceof a0) {
                    a0Var = (a0) fVar;
                    int i20 = a0Var.f41026g;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        a0Var.f41026g = i20 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new a0(this, fVar);
                    }
                } else {
                    a0Var = new a0(this, fVar);
                }
                Object objInvoke2 = a0Var.f41025f;
                int i21 = a0Var.f41026g;
                if (i21 == 0) {
                    t9.e.z(objInvoke2);
                    ?? r10 = (ck.i) this.f41135c;
                    f fVar7 = (f) this.f41134b;
                    a0Var.f41026g = 1;
                    objInvoke2 = r10.invoke(fVar7, obj, a0Var);
                    bk.a aVar4 = bk.a.f5708a;
                    if (objInvoke2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(objInvoke2);
                }
                if (((Boolean) objInvoke2).booleanValue()) {
                    return wj.r.f53297a;
                }
                throw new gn.a(this);
            case 4:
                if (fVar instanceof c0) {
                    c0Var = (c0) fVar;
                    int i22 = c0Var.f41039g;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c0Var.f41039g = i22 - Integer.MIN_VALUE;
                    } else {
                        c0Var = new c0(this, fVar);
                    }
                } else {
                    c0Var = new c0(this, fVar);
                }
                Object objInvoke3 = c0Var.f41038f;
                int i23 = c0Var.f41039g;
                if (i23 == 0) {
                    t9.e.z(objInvoke3);
                    jk.c cVar = (jk.c) this.f41134b;
                    c0Var.f41041i = obj;
                    c0Var.f41039g = 1;
                    objInvoke3 = cVar.invoke(obj, c0Var);
                    bk.a aVar5 = bk.a.f5708a;
                    if (objInvoke3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0Var.f41041i;
                    t9.e.z(objInvoke3);
                }
                if (!((Boolean) objInvoke3).booleanValue()) {
                    return wj.r.f53297a;
                }
                ((kotlin.jvm.internal.c0) this.f41135c).f44760a = obj;
                throw new gn.a(this);
            default:
                if (fVar instanceof j0) {
                    j0Var = (j0) fVar;
                    int i24 = j0Var.f41098g;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        j0Var.f41098g = i24 - Integer.MIN_VALUE;
                    } else {
                        j0Var = new j0(this, fVar);
                    }
                } else {
                    j0Var = new j0(this, fVar);
                }
                Object obj6 = j0Var.f41097f;
                int i25 = j0Var.f41098g;
                bk.a aVar6 = bk.a.f5708a;
                if (i25 != 0) {
                    if (i25 == 1) {
                        i11 = j0Var.f41102k;
                        fVar2 = j0Var.f41101j;
                        obj2 = j0Var.f41100i;
                        t9.e.z(obj6);
                    } else {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj6);
                    }
                    return wj.r.f53297a;
                }
                t9.e.z(obj6);
                f fVar8 = (f) this.f41134b;
                j0Var.f41100i = obj;
                j0Var.f41101j = fVar8;
                j0Var.f41102k = 0;
                j0Var.f41098g = 1;
                if (this.f41135c.invoke(obj, j0Var) == aVar6) {
                    return aVar6;
                }
                i11 = 0;
                obj2 = obj;
                fVar2 = fVar8;
                j0Var.f41100i = null;
                j0Var.f41101j = null;
                j0Var.f41102k = i11;
                j0Var.f41098g = 2;
                if (fVar2.emit(obj2, j0Var) == aVar6) {
                    return aVar6;
                }
                return wj.r.f53297a;
        }
    }

    public /* synthetic */ p(Serializable serializable, f fVar, int i10) {
        this.f41133a = i10;
        this.f41135c = serializable;
        this.f41134b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(jk.d dVar, f fVar) {
        this.f41133a = 3;
        this.f41135c = (ck.i) dVar;
        this.f41134b = fVar;
    }
}

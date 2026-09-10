package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck.i f41104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f41105c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e eVar, jk.d dVar, int i10) {
        this.f41103a = i10;
        switch (i10) {
            case 2:
                this.f41105c = eVar;
                this.f41104b = (ck.i) dVar;
                break;
            default:
                this.f41105c = eVar;
                this.f41104b = (ck.i) dVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ck.c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ck.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ck.i, jk.d] */
    /* JADX WARN: Type inference failed for: r9v23, types: [ck.i, jk.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) {
        j jVar;
        int i10;
        int i11;
        g1 g1Var;
        gn.o oVar;
        gn.o oVar2;
        l lVar;
        int i12;
        m mVar;
        int i13;
        Object objI;
        switch (this.f41103a) {
            case 0:
                if (fVar2 instanceof j) {
                    jVar = (j) fVar2;
                    int i14 = jVar.f41092g;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        jVar.f41092g = i14 - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, fVar2);
                    }
                } else {
                    jVar = new j(this, fVar2);
                }
                Object obj = jVar.f41091f;
                int i15 = jVar.f41092g;
                ?? r2 = this.f41104b;
                bk.a aVar = bk.a.f5708a;
                if (i15 == 0) {
                    t9.e.z(obj);
                    i10 = 0;
                    try {
                        e eVar = this.f41105c;
                        jVar.f41094i = fVar;
                        jVar.f41096k = 0;
                        jVar.f41092g = 1;
                        if (eVar.collect(fVar, jVar) == aVar) {
                            return aVar;
                        }
                        i11 = 0;
                        oVar = new gn.o(fVar, jVar.getContext());
                        jVar.f41094i = null;
                        jVar.f41095j = oVar;
                        jVar.f41096k = i11;
                        jVar.f41092g = 3;
                        if (r2.invoke(oVar, null, jVar) == aVar) {
                            return aVar;
                        }
                        oVar2 = oVar;
                        oVar2.releaseIntercepted();
                        return wj.r.f53297a;
                    } catch (Throwable th2) {
                        th = th2;
                        g1Var = new g1(th);
                        jVar.f41094i = null;
                        jVar.f41095j = th;
                        jVar.f41096k = i10;
                        jVar.f41092g = 2;
                        if (g.e(g1Var, r2, th, jVar) == aVar) {
                            return aVar;
                        }
                        throw th;
                    }
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        Throwable th3 = (Throwable) jVar.f41095j;
                        t9.e.z(obj);
                        throw th3;
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar2 = (gn.o) jVar.f41095j;
                    try {
                        t9.e.z(obj);
                        oVar2.releaseIntercepted();
                        return wj.r.f53297a;
                    } catch (Throwable th4) {
                        th = th4;
                        oVar2.releaseIntercepted();
                        throw th;
                    }
                }
                i11 = jVar.f41096k;
                fVar = jVar.f41094i;
                try {
                    t9.e.z(obj);
                    oVar = new gn.o(fVar, jVar.getContext());
                    try {
                        jVar.f41094i = null;
                        jVar.f41095j = oVar;
                        jVar.f41096k = i11;
                        jVar.f41092g = 3;
                        if (r2.invoke(oVar, null, jVar) == aVar) {
                            return aVar;
                        }
                        oVar2 = oVar;
                        oVar2.releaseIntercepted();
                        return wj.r.f53297a;
                    } catch (Throwable th5) {
                        th = th5;
                        oVar2 = oVar;
                        oVar2.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th6) {
                    i10 = i11;
                    th = th6;
                    g1Var = new g1(th);
                    jVar.f41094i = null;
                    jVar.f41095j = th;
                    jVar.f41096k = i10;
                    jVar.f41092g = 2;
                    if (g.e(g1Var, r2, th, jVar) == aVar) {
                        return aVar;
                    }
                    throw th;
                }
            case 1:
                if (fVar2 instanceof l) {
                    lVar = (l) fVar2;
                    int i16 = lVar.f41111g;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        lVar.f41111g = i16 - Integer.MIN_VALUE;
                    } else {
                        lVar = new l(this, fVar2);
                    }
                } else {
                    lVar = new l(this, fVar2);
                }
                Object obj2 = lVar.f41110f;
                ?? r3 = lVar.f41111g;
                bk.a aVar2 = bk.a.f5708a;
                try {
                    if (r3 != 0) {
                        if (r3 == 1) {
                            int i17 = lVar.f41115k;
                            gn.o oVar3 = lVar.f41114j;
                            f fVar3 = lVar.f41113i;
                            t9.e.z(obj2);
                            i12 = i17;
                            fVar = fVar3;
                            r3 = oVar3;
                        } else {
                            if (r3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t9.e.z(obj2);
                        }
                        return wj.r.f53297a;
                    }
                    t9.e.z(obj2);
                    gn.o oVar4 = new gn.o(fVar, lVar.getContext());
                    ?? r11 = this.f41104b;
                    lVar.f41113i = fVar;
                    lVar.f41114j = oVar4;
                    i12 = 0;
                    lVar.f41115k = 0;
                    lVar.f41111g = 1;
                    Object objInvoke = r11.invoke(oVar4, lVar);
                    r3 = oVar4;
                    if (objInvoke == aVar2) {
                        return aVar2;
                    }
                    r3.releaseIntercepted();
                    lVar.f41113i = null;
                    lVar.f41114j = null;
                    lVar.f41115k = i12;
                    lVar.f41111g = 2;
                    if (this.f41105c.collect(fVar, lVar) == aVar2) {
                        return aVar2;
                    }
                    return wj.r.f53297a;
                } catch (Throwable th7) {
                    r3.releaseIntercepted();
                    throw th7;
                }
            default:
                if (fVar2 instanceof m) {
                    mVar = (m) fVar2;
                    int i18 = mVar.f41122g;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        mVar.f41122g = i18 - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, fVar2);
                    }
                } else {
                    mVar = new m(this, fVar2);
                }
                Object obj3 = mVar.f41121f;
                int i19 = mVar.f41122g;
                bk.a aVar3 = bk.a.f5708a;
                if (i19 != 0) {
                    if (i19 == 1) {
                        int i20 = mVar.f41125j;
                        f fVar4 = mVar.f41124i;
                        t9.e.z(obj3);
                        i13 = i20;
                        fVar = fVar4;
                        objI = obj3;
                    } else {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj3);
                    }
                    return wj.r.f53297a;
                }
                t9.e.z(obj3);
                mVar.f41124i = fVar;
                i13 = 0;
                mVar.f41125j = 0;
                mVar.f41122g = 1;
                objI = g.i(this.f41105c, fVar, mVar);
                if (objI == aVar3) {
                    return aVar3;
                }
                Throwable th8 = (Throwable) objI;
                if (th8 != null) {
                    mVar.f41124i = null;
                    mVar.f41125j = i13;
                    mVar.f41122g = 2;
                    if (this.f41104b.invoke(fVar, th8, mVar) == aVar3) {
                        return aVar3;
                    }
                }
                return wj.r.f53297a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(jk.c cVar, e eVar) {
        this.f41103a = 1;
        this.f41104b = (ck.i) cVar;
        this.f41105c = eVar;
    }
}

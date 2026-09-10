package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(om.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void l(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pm.h
    public final y c() {
        zk.e eVarE = e();
        if (eVarE == null) {
            wk.h.a(107);
            throw null;
        }
        yl.f fVar = wk.h.f53310e;
        if (wk.h.b(eVarE, wk.l.f53335a) || wk.h.b(eVarE, wk.l.f53337b)) {
            return null;
        }
        return d().e();
    }

    @Override // pm.n0
    public final wk.h d() {
        wk.h hVarE = fm.e.e(e());
        if (hVarE != null) {
            return hVarE;
        }
        l(1);
        throw null;
    }

    @Override // pm.h
    public final boolean j(zk.g gVar) {
        boolean z10;
        if (gVar instanceof zk.e) {
            zk.e first = e();
            kotlin.jvm.internal.n.f(first, "first");
            if (!kotlin.jvm.internal.n.a(first.getName(), gVar.getName())) {
                z10 = false;
                break;
            }
            zk.j jVarE = first.e();
            zk.j jVarE2 = gVar.e();
            while (true) {
                if (jVarE != null && jVarE2 != null) {
                    if (!(jVarE instanceof zk.w)) {
                        if (!(jVarE2 instanceof zk.w)) {
                            if (jVarE instanceof zk.b0) {
                                if (!(jVarE2 instanceof zk.b0) || !kotlin.jvm.internal.n.a(((cl.h0) ((zk.b0) jVarE)).f6518e, ((cl.h0) ((zk.b0) jVarE2)).f6518e)) {
                                    break;
                                }
                            } else if (!(jVarE2 instanceof zk.b0) && kotlin.jvm.internal.n.a(jVarE.getName(), jVarE2.getName())) {
                                jVarE = jVarE.e();
                                jVarE2 = jVarE2.e();
                            }
                        }
                        z10 = false;
                        break;
                    }
                    z10 = jVarE2 instanceof zk.w;
                    break;
                }
                z10 = true;
                break;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // pm.n0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract zk.e e();
}

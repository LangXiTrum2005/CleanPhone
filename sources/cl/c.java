package cl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.f f6484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.i f6485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.i f6486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f6487d;

    public c(om.o oVar, yl.f fVar) {
        if (oVar == null) {
            s(0);
            throw null;
        }
        if (fVar == null) {
            s(1);
            throw null;
        }
        this.f6484a = fVar;
        om.l lVar = (om.l) oVar;
        this.f6485b = new om.i(lVar, new b(this, 0));
        this.f6486c = new om.i(lVar, new b(this, 1));
        this.f6487d = new om.i(lVar, new b(this, 2));
    }

    public static /* synthetic */ void s(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zk.e
    public final im.n E(pm.t0 t0Var) {
        fm.e.i(bm.e.d(this));
        im.n nVarK = k(t0Var, qm.f.f49175a);
        if (nVarK != null) {
            return nVarK;
        }
        s(16);
        throw null;
    }

    @Override // zk.e
    public im.n N() {
        im.n nVar = (im.n) this.f6486c.invoke();
        if (nVar != null) {
            return nVar;
        }
        s(4);
        throw null;
    }

    @Override // zk.e
    public im.n R() {
        fm.e.i(bm.e.d(this));
        im.n nVarO = o(qm.f.f49175a);
        if (nVarO != null) {
            return nVarO;
        }
        s(17);
        throw null;
    }

    @Override // zk.e
    public List T() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(6);
        throw null;
    }

    @Override // cl.d0, zk.e, zk.j, zk.g
    public final zk.g a() {
        return this;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.e(this, obj);
    }

    @Override // zk.e, zk.g
    public final pm.c0 g() {
        pm.c0 c0Var = (pm.c0) this.f6485b.invoke();
        if (c0Var != null) {
            return c0Var;
        }
        s(20);
        throw null;
    }

    @Override // zk.j
    public final yl.f getName() {
        yl.f fVar = this.f6484a;
        if (fVar != null) {
            return fVar;
        }
        s(2);
        throw null;
    }

    @Override // cl.d0
    public im.n k(pm.t0 t0Var, qm.f fVar) {
        if (!t0Var.e()) {
            return new im.s(o(fVar), new pm.w0(t0Var));
        }
        im.n nVarO = o(fVar);
        if (nVarO != null) {
            return nVarO;
        }
        s(12);
        throw null;
    }

    @Override // zk.l0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public zk.e b(pm.w0 w0Var) {
        if (w0Var != null) {
            return w0Var.f48483a.e() ? this : new c0(this, w0Var);
        }
        s(18);
        throw null;
    }

    @Override // zk.e
    public final z y0() {
        z zVar = (z) this.f6487d.invoke();
        if (zVar != null) {
            return zVar;
        }
        s(5);
        throw null;
    }

    @Override // cl.d0, zk.j, zk.g
    public final zk.j a() {
        return this;
    }

    @Override // cl.d0, zk.e, zk.j, zk.g
    public final zk.e a() {
        return this;
    }
}

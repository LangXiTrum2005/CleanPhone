package cl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends pm.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk.k0 f6525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f6526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, om.o oVar, zk.k0 k0Var) {
        super(oVar);
        if (oVar == null) {
            l(0);
            throw null;
        }
        this.f6526d = kVar;
        this.f6525c = k0Var;
    }

    public static /* synthetic */ void l(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i10 == 2) {
            objArr[1] = "getParameters";
        } else if (i10 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pm.h
    public final Collection b() {
        List listK0 = this.f6526d.K0();
        if (listK0 != null) {
            return listK0;
        }
        l(1);
        throw null;
    }

    @Override // pm.h
    public final pm.y c() {
        return rm.i.c(rm.h.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // pm.n0
    public final wk.h d() {
        wk.h hVarE = fm.e.e(this.f6526d);
        if (hVarE != null) {
            return hVarE;
        }
        l(4);
        throw null;
    }

    @Override // pm.n0
    public final zk.g e() {
        k kVar = this.f6526d;
        if (kVar != null) {
            return kVar;
        }
        l(3);
        throw null;
    }

    @Override // pm.n0
    public final boolean g() {
        return true;
    }

    @Override // pm.n0
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    @Override // pm.h
    public final zk.k0 h() {
        zk.k0 k0Var = this.f6525c;
        if (k0Var != null) {
            return k0Var;
        }
        l(5);
        throw null;
    }

    @Override // pm.h
    public final boolean j(zk.g gVar) {
        if (!(gVar instanceof zk.m0)) {
            return false;
        }
        return bm.c.f5727a.d(this.f6526d, (zk.m0) gVar, true, bm.b.f5726e);
    }

    @Override // pm.h
    public final List k(List list) {
        List listJ0 = this.f6526d.J0(list);
        if (listJ0 != null) {
            return listJ0;
        }
        l(8);
        throw null;
    }

    public final String toString() {
        return this.f6526d.getName().f54514a;
    }
}

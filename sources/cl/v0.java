package cl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f6607k;
    public boolean l;

    /* JADX WARN: Illegal instructions before constructor call */
    public v0(zk.j jVar, al.j jVar2, boolean z10, int i10, yl.f fVar, int i11, om.o oVar) {
        zk.k0 k0Var = zk.k0.f54972c;
        if (jVar == null) {
            z0(19);
            throw null;
        }
        if (jVar2 == null) {
            z0(20);
            throw null;
        }
        if (i10 == 0) {
            z0(21);
            throw null;
        }
        if (fVar == null) {
            z0(22);
            throw null;
        }
        if (oVar == null) {
            z0(25);
            throw null;
        }
        super(oVar, jVar, jVar2, fVar, i10, z10, i11, k0Var);
        this.f6607k = new ArrayList(1);
        this.l = false;
    }

    public static v0 L0(zk.j jVar, al.j jVar2, boolean z10, int i10, yl.f fVar, int i11, om.o oVar) {
        if (jVar == null) {
            z0(6);
            throw null;
        }
        if (jVar2 == null) {
            z0(7);
            throw null;
        }
        if (i10 == 0) {
            z0(8);
            throw null;
        }
        if (fVar == null) {
            z0(9);
            throw null;
        }
        if (oVar == null) {
            z0(11);
            throw null;
        }
        if (i10 != 0) {
            return new v0(jVar, jVar2, z10, i10, fVar, i11, oVar);
        }
        z0(14);
        throw null;
    }

    public static v0 M0(c cVar, int i10, yl.f fVar, int i11, om.o oVar) {
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (oVar == null) {
            z0(4);
            throw null;
        }
        v0 v0VarL0 = L0(cVar, al.i.f3645a, false, i10, fVar, i11, oVar);
        pm.c0 c0VarM = fm.e.e(cVar).m();
        if (v0VarL0.l) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + v0VarL0.N0());
        }
        if (!pm.c.j(c0VarM)) {
            v0VarL0.f6607k.add(c0VarM);
        }
        if (!v0VarL0.l) {
            v0VarL0.l = true;
            return v0VarL0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + v0VarL0.N0());
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.k
    public final List K0() {
        if (!this.l) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + N0());
        }
        ArrayList arrayList = this.f6607k;
        if (arrayList != null) {
            return arrayList;
        }
        z0(28);
        throw null;
    }

    public final String N0() {
        return getName() + " declared in " + bm.e.g(e());
    }
}

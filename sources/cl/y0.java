package cl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 extends q implements zk.p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pm.y f6658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(zk.j jVar, al.j jVar2, yl.f fVar, pm.y yVar, zk.j0 j0Var) {
        super(jVar, jVar2, fVar, j0Var);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (jVar2 == null) {
            z0(1);
            throw null;
        }
        if (fVar == null) {
            z0(2);
            throw null;
        }
        if (j0Var == null) {
            z0(3);
            throw null;
        }
        this.f6658e = yVar;
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.b
    public final List B() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(6);
        throw null;
    }

    public z G() {
        return null;
    }

    public z J() {
        return null;
    }

    @Override // zk.b
    public boolean a0() {
        return false;
    }

    public pm.y getReturnType() {
        pm.y type = getType();
        if (type != null) {
            return type;
        }
        z0(10);
        throw null;
    }

    @Override // al.b, jm.d
    public final pm.y getType() {
        pm.y yVar = this.f6658e;
        if (yVar != null) {
            return yVar;
        }
        z0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(8);
        throw null;
    }
}

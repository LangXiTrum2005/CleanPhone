package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends l0 implements zk.g0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pm.y f6582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f6583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zk.h0 h0Var, al.j jVar, int i10, il.o oVar, boolean z10, boolean z11, boolean z12, int i11, o0 o0Var, zk.j0 j0Var) {
        super(i10, oVar, h0Var, jVar, yl.f.g("<get-" + h0Var.getName() + ">"), z10, z11, z12, i11, j0Var);
        if (jVar == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (oVar == null) {
            z0(3);
            throw null;
        }
        if (i11 == 0) {
            z0(4);
            throw null;
        }
        if (j0Var == null) {
            z0(5);
            throw null;
        }
        this.f6583n = o0Var != null ? o0Var : this;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zk.b
    public final List B() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(7);
        throw null;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final o0 a() {
        o0 o0Var = this.f6583n;
        if (o0Var != null) {
            return o0Var;
        }
        z0(8);
        throw null;
    }

    public final void M0(pm.y yVar) {
        if (yVar == null) {
            yVar = J0().getType();
        }
        this.f6582m = yVar;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.l(this, obj);
    }

    @Override // zk.c, zk.b
    public final Collection f() {
        return K0(true);
    }

    @Override // zk.b
    public final pm.y getReturnType() {
        return this.f6582m;
    }
}

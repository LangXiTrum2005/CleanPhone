package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 extends q implements zk.g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zk.h0 f6538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public il.o f6541k;
    public zk.s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i10, il.o oVar, zk.h0 h0Var, al.j jVar, yl.f fVar, boolean z10, boolean z11, boolean z12, int i11, zk.j0 j0Var) {
        super(h0Var.e(), jVar, fVar, j0Var);
        if (i10 == 0) {
            z0(0);
            throw null;
        }
        if (oVar == null) {
            z0(1);
            throw null;
        }
        if (jVar == null) {
            z0(3);
            throw null;
        }
        if (j0Var == null) {
            z0(5);
            throw null;
        }
        this.l = null;
        this.f6537g = i10;
        this.f6541k = oVar;
        this.f6538h = h0Var;
        this.f6535e = z10;
        this.f6536f = z11;
        this.f6539i = z12;
        this.f6540j = i11;
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.b
    public final z G() {
        return J0().G();
    }

    @Override // zk.b
    public final z J() {
        return J0().J();
    }

    public final zk.h0 J0() {
        zk.h0 h0Var = this.f6538h;
        if (h0Var != null) {
            return h0Var;
        }
        z0(13);
        throw null;
    }

    public final ArrayList K0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (zk.h0 h0Var : J0().f()) {
            zk.v getter = z10 ? h0Var.getGetter() : h0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // zk.c
    public final zk.c V(zk.e eVar, int i10, il.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // zk.b
    public final boolean a0() {
        return false;
    }

    @Override // zk.s, zk.l0
    public final zk.s b(pm.w0 w0Var) {
        if (w0Var != null) {
            return this;
        }
        z0(7);
        throw null;
    }

    @Override // zk.b
    public final Object d0(zk.a aVar) {
        return null;
    }

    @Override // zk.v
    public final boolean f0() {
        return false;
    }

    @Override // zk.c
    public final int getKind() {
        int i10 = this.f6540j;
        if (i10 != 0) {
            return i10;
        }
        z0(6);
        throw null;
    }

    @Override // zk.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z0(9);
        throw null;
    }

    @Override // zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = this.f6541k;
        if (oVar != null) {
            return oVar;
        }
        z0(11);
        throw null;
    }

    @Override // zk.v
    public final boolean isExternal() {
        return this.f6536f;
    }

    @Override // zk.s
    public final boolean isInfix() {
        return false;
    }

    @Override // zk.s
    public final boolean isInline() {
        return this.f6539i;
    }

    @Override // zk.s
    public final boolean isOperator() {
        return false;
    }

    @Override // zk.s
    public final boolean isSuspend() {
        return false;
    }

    @Override // zk.v
    public final int j() {
        int i10 = this.f6537g;
        if (i10 != 0) {
            return i10;
        }
        z0(10);
        throw null;
    }

    @Override // zk.s
    public final zk.s k0() {
        return this.l;
    }

    @Override // zk.b
    public final List p0() {
        List listP0 = J0().p0();
        if (listP0 != null) {
            return listP0;
        }
        z0(14);
        throw null;
    }

    @Override // zk.s
    public final boolean s0() {
        return false;
    }

    @Override // zk.c
    public final void t0(Collection collection) {
        if (collection != null) {
            return;
        }
        z0(16);
        throw null;
    }

    @Override // zk.s
    public final boolean u0() {
        return false;
    }

    @Override // zk.s
    public final boolean x() {
        return false;
    }

    @Override // zk.l0
    public final /* bridge */ /* synthetic */ zk.k b(pm.w0 w0Var) {
        b(w0Var);
        return this;
    }
}

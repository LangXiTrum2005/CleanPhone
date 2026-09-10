package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends l0 implements zk.g0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x0 f6585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p0 f6586n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zk.h0 h0Var, al.j jVar, int i10, il.o oVar, boolean z10, boolean z11, boolean z12, int i11, p0 p0Var, zk.j0 j0Var) {
        super(i10, oVar, h0Var, jVar, yl.f.g("<set-" + h0Var.getName() + ">"), z10, z11, z12, i11, j0Var);
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
        this.f6586n = p0Var != null ? p0Var : this;
    }

    public static x0 L0(p0 p0Var, pm.y yVar, al.j jVar) {
        if (yVar == null) {
            z0(8);
            throw null;
        }
        if (jVar != null) {
            return new x0(p0Var, null, 0, jVar, yl.h.f54523g, yVar, false, false, false, null, zk.j0.C9);
        }
        z0(9);
        throw null;
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.b
    public final List B() {
        x0 x0Var = this.f6585m;
        if (x0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(x0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        z0(11);
        throw null;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final p0 a() {
        p0 p0Var = this.f6586n;
        if (p0Var != null) {
            return p0Var;
        }
        z0(13);
        throw null;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.s(this, obj);
    }

    @Override // zk.c, zk.b
    public final Collection f() {
        return K0(false);
    }

    @Override // zk.b
    public final pm.y getReturnType() {
        return fm.e.e(this).w();
    }
}

package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public il.o f6512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pm.k f6513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f6514k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final om.o f6515m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r rVar, yl.f fVar, om.o oVar) {
        super(oVar, rVar, fVar, zk.j0.C9);
        if (fVar == null) {
            s(2);
            throw null;
        }
        if (oVar == null) {
            s(4);
            throw null;
        }
        this.l = new ArrayList();
        this.f6515m = oVar;
        this.f6510g = 2;
    }

    public static /* synthetic */ void s(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.e
    public final zk.n0 O() {
        return null;
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // zk.e
    public final boolean W() {
        return false;
    }

    @Override // zk.e
    public final boolean Y() {
        return false;
    }

    @Override // zk.e
    public final boolean e0() {
        return false;
    }

    @Override // zk.v
    public final boolean f0() {
        return false;
    }

    @Override // zk.e
    public final im.n g0() {
        return im.m.f43190b;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return al.i.f3645a;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = this.f6512i;
        if (oVar != null) {
            return oVar;
        }
        s(10);
        throw null;
    }

    @Override // zk.e, zk.h
    public final List i() {
        ArrayList arrayList = this.f6514k;
        if (arrayList != null) {
            return arrayList;
        }
        s(15);
        throw null;
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        int i10 = this.f6511h;
        if (i10 != 0) {
            return i10;
        }
        s(7);
        throw null;
    }

    @Override // zk.e
    public final int l0() {
        int i10 = this.f6510g;
        if (i10 != 0) {
            return i10;
        }
        s(8);
        throw null;
    }

    @Override // zk.g
    public final pm.n0 n() {
        pm.k kVar = this.f6513j;
        if (kVar != null) {
            return kVar;
        }
        s(11);
        throw null;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        return im.m.f43190b;
    }

    @Override // zk.e
    public final Collection p() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        s(13);
        throw null;
    }

    @Override // zk.e
    public final Collection r() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(19);
        throw null;
    }

    public final String toString() {
        return p.H0(this);
    }

    @Override // zk.h
    public final boolean u() {
        return false;
    }

    @Override // zk.e
    public final boolean x0() {
        return false;
    }

    @Override // zk.e
    public final l y() {
        return null;
    }
}

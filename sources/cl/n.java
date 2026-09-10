package cl;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class n extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pm.k f6557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public im.n f6558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f6559k;
    public l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zk.j jVar, yl.f fVar, int i10, int i11, Collection collection, om.o oVar) {
        super(oVar, jVar, fVar, zk.j0.C9);
        if (jVar == null) {
            s(0);
            throw null;
        }
        if (fVar == null) {
            s(1);
            throw null;
        }
        if (i10 == 0) {
            s(2);
            throw null;
        }
        if (i11 == 0) {
            s(3);
            throw null;
        }
        if (oVar == null) {
            s(6);
            throw null;
        }
        this.f6555g = i10;
        this.f6556h = i11;
        this.f6557i = new pm.k(this, Collections.EMPTY_LIST, collection, oVar);
    }

    public static /* synthetic */ void s(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final void M(im.n nVar, Set set, l lVar) {
        this.f6558j = nVar;
        this.f6559k = set;
        this.l = lVar;
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
        il.o oVar = zk.n.f54978e;
        if (oVar != null) {
            return oVar;
        }
        s(17);
        throw null;
    }

    @Override // zk.e, zk.h
    public final List i() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(18);
        throw null;
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        int i10 = this.f6555g;
        if (i10 != 0) {
            return i10;
        }
        s(16);
        throw null;
    }

    @Override // zk.e
    public final int l0() {
        int i10 = this.f6556h;
        if (i10 != 0) {
            return i10;
        }
        s(15);
        throw null;
    }

    @Override // zk.g
    public final pm.n0 n() {
        pm.k kVar = this.f6557i;
        if (kVar != null) {
            return kVar;
        }
        s(10);
        throw null;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        im.n nVar = this.f6558j;
        if (nVar != null) {
            return nVar;
        }
        s(13);
        throw null;
    }

    @Override // zk.e
    public final Collection p() {
        Set set = this.f6559k;
        if (set != null) {
            return set;
        }
        s(11);
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

    public String toString() {
        return "class " + getName();
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
        return this.l;
    }
}

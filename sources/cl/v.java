package cl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pm.k f6603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f6604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final om.m f6605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final al.j f6606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(om.o oVar, zk.e eVar, pm.c0 c0Var, yl.f fVar, om.m mVar, al.j jVar, zk.j0 j0Var) {
        super(oVar, eVar, fVar, j0Var);
        if (oVar == null) {
            s(6);
            throw null;
        }
        if (eVar == null) {
            s(7);
            throw null;
        }
        if (c0Var == null) {
            s(8);
            throw null;
        }
        if (fVar == null) {
            s(9);
            throw null;
        }
        if (mVar == null) {
            s(10);
            throw null;
        }
        this.f6606j = jVar;
        this.f6603g = new pm.k(this, Collections.EMPTY_LIST, Collections.singleton(c0Var), oVar);
        this.f6604h = new u(this, oVar);
        this.f6605i = mVar;
    }

    public static v M(om.o oVar, zk.e eVar, yl.f fVar, om.i iVar, al.j jVar, zk.j0 j0Var) {
        if (oVar == null) {
            s(0);
            throw null;
        }
        if (eVar == null) {
            s(1);
            throw null;
        }
        if (fVar == null) {
            s(2);
            throw null;
        }
        if (iVar != null) {
            return new v(oVar, eVar, eVar.g(), fVar, iVar, jVar, j0Var);
        }
        s(3);
        throw null;
    }

    public static /* synthetic */ void s(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
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
        al.j jVar = this.f6606j;
        if (jVar != null) {
            return jVar;
        }
        s(21);
        throw null;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = zk.n.f54978e;
        if (oVar != null) {
            return oVar;
        }
        s(20);
        throw null;
    }

    @Override // zk.e, zk.h
    public final List i() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(22);
        throw null;
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        return 1;
    }

    @Override // zk.e
    public final int l0() {
        return 4;
    }

    @Override // zk.g
    public final pm.n0 n() {
        pm.k kVar = this.f6603g;
        if (kVar != null) {
            return kVar;
        }
        s(17);
        throw null;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        u uVar = this.f6604h;
        if (uVar != null) {
            return uVar;
        }
        s(14);
        throw null;
    }

    @Override // zk.e
    public final Collection p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(16);
        throw null;
    }

    @Override // zk.e
    public final Collection r() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(23);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
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

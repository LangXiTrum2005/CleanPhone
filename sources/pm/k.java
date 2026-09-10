package pm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl.d0 f48445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f48446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f48447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cl.d0 d0Var, List list, Collection collection, om.o oVar) {
        super(oVar);
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (oVar == null) {
            l(3);
            throw null;
        }
        this.f48445c = d0Var;
        this.f48446d = Collections.unmodifiableList(new ArrayList(list));
        this.f48447e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pm.h
    public final Collection b() {
        Collection collection = this.f48447e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // pm.n0
    public final boolean g() {
        return true;
    }

    @Override // pm.n0
    public final List getParameters() {
        List list = this.f48446d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // pm.h
    public final zk.k0 h() {
        return zk.k0.f54972c;
    }

    @Override // pm.b
    /* JADX INFO: renamed from: m */
    public final zk.e e() {
        cl.d0 d0Var = this.f48445c;
        if (d0Var != null) {
            return d0Var;
        }
        l(5);
        throw null;
    }

    public final String toString() {
        String str = bm.e.g(this.f48445c).f54510a;
        if (str != null) {
            return str;
        }
        yl.e.a(4);
        throw null;
    }
}

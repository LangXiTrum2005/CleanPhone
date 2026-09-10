package al;

import java.util.Map;
import pm.c0;
import pm.y;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f3626c;

    public d(c0 c0Var, Map map, j0 j0Var) {
        if (c0Var == null) {
            a(0);
            throw null;
        }
        if (map == null) {
            a(1);
            throw null;
        }
        this.f3624a = c0Var;
        this.f3625b = map;
        this.f3626c = j0Var;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // al.c
    public final j0 c() {
        j0 j0Var = this.f3626c;
        if (j0Var != null) {
            return j0Var;
        }
        a(5);
        throw null;
    }

    @Override // al.c
    public final Map d() {
        Map map = this.f3625b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    @Override // al.c
    public final yl.c e() {
        zk.e eVarD = fm.e.d(this);
        if (eVarD != null) {
            if (rm.i.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return fm.e.c(eVarD);
            }
        }
        return null;
    }

    @Override // al.c
    public final y getType() {
        y yVar = this.f3624a;
        if (yVar != null) {
            return yVar;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return am.h.f3706c.x(this, null);
    }
}

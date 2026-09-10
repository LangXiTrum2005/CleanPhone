package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zk.j f6542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zk.j0 f6543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(om.o oVar, zk.j jVar, yl.f fVar, zk.j0 j0Var) {
        super(oVar, fVar);
        if (oVar == null) {
            s(0);
            throw null;
        }
        if (jVar == null) {
            s(1);
            throw null;
        }
        if (fVar == null) {
            s(2);
            throw null;
        }
        this.f6542e = jVar;
        this.f6543f = j0Var;
    }

    public static /* synthetic */ void s(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zk.k
    public final zk.j0 c() {
        zk.j0 j0Var = this.f6543f;
        if (j0Var != null) {
            return j0Var;
        }
        s(5);
        throw null;
    }

    @Override // zk.j
    public final zk.j e() {
        zk.j jVar = this.f6542e;
        if (jVar != null) {
            return jVar;
        }
        s(4);
        throw null;
    }

    @Override // zk.v
    public boolean isExternal() {
        return false;
    }
}

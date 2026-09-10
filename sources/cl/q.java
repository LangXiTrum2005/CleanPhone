package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends p implements zk.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk.j f6587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zk.j0 f6588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zk.j jVar, al.j jVar2, yl.f fVar, zk.j0 j0Var) {
        super(jVar2, fVar);
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
        this.f6587c = jVar;
        this.f6588d = j0Var;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public zk.j0 c() {
        zk.j0 j0Var = this.f6588d;
        if (j0Var != null) {
            return j0Var;
        }
        z0(6);
        throw null;
    }

    public zk.j e() {
        zk.j jVar = this.f6587c;
        if (jVar != null) {
            return jVar;
        }
        z0(5);
        throw null;
    }

    @Override // cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: I0 */
    public zk.k a() {
        return this;
    }
}

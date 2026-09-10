package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(om.o oVar, zk.j jVar, al.j jVar2, yl.f fVar, int i10, boolean z10, int i11, zk.k0 k0Var) {
        super(oVar, jVar, jVar2, fVar, i10, z10, i11, k0Var);
        if (oVar == null) {
            z0(0);
            throw null;
        }
        if (jVar == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(4);
            throw null;
        }
        if (k0Var != null) {
        } else {
            z0(6);
            throw null;
        }
    }

    public static /* synthetic */ void z0(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // cl.p
    public final String toString() {
        return (this.f6529f ? "reified " : "") + (v() != 1 ? l1.d.v(v()).concat(" ") : "") + getName();
    }
}

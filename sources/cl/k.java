package cl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends q implements zk.m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om.i f6531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final om.i f6532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final om.l f6533j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(om.o oVar, zk.j jVar, al.j jVar2, yl.f fVar, int i10, boolean z10, int i11, zk.k0 k0Var) {
        super(jVar, jVar2, fVar, zk.j0.C9);
        if (oVar == null) {
            z0(0);
            throw null;
        }
        if (jVar == null) {
            z0(1);
            throw null;
        }
        if (jVar2 == null) {
            z0(2);
            throw null;
        }
        if (fVar == null) {
            z0(3);
            throw null;
        }
        if (i10 == 0) {
            z0(4);
            throw null;
        }
        if (k0Var == null) {
            z0(6);
            throw null;
        }
        this.f6528e = i10;
        this.f6529f = z10;
        this.f6530g = i11;
        g gVar = new g(this, oVar, k0Var);
        om.l lVar = (om.l) oVar;
        this.f6531h = new om.i(lVar, gVar);
        this.f6532i = new om.i(lVar, new i(0, this, fVar));
        this.f6533j = lVar;
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.m0
    public final om.o H() {
        om.l lVar = this.f6533j;
        if (lVar != null) {
            return lVar;
        }
        z0(14);
        throw null;
    }

    public abstract List K0();

    @Override // zk.m0
    public final boolean L() {
        return false;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.g a() {
        return this;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.a(this, obj);
    }

    @Override // zk.g
    public final pm.c0 g() {
        pm.c0 c0Var = (pm.c0) this.f6532i.invoke();
        if (c0Var != null) {
            return c0Var;
        }
        z0(10);
        throw null;
    }

    @Override // zk.m0
    public final int getIndex() {
        return this.f6530g;
    }

    @Override // zk.m0
    public final List getUpperBounds() {
        List listF = ((j) n()).f();
        if (listF != null) {
            return listF;
        }
        z0(8);
        throw null;
    }

    @Override // zk.g
    public final pm.n0 n() {
        pm.n0 n0Var = (pm.n0) this.f6531h.invoke();
        if (n0Var != null) {
            return n0Var;
        }
        z0(9);
        throw null;
    }

    @Override // zk.m0
    public final boolean q() {
        return this.f6529f;
    }

    @Override // zk.m0
    public final int v() {
        int i10 = this.f6528e;
        if (i10 != 0) {
            return i10;
        }
        z0(7);
        throw null;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.j a() {
        return this;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.m0 a() {
        return this;
    }

    @Override // cl.q
    /* JADX INFO: renamed from: I0 */
    public final zk.k a() {
        return this;
    }

    public List J0(List list) {
        return list;
    }
}

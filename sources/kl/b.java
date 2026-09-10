package kl;

import al.i;
import al.j;
import bm.m;
import cl.l;
import cl.y;
import java.util.ArrayList;
import xj.v;
import zk.j0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends l implements a {
    public Boolean E;
    public Boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zk.e eVar, b bVar, j jVar, boolean z10, int i10, j0 j0Var) {
        super(eVar, bVar, jVar, z10, i10, j0Var);
        if (eVar == null) {
            z0(0);
            throw null;
        }
        if (jVar == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (j0Var == null) {
            z0(3);
            throw null;
        }
        this.E = null;
        this.F = null;
    }

    public static b a1(zk.e eVar, j jVar, boolean z10, el.g gVar) {
        if (eVar != null) {
            return new b(eVar, null, jVar, z10, 1, gVar);
        }
        z0(4);
        throw null;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.l, cl.y
    public final /* bridge */ /* synthetic */ y L0(int i10, j jVar, yl.f fVar, zk.j jVar2, s sVar, j0 j0Var) {
        return b1(jVar2, sVar, i10, jVar, j0Var);
    }

    @Override // cl.y
    public final void R0(boolean z10) {
        this.E = Boolean.valueOf(z10);
    }

    @Override // cl.y
    public final void S0(boolean z10) {
        this.F = Boolean.valueOf(z10);
    }

    @Override // cl.l
    /* JADX INFO: renamed from: U0 */
    public final /* bridge */ /* synthetic */ l L0(int i10, j jVar, yl.f fVar, zk.j jVar2, s sVar, j0 j0Var) {
        return b1(jVar2, sVar, i10, jVar, j0Var);
    }

    @Override // cl.y, zk.b
    public final boolean a0() {
        return this.F.booleanValue();
    }

    public final b b1(zk.j jVar, s sVar, int i10, j jVar2, j0 j0Var) {
        if (jVar == null) {
            z0(7);
            throw null;
        }
        if (i10 == 0) {
            z0(8);
            throw null;
        }
        if (jVar2 == null) {
            z0(9);
            throw null;
        }
        if (j0Var == null) {
            z0(10);
            throw null;
        }
        if (i10 != 1 && i10 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + jVar + "\nkind: " + wi.d.p(i10));
        }
        zk.e eVar = (zk.e) jVar;
        b bVar = (b) sVar;
        if (i10 == 0) {
            z0(13);
            throw null;
        }
        b bVar2 = new b(eVar, bVar, jVar2, this.D, i10, j0Var);
        Boolean bool = this.E;
        bool.getClass();
        bVar2.E = bool;
        Boolean bool2 = this.F;
        bool2.getClass();
        bVar2.F = bool2;
        return bVar2;
    }

    @Override // kl.a
    public final a m(pm.y yVar, ArrayList arrayList, pm.y yVar2, wj.f fVar) {
        b bVarB1 = b1(e(), null, getKind(), getAnnotations(), c());
        bVarB1.O0(yVar == null ? null : m.k(bVarB1, yVar, i.f3645a), this.f6642j, v.f53866a, getTypeParameters(), com.bumptech.glide.d.r(arrayList, B(), bVarB1), yVar2, j(), getVisibility());
        if (fVar != null) {
            bVarB1.Q0((zk.a) fVar.f53283a, fVar.f53284b);
        }
        return bVarB1;
    }
}

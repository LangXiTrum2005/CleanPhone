package kl;

import al.i;
import al.k;
import bm.m;
import cl.n0;
import cl.o0;
import cl.p0;
import cl.x0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import il.o;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import pm.y;
import pm.y0;
import wk.h;
import wk.q;
import xj.v;
import zk.h0;
import zk.j;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f extends n0 implements a {
    public final boolean A;
    public final wj.f B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, al.j jVar2, int i10, o oVar, boolean z10, yl.f fVar, j0 j0Var, h0 h0Var, int i11, boolean z11, wj.f fVar2) {
        super(jVar, h0Var, jVar2, i10, oVar, z10, fVar, i11, j0Var, false, false, false, false, false);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (jVar2 == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (oVar == null) {
            z0(3);
            throw null;
        }
        if (fVar == null) {
            z0(4);
            throw null;
        }
        if (j0Var == null) {
            z0(5);
            throw null;
        }
        if (i11 == 0) {
            z0(6);
            throw null;
        }
        this.A = z11;
        this.B = fVar2;
    }

    public static f R0(j jVar, ll.c cVar, o oVar, boolean z10, yl.f fVar, el.g gVar, boolean z11) {
        if (jVar == null) {
            z0(7);
            throw null;
        }
        if (fVar != null) {
            return new f(jVar, cVar, 1, oVar, z10, fVar, gVar, null, 1, z11, null);
        }
        z0(11);
        throw null;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // cl.n0
    public final n0 L0(j jVar, int i10, o oVar, h0 h0Var, int i11, yl.f fVar) {
        if (jVar == null) {
            z0(13);
            throw null;
        }
        if (i10 == 0) {
            z0(14);
            throw null;
        }
        if (oVar == null) {
            z0(15);
            throw null;
        }
        if (i11 == 0) {
            z0(16);
            throw null;
        }
        if (fVar == null) {
            z0(17);
            throw null;
        }
        return new f(jVar, getAnnotations(), i10, oVar, this.f6560f, fVar, j0.C9, h0Var, i11, this.A, this.B);
    }

    @Override // cl.y0, zk.b
    public final boolean a0() {
        return false;
    }

    @Override // cl.n0, zk.b
    public final Object d0(zk.a aVar) {
        wj.f fVar = this.B;
        if (fVar == null || !((zk.a) fVar.f53283a).equals(aVar)) {
            return null;
        }
        return fVar.f53284b;
    }

    @Override // cl.n0, zk.p0
    public final boolean isConst() {
        y type = getType();
        if (!this.A) {
            return false;
        }
        n.f(type, "type");
        if (((!h.F(type) && !q.a(type)) || y0.e(type)) && !h.G(type)) {
            return false;
        }
        k kVar = ql.q.f49169a;
        yl.c ENHANCED_NULLABILITY_ANNOTATION = il.y.f43134p;
        n.e(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !qm.g.u(type, ENHANCED_NULLABILITY_ANNOTATION) || h.G(type);
    }

    @Override // kl.a
    public final a m(y yVar, ArrayList arrayList, y yVar2, wj.f fVar) {
        y yVar3;
        o0 o0Var;
        p0 p0Var;
        h0 h0VarA = a() == this ? null : a();
        f fVar2 = new f(e(), getAnnotations(), j(), getVisibility(), this.f6560f, getName(), c(), h0VarA, getKind(), this.A, fVar);
        o0 o0Var2 = this.f6576w;
        if (o0Var2 != null) {
            o0 o0Var3 = new o0(fVar2, o0Var2.getAnnotations(), o0Var2.j(), o0Var2.getVisibility(), o0Var2.f6535e, o0Var2.f6536f, o0Var2.f6539i, getKind(), h0VarA == null ? null : h0VarA.getGetter(), o0Var2.c());
            o0Var3.l = o0Var2.l;
            yVar3 = yVar2;
            o0Var3.f6582m = yVar3;
            o0Var = o0Var3;
        } else {
            yVar3 = yVar2;
            o0Var = null;
        }
        p0 p0Var2 = this.f6577x;
        if (p0Var2 != null) {
            p0 p0Var3 = p0Var2;
            p0Var = new p0(fVar2, p0Var2.getAnnotations(), p0Var3.j(), p0Var3.getVisibility(), p0Var3.f6535e, p0Var3.f6536f, p0Var3.f6539i, getKind(), h0VarA == null ? null : h0VarA.getSetter(), p0Var2.c());
            p0Var.l = p0Var.l;
            x0 x0Var = (x0) p0Var2.B().get(0);
            if (x0Var == null) {
                p0.z0(6);
                throw null;
            }
            p0Var.f6585m = x0Var;
        } else {
            p0Var = null;
        }
        fVar2.N0(o0Var, p0Var, this.f6578y, this.f6579z);
        jk.a aVar = this.f6562h;
        if (aVar != null) {
            fVar2.O0(this.f6561g, aVar);
        }
        fVar2.t0(f());
        fVar2.Q0(yVar3, getTypeParameters(), this.f6573t, yVar != null ? m.k(this, yVar, i.f3645a) : null, v.f53866a);
        return fVar2;
    }

    @Override // cl.n0
    public final void P0(y yVar) {
    }
}

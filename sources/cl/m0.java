package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zk.j f6544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public il.o f6546c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6548e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f6551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yl.f f6552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pm.y f6553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n0 f6554k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk.h0 f6547d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pm.t0 f6549f = pm.t0.f48476a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6550g = true;

    public m0(n0 n0Var) {
        this.f6554k = n0Var;
        this.f6544a = n0Var.e();
        this.f6545b = n0Var.j();
        this.f6546c = n0Var.getVisibility();
        this.f6548e = n0Var.getKind();
        this.f6551h = n0Var.f6573t;
        this.f6552i = n0Var.getName();
        this.f6553j = n0Var.getType();
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "setOwner";
        } else if (i10 == 2) {
            objArr[1] = "setOriginal";
        } else if (i10 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i10 == 5) {
            objArr[1] = "setReturnType";
        } else if (i10 == 7) {
            objArr[1] = "setModality";
        } else if (i10 == 9) {
            objArr[1] = "setVisibility";
        } else if (i10 == 11) {
            objArr[1] = "setKind";
        } else if (i10 == 19) {
            objArr[1] = "setName";
        } else if (i10 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i10 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i10 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i10 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [cl.l0, cl.p0, zk.s] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [cl.o0] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [cl.p0] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [cl.l0, cl.o0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v25, types: [cl.w] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [pm.y] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r6v4, types: [cl.w] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [cl.n0, zk.b, zk.h0, zk.j] */
    public final n0 b() {
        z zVar;
        z zVar2;
        ?? o0Var;
        ?? p0Var;
        pm.w0 w0Var;
        jk.a aVar;
        z zVar3;
        z zVar4;
        pm.y yVarI;
        zk.j jVar = this.f6544a;
        int i10 = this.f6545b;
        il.o oVar = this.f6546c;
        zk.h0 h0Var = this.f6547d;
        int i11 = this.f6548e;
        yl.f fVar = this.f6552i;
        n0 n0Var = this.f6554k;
        ?? L0 = n0Var.L0(jVar, i10, oVar, h0Var, i11, fVar);
        List typeParameters = n0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        pm.w0 w0VarV = pm.c.v(typeParameters, this.f6549f, L0, arrayList);
        pm.y yVar = this.f6553j;
        pm.y yVarI2 = w0VarV.i(3, yVar);
        z zVar5 = null;
        if (yVarI2 != null) {
            pm.y yVarI3 = w0VarV.i(2, yVar);
            if (yVarI3 != null) {
                L0.P0(yVarI3);
            }
            z zVar6 = this.f6551h;
            if (zVar6 != null) {
                z zVarB = zVar6.b(w0VarV);
                zVar = zVarB != null ? zVarB : null;
            }
            z zVar7 = n0Var.f6574u;
            if (zVar7 == null || (yVarI = w0VarV.i(2, zVar7.getType())) == null) {
                zVar2 = null;
            } else {
                zVar7.J0();
                zVar2 = new z(L0, new jm.b(L0, yVarI), zVar7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            for (z zVar8 : n0Var.f6572s) {
                pm.y yVarI4 = w0VarV.i(2, zVar8.getType());
                if (yVarI4 == null) {
                    zVar3 = zVar5;
                    zVar4 = zVar3;
                } else {
                    zVar4 = zVar5;
                    yl.f fVarH0 = ((jm.a) zVar8.J0()).H0();
                    zVar8.J0();
                    zVar3 = new z(L0, new jm.a((zk.b) L0, yVarI4, fVarH0), zVar8.getAnnotations());
                }
                if (zVar3 != null) {
                    arrayList2.add(zVar3);
                }
                zVar5 = zVar4;
            }
            ?? r19 = zVar5;
            L0.Q0(yVarI2, arrayList, zVar, zVar2, arrayList2);
            o0 o0Var2 = n0Var.f6576w;
            zk.k0 k0Var = zk.j0.C9;
            if (o0Var2 == null) {
                o0Var = r19;
            } else {
                al.j annotations = o0Var2.getAnnotations();
                int i12 = this.f6545b;
                il.o visibility = n0Var.f6576w.getVisibility();
                if (this.f6548e == 2 && zk.n.e(zk.n.f(visibility.f43095a.l()))) {
                    visibility = zk.n.f54981h;
                }
                il.o oVar2 = visibility;
                o0 o0Var3 = n0Var.f6576w;
                boolean z10 = o0Var3.f6535e;
                boolean z11 = o0Var3.f6536f;
                boolean z12 = o0Var3.f6539i;
                int i13 = this.f6548e;
                zk.h0 h0Var2 = this.f6547d;
                o0Var = new o0(L0, annotations, i12, oVar2, z10, z11, z12, i13, h0Var2 == null ? r19 : h0Var2.getGetter(), k0Var);
            }
            if (o0Var != 0) {
                o0 o0Var4 = n0Var.f6576w;
                pm.y yVar2 = o0Var4.f6582m;
                o0Var.l = n0.M0(w0VarV, o0Var4);
                o0Var.M0(yVar2 != null ? w0VarV.i(3, yVar2) : r19);
            }
            p0 p0Var2 = n0Var.f6577x;
            if (p0Var2 == null) {
                p0Var = r19;
            } else {
                al.j annotations2 = p0Var2.getAnnotations();
                int i14 = this.f6545b;
                il.o visibility2 = n0Var.f6577x.getVisibility();
                if (this.f6548e == 2 && zk.n.e(zk.n.f(visibility2.f43095a.l()))) {
                    visibility2 = zk.n.f54981h;
                }
                il.o oVar3 = visibility2;
                p0 p0Var3 = n0Var.f6577x;
                boolean z13 = p0Var3.f6535e;
                boolean z14 = p0Var3.f6536f;
                boolean z15 = p0Var3.f6539i;
                int i15 = this.f6548e;
                zk.h0 h0Var3 = this.f6547d;
                p0Var = new p0(L0, annotations2, i14, oVar3, z13, z14, z15, i15, h0Var3 == null ? r19 : h0Var3.getSetter(), k0Var);
            }
            if (p0Var != 0) {
                w0Var = w0VarV;
                List listN0 = y.N0(p0Var, n0Var.f6577x.B(), w0Var, false, false, null);
                if (listN0 == null) {
                    listN0 = Collections.singletonList(p0.L0(p0Var, fm.e.e(this.f6544a).n(), ((x0) n0Var.f6577x.B().get(0)).getAnnotations()));
                }
                if (listN0.size() != 1) {
                    throw new IllegalStateException();
                }
                p0Var.l = n0.M0(w0Var, n0Var.f6577x);
                x0 x0Var = (x0) listN0.get(0);
                if (x0Var == null) {
                    p0.z0(6);
                    throw r19;
                }
                p0Var.f6585m = x0Var;
            } else {
                w0Var = w0VarV;
            }
            w wVar = n0Var.f6578y;
            ?? wVar2 = wVar == null ? r19 : new w(wVar.getAnnotations(), L0);
            w wVar3 = n0Var.f6579z;
            L0.N0(o0Var, p0Var, wVar2, wVar3 == null ? r19 : new w(wVar3.getAnnotations(), L0));
            if (this.f6550g) {
                ym.i iVar = new ym.i();
                Iterator it = n0Var.f().iterator();
                while (it.hasNext()) {
                    iVar.add(((zk.h0) it.next()).b(w0Var));
                }
                L0.f6565k = iVar;
            }
            if (n0Var.isConst() && (aVar = n0Var.f6562h) != null) {
                L0.O0(n0Var.f6561g, aVar);
            }
            return L0;
        }
        return null;
    }
}

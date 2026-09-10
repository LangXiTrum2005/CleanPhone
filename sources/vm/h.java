package vm;

import cl.x0;
import cl.z;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pm.a1;
import pm.c0;
import pm.y;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f52665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f52666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f52667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f52668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f52669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f52670k;
    public static final h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f52671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f52672n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52673e;

    static {
        int i10 = 1;
        f52665f = new h(i10, 0);
        f52666g = new h(i10, 1);
        f52667h = new h(i10, 2);
        f52668i = new h(i10, 3);
        f52669j = new h(i10, 4);
        f52670k = new h(i10, 5);
        l = new h(i10, 6);
        f52671m = new h(i10, 7);
        f52672n = new h(i10, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f52673e = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jk.b
    public final Object invoke(Object obj) throws IOException {
        c0 c0VarG;
        a1 a1VarH0;
        y returnType;
        boolean zB;
        yl.b bVarF;
        y returnType2;
        boolean z10 = true;
        switch (this.f52673e) {
            case 0:
                kotlin.jvm.internal.n.f((zk.s) obj, "$this$null");
                return null;
            case 1:
                kotlin.jvm.internal.n.f((zk.s) obj, "$this$null");
                return null;
            case 2:
                kotlin.jvm.internal.n.f((zk.s) obj, "$this$null");
                return null;
            case 3:
                zk.s $receiver = (zk.s) obj;
                kotlin.jvm.internal.n.f($receiver, "$this$$receiver");
                List valueParameters = $receiver.B();
                kotlin.jvm.internal.n.e(valueParameters, "valueParameters");
                x0 x0Var = (x0) xj.n.x0(valueParameters);
                z10 = (x0Var == null || fm.e.a(x0Var) || x0Var.f6635j != null) ? false : true;
                List list = q.f52691c;
                if (z10) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            case 4:
                zk.s $receiver2 = (zk.s) obj;
                kotlin.jvm.internal.n.f($receiver2, "$this$$receiver");
                List list2 = q.f52691c;
                zk.j containingDeclaration = $receiver2.e();
                kotlin.jvm.internal.n.e(containingDeclaration, "containingDeclaration");
                if (containingDeclaration instanceof zk.e) {
                    yl.f fVar = wk.h.f53310e;
                    if (wk.h.b((zk.e) containingDeclaration, wk.l.f53335a)) {
                        return null;
                    }
                }
                Collection overriddenDescriptors = $receiver2.f();
                kotlin.jvm.internal.n.e(overriddenDescriptors, "overriddenDescriptors");
                Collection collection = overriddenDescriptors;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        zk.j jVarE = ((zk.s) it.next()).e();
                        kotlin.jvm.internal.n.e(jVarE, "it.containingDeclaration");
                        if (jVarE instanceof zk.e) {
                            yl.f fVar2 = wk.h.f53310e;
                            if (wk.h.b((zk.e) jVarE, wk.l.f53335a)) {
                                return null;
                            }
                        }
                    }
                }
                zk.j jVarE2 = $receiver2.e();
                zk.e eVar = jVarE2 instanceof zk.e ? (zk.e) jVarE2 : null;
                if (eVar != null) {
                    if (!bm.g.e(eVar)) {
                        eVar = null;
                    }
                    if (eVar != null && (c0VarG = eVar.g()) != null && (a1VarH0 = i0.h0(c0VarG)) != null && (returnType = $receiver2.getReturnType()) != null && kotlin.jvm.internal.n.a(((cl.p) $receiver2).getName(), r.f52695d)) {
                        yl.f fVar3 = wk.h.f53310e;
                        if ((wk.h.B(returnType, wk.l.f53345h) || wk.h.E(returnType)) && $receiver2.B().size() == 1) {
                            y type = ((x0) $receiver2.B().get(0)).getType();
                            kotlin.jvm.internal.n.e(type, "valueParameters[0].type");
                            if (kotlin.jvm.internal.n.a(i0.h0(type), a1VarH0) && $receiver2.p0().isEmpty() && $receiver2.J() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                zk.j containingDeclaration2 = $receiver2.e();
                kotlin.jvm.internal.n.e(containingDeclaration2, "containingDeclaration");
                if (bm.g.e(containingDeclaration2)) {
                    am.h hVar = am.h.f3707d;
                    zk.j jVarE3 = $receiver2.e();
                    kotlin.jvm.internal.n.d(jVarE3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    c0 c0VarG2 = ((zk.e) jVarE3).g();
                    kotlin.jvm.internal.n.e(c0VarG2, "containingDeclaration as…ssDescriptor).defaultType");
                    sb2.append(" or define ''equals(other: " + hVar.Y(i0.h0(c0VarG2)) + "): Boolean''");
                }
                String string = sb2.toString();
                kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 5:
                zk.s $receiver3 = (zk.s) obj;
                kotlin.jvm.internal.n.f($receiver3, "$this$$receiver");
                z zVarG = $receiver3.G();
                if (zVarG == null) {
                    zVarG = $receiver3.J();
                }
                List list3 = q.f52691c;
                if (zVarG == null) {
                    z10 = false;
                } else {
                    y returnType3 = $receiver3.getReturnType();
                    if (!(returnType3 != null ? qm.d.f49173a.b(returnType3, zVarG.getType()) : false)) {
                        jm.d dVarJ0 = zVarG.J0();
                        kotlin.jvm.internal.n.e(dVarJ0, "receiver.value");
                        if (dVarJ0 instanceof jm.c) {
                            zk.e eVar2 = ((jm.c) dVarJ0).f43990a;
                            if (eVar2.f0() && (bVarF = fm.e.f(eVar2)) != null) {
                                zk.g gVarE = zk.u.e(fm.e.j(eVar2), bVarF);
                                nm.s sVar = gVarE instanceof nm.s ? (nm.s) gVarE : null;
                                if (sVar == null || (returnType2 = $receiver3.getReturnType()) == null) {
                                    zB = false;
                                } else {
                                    zB = qm.d.f49173a.b(returnType2, sVar.K0());
                                }
                            } else {
                                zB = false;
                            }
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                wk.h hVar2 = (wk.h) obj;
                kotlin.jvm.internal.n.f(hVar2, "$this$null");
                return hVar2.s(wk.j.BOOLEAN);
            case 7:
                wk.h hVar3 = (wk.h) obj;
                kotlin.jvm.internal.n.f(hVar3, "$this$null");
                return hVar3.s(wk.j.INT);
            default:
                wk.h hVar4 = (wk.h) obj;
                kotlin.jvm.internal.n.f(hVar4, "$this$null");
                return hVar4.w();
        }
    }
}

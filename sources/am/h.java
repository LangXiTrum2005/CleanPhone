package am;

import cl.o0;
import cl.p0;
import cl.x0;
import cl.z;
import com.ironsource.D1;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pm.a0;
import pm.a1;
import pm.c0;
import pm.n0;
import pm.q0;
import pm.y;
import pm.y0;
import qk.w;
import xj.x;
import zk.b0;
import zk.e0;
import zk.h0;
import zk.m0;
import zk.u;
import zk.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f3706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f3707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f3708e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.j f3710b = r9.b.u(new al.l(this, 1));

    static {
        k kVar = new k();
        kVar.l();
        kVar.f3728a = true;
        new h(kVar);
        k kVar2 = new k();
        kVar2.l();
        x xVar = x.f53868a;
        kVar2.j(xVar);
        kVar2.f3728a = true;
        new h(kVar2);
        k kVar3 = new k();
        kVar3.l();
        kVar3.j(xVar);
        kVar3.g();
        kVar3.f3728a = true;
        new h(kVar3);
        k kVar4 = new k();
        kVar4.j(xVar);
        b bVar = b.f3693c;
        kVar4.i(bVar);
        o oVar = o.f3759b;
        kVar4.c(oVar);
        kVar4.f3728a = true;
        new h(kVar4);
        k kVar5 = new k();
        kVar5.l();
        kVar5.j(xVar);
        kVar5.i(bVar);
        kVar5.d();
        kVar5.c(o.f3760c);
        kVar5.a();
        kVar5.b();
        kVar5.g();
        kVar5.e();
        kVar5.f3728a = true;
        new h(kVar5);
        k kVar6 = new k();
        kVar6.j(i.f3711b);
        kVar6.f3728a = true;
        f3706c = new h(kVar6);
        k kVar7 = new k();
        kVar7.j(i.f3712c);
        kVar7.f3728a = true;
        new h(kVar7);
        k kVar8 = new k();
        kVar8.i(bVar);
        kVar8.c(oVar);
        kVar8.f3728a = true;
        f3707d = new h(kVar8);
        k kVar9 = new k();
        kVar9.h();
        kVar9.i(b.f3692b);
        kVar9.j(i.f3712c);
        kVar9.f3728a = true;
        f3708e = new h(kVar9);
        k kVar10 = new k();
        kVar10.m();
        kVar10.j(i.f3712c);
        kVar10.f3728a = true;
        new h(kVar10);
    }

    public h(k kVar) {
        this.f3709a = kVar;
    }

    public static void X(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean j0(y yVar) {
        if (!a.a.w(yVar)) {
            return false;
        }
        List listT = yVar.t();
        if ((listT instanceof Collection) && listT.isEmpty()) {
            return true;
        }
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            if (((q0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(h hVar, h0 h0Var, StringBuilder sb2) throws IOException {
        boolean zR = hVar.r();
        k kVar = hVar.f3709a;
        if (!zR) {
            wf.a aVar = kVar.f3734g;
            w[] wVarArr = k.W;
            if (!((Boolean) aVar.getValue(kVar, wVarArr[5])).booleanValue()) {
                if (hVar.q().contains(i.f3716g)) {
                    hVar.y(sb2, h0Var, null);
                    cl.w wVarO0 = h0Var.o0();
                    if (wVarO0 != null) {
                        hVar.y(sb2, wVarO0, al.e.FIELD);
                    }
                    cl.w wVarK = h0Var.K();
                    if (wVarK != null) {
                        hVar.y(sb2, wVarK, al.e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((p) kVar.G.getValue(kVar, wVarArr[31])) == p.f3763b) {
                        o0 getter = h0Var.getGetter();
                        if (getter != null) {
                            hVar.y(sb2, getter, al.e.PROPERTY_GETTER);
                        }
                        p0 setter = h0Var.getSetter();
                        if (setter != null) {
                            hVar.y(sb2, setter, al.e.PROPERTY_SETTER);
                            List listB = setter.B();
                            kotlin.jvm.internal.n.e(listB, "setter.valueParameters");
                            x0 it = (x0) xj.n.F0(listB);
                            kotlin.jvm.internal.n.e(it, "it");
                            hVar.y(sb2, it, al.e.SETTER_PARAMETER);
                        }
                    }
                }
                List listP0 = h0Var.p0();
                kotlin.jvm.internal.n.e(listP0, "property.contextReceiverParameters");
                hVar.C(sb2, listP0);
                il.o visibility = h0Var.getVisibility();
                kotlin.jvm.internal.n.e(visibility, "property.visibility");
                hVar.h0(visibility, sb2);
                hVar.N(sb2, hVar.q().contains(i.f3722n) && h0Var.isConst(), "const");
                hVar.K(h0Var, sb2);
                hVar.M(sb2, h0Var);
                hVar.S(sb2, h0Var);
                hVar.N(sb2, hVar.q().contains(i.f3723o) && h0Var.q0(), "lateinit");
                hVar.J(sb2, h0Var);
            }
            hVar.e0(h0Var, sb2, false);
            List typeParameters = h0Var.getTypeParameters();
            kotlin.jvm.internal.n.e(typeParameters, "property.typeParameters");
            hVar.d0(typeParameters, sb2, true);
            hVar.V(sb2, h0Var);
        }
        hVar.P(h0Var, sb2, true);
        sb2.append(": ");
        y type = h0Var.getType();
        kotlin.jvm.internal.n.e(type, "property.type");
        sb2.append(hVar.Y(type));
        hVar.W(sb2, h0Var);
        hVar.H(h0Var, sb2);
        List typeParameters2 = h0Var.getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters2, "property.typeParameters");
        hVar.i0(sb2, typeParameters2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[RETURN] */
    public static int v(v vVar) {
        if (vVar instanceof zk.e) {
            if (((zk.e) vVar).l0() == 2) {
                return 4;
            }
            return 1;
        }
        zk.j jVarE = vVar.e();
        zk.e eVar = jVarE instanceof zk.e ? (zk.e) jVarE : null;
        if (eVar != null && (vVar instanceof zk.c)) {
            zk.c cVar = (zk.c) vVar;
            Collection collectionF = cVar.f();
            kotlin.jvm.internal.n.e(collectionF, "this.overriddenDescriptors");
            if (!collectionF.isEmpty() && eVar.j() != 1) {
                return 3;
            }
            if (eVar.l0() == 2 && !kotlin.jvm.internal.n.a(cVar.getVisibility(), zk.n.f54974a)) {
                if (cVar.j() == 4) {
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    public final void A(zk.h hVar, StringBuilder sb2) {
        List listI = hVar.i();
        kotlin.jvm.internal.n.e(listI, "classifier.declaredTypeParameters");
        List parameters = hVar.n().getParameters();
        kotlin.jvm.internal.n.e(parameters, "classifier.typeConstructor.parameters");
        if (u() && hVar.u() && parameters.size() > listI.size()) {
            sb2.append(" /*captured type parameters: ");
            c0(sb2, parameters.subList(listI.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    public final String B(dm.g gVar) {
        if (gVar instanceof dm.b) {
            return xj.n.u0((Iterable) ((dm.b) gVar).f38953a, ", ", "{", "}", new f(this, 1), 24);
        }
        if (gVar instanceof dm.a) {
            return an.h.E0(x((al.c) ((dm.a) gVar).f38953a, null), "@");
        }
        if (!(gVar instanceof dm.s)) {
            return gVar.toString();
        }
        dm.r rVar = (dm.r) ((dm.s) gVar).f38953a;
        if (rVar instanceof dm.p) {
            return ((dm.p) rVar).f38960a + "::class";
        }
        if (!(rVar instanceof dm.q)) {
            throw new aa.b((byte) 0, 20);
        }
        dm.f fVar = ((dm.q) rVar).f38961a;
        String strB = fVar.f38951a.b().b();
        int i10 = fVar.f38952b;
        for (int i11 = 0; i11 < i10; i11++) {
            strB = defpackage.e.f('>', "kotlin.Array<", strB);
        }
        return wi.d.h(strB, "::class");
    }

    public final void C(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            z zVar = (z) it.next();
            y(sb2, zVar, al.e.RECEIVER);
            y type = zVar.getType();
            kotlin.jvm.internal.n.e(type, "contextReceiver.type");
            sb2.append(G(type));
            if (i10 == xj.o.P(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    public final void D(StringBuilder sb2, c0 c0Var) {
        y(sb2, c0Var, null);
        if (pm.c.j(c0Var)) {
            boolean z10 = c0Var instanceof rm.f;
            k kVar = this.f3709a;
            if (z10 && ((rm.f) c0Var).f49665d.f49697b && ((Boolean) kVar.T.getValue(kVar, k.W[45])).booleanValue()) {
                rm.i iVar = rm.i.f49698a;
                if (z10) {
                    boolean z11 = ((rm.f) c0Var).f49665d.f49697b;
                }
                n0 n0VarP = c0Var.P();
                kotlin.jvm.internal.n.d(n0VarP, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(E(((rm.g) n0VarP).f49671b[0]));
            } else {
                if (!z10 || ((Boolean) kVar.V.getValue(kVar, k.W[47])).booleanValue()) {
                    sb2.append(c0Var.P().toString());
                } else {
                    sb2.append(((rm.f) c0Var).f49669h);
                }
                sb2.append(Z(c0Var.t()));
            }
        } else {
            n0 n0VarP2 = c0Var.P();
            zk.g gVarE = c0Var.P().e();
            r1.s sVarA = u.a(c0Var, gVarE instanceof zk.h ? (zk.h) gVarE : null, 0);
            if (sVarA == null) {
                sb2.append(a0(n0VarP2));
                sb2.append(Z(c0Var.t()));
            } else {
                U(sb2, sVarA);
            }
        }
        if (c0Var.Q()) {
            sb2.append("?");
        }
        if (c0Var instanceof pm.n) {
            sb2.append(" & Any");
        }
    }

    public final String E(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return defpackage.e.o("<font color=red><b>", str, "</b></font>");
        }
        throw new aa.b((byte) 0, 20);
    }

    public final String F(String lowerRendered, String upperRendered, wk.h hVar) {
        kotlin.jvm.internal.n.f(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.n.f(upperRendered, "upperRendered");
        if (d0.c.S(lowerRendered, upperRendered)) {
            return an.p.p0(upperRendered, "(", false) ? defpackage.e.o("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        String strQ0 = an.h.Q0(p().a(hVar.i(wk.l.B), this), "Collection");
        String strH = d0.c.H(lowerRendered, strQ0.concat("Mutable"), upperRendered, strQ0, strQ0.concat("(Mutable)"));
        if (strH != null) {
            return strH;
        }
        String strH2 = d0.c.H(lowerRendered, strQ0.concat("MutableMap.MutableEntry"), upperRendered, strQ0.concat("Map.Entry"), strQ0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strH2 != null) {
            return strH2;
        }
        String strQ1 = an.h.Q0(p().a(hVar.j("Array"), this), "Array");
        String strH3 = d0.c.H(lowerRendered, strQ1.concat(o("Array<")), upperRendered, strQ1.concat(o("Array<out ")), strQ1.concat(o("Array<(out) ")));
        if (strH3 != null) {
            return strH3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String G(y yVar) throws IOException {
        String strY = Y(yVar);
        return ((!j0(yVar) || y0.e(yVar)) && !(yVar instanceof pm.n)) ? strY : defpackage.e.f(')', "(", strY);
    }

    public final void H(zk.p0 p0Var, StringBuilder sb2) {
        dm.g gVarH0;
        k kVar = this.f3709a;
        if (!((Boolean) kVar.f3747u.getValue(kVar, k.W[19])).booleanValue() || (gVarH0 = p0Var.h0()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(o(B(gVarH0)));
    }

    public final String I(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new aa.b((byte) 0, 20);
            }
            k kVar = this.f3709a;
            if (!((Boolean) kVar.U.getValue(kVar, k.W[46])).booleanValue()) {
                return defpackage.e.o("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(StringBuilder sb2, zk.c cVar) {
        String str;
        if (q().contains(i.f3718i) && u() && cVar.getKind() != 1) {
            sb2.append("/*");
            int kind = cVar.getKind();
            if (kind == 1) {
                str = "DECLARATION";
            } else if (kind == 2) {
                str = "FAKE_OVERRIDE";
            } else if (kind == 3) {
                str = "DELEGATION";
            } else {
                if (kind != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb2.append(android.support.v4.media.session.a.J(str));
            sb2.append("*/ ");
        }
    }

    public final void K(v vVar, StringBuilder sb2) {
        N(sb2, vVar.isExternal(), D1.f25920e);
        boolean z10 = false;
        N(sb2, q().contains(i.l) && vVar.f0(), "expect");
        if (q().contains(i.f3721m) && vVar.S()) {
            z10 = true;
        }
        N(sb2, z10, "actual");
    }

    public final void L(StringBuilder sb2, int i10, int i11) {
        String str;
        k kVar = this.f3709a;
        if (((Boolean) kVar.f3742p.getValue(kVar, k.W[14])).booleanValue() || i10 != i11) {
            boolean zContains = q().contains(i.f3714e);
            if (i10 == 1) {
                str = "FINAL";
            } else if (i10 == 2) {
                str = "SEALED";
            } else if (i10 == 3) {
                str = "OPEN";
            } else {
                if (i10 != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            N(sb2, zContains, android.support.v4.media.session.a.J(str));
        }
    }

    public final void M(StringBuilder sb2, zk.c cVar) {
        if (bm.e.s(cVar) && cVar.j() == 1) {
            return;
        }
        k kVar = this.f3709a;
        if (((n) kVar.A.getValue(kVar, k.W[25])) == n.f3755a && cVar.j() == 3 && !cVar.f().isEmpty()) {
            return;
        }
        int iJ = cVar.j();
        d5.u.u(iJ, "callable.modality");
        L(sb2, iJ, v(cVar));
    }

    public final void N(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(I(str));
            sb2.append(" ");
        }
    }

    public final String O(yl.f fVar, boolean z10) {
        String strO = o(d0.c.F(fVar));
        k kVar = this.f3709a;
        return (((Boolean) kVar.U.getValue(kVar, k.W[46])).booleanValue() && s() == s.f3766b && z10) ? defpackage.e.o("<b>", strO, "</b>") : strO;
    }

    public final void P(zk.j jVar, StringBuilder sb2, boolean z10) {
        yl.f name = jVar.getName();
        kotlin.jvm.internal.n.e(name, "descriptor.name");
        sb2.append(O(name, z10));
    }

    public final void Q(StringBuilder sb2, y yVar) throws IOException {
        a1 a1VarB0 = yVar.b0();
        pm.a aVar = a1VarB0 instanceof pm.a ? (pm.a) a1VarB0 : null;
        if (aVar == null) {
            R(sb2, yVar);
            return;
        }
        c0 c0Var = aVar.f48408b;
        k kVar = this.f3709a;
        wf.a aVar2 = kVar.Q;
        w[] wVarArr = k.W;
        if (((Boolean) aVar2.getValue(kVar, wVarArr[41])).booleanValue()) {
            R(sb2, c0Var);
            return;
        }
        R(sb2, aVar.f48409c);
        if (((Boolean) kVar.P.getValue(kVar, wVarArr[40])).booleanValue()) {
            s sVarS = s();
            q qVar = s.f3766b;
            if (sVarS == qVar) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* = ");
            R(sb2, c0Var);
            sb2.append(" */");
            if (s() == qVar) {
                sb2.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb2, y yVar) throws IOException {
        yl.f fVarO;
        String strO;
        k kVar = this.f3709a;
        if ((yVar instanceof a0) && kVar.n()) {
            om.i iVar = ((a0) yVar).f48412d;
            if (iVar.f47573c == om.k.f47577a || iVar.f47573c == om.k.f47578b) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof pm.r) {
            sb2.append(((pm.r) a1VarB0).A0(this, this));
            return;
        }
        if (a1VarB0 instanceof c0) {
            c0 c0Var = (c0) a1VarB0;
            if (c0Var.equals(y0.f48490b) || c0Var.P() == y0.f48489a.f49663b) {
                sb2.append("???");
                return;
            }
            n0 n0VarP = c0Var.P();
            if ((n0VarP instanceof rm.g) && ((rm.g) n0VarP).f49670a == rm.h.UNINFERRED_TYPE_VARIABLE) {
                if (!((Boolean) kVar.f3746t.getValue(kVar, k.W[18])).booleanValue()) {
                    sb2.append("???");
                    return;
                }
                n0 n0VarP2 = c0Var.P();
                kotlin.jvm.internal.n.d(n0VarP2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(E(((rm.g) n0VarP2).f49671b[0]));
                return;
            }
            if (pm.c.j(c0Var)) {
                D(sb2, c0Var);
                return;
            }
            if (!j0(c0Var)) {
                D(sb2, c0Var);
                return;
            }
            int length = sb2.length();
            ((h) this.f3710b.getValue()).y(sb2, c0Var, null);
            boolean z10 = sb2.length() != length;
            y yVarU = a.a.u(c0Var);
            List listQ = a.a.q(c0Var);
            if (!listQ.isEmpty()) {
                sb2.append("context(");
                Iterator it = listQ.subList(0, xj.o.P(listQ)).iterator();
                while (it.hasNext()) {
                    Q(sb2, (y) it.next());
                    sb2.append(", ");
                }
                Q(sb2, (y) xj.n.w0(listQ));
                sb2.append(") ");
            }
            boolean zY = a.a.y(c0Var);
            boolean zQ = c0Var.Q();
            boolean z11 = zQ || (z10 && yVarU != null);
            if (z11) {
                if (zY) {
                    sb2.insert(length, '(');
                } else {
                    if (z10) {
                        go.c.x(an.h.z0(sb2));
                        if (sb2.charAt(an.h.s0(sb2) - 1) != ')') {
                            sb2.insert(an.h.s0(sb2), "()");
                        }
                    }
                    sb2.append("(");
                }
            }
            N(sb2, zY, "suspend");
            if (yVarU != null) {
                boolean z12 = (j0(yVarU) && !yVarU.Q()) || a.a.y(yVarU) || !yVarU.getAnnotations().isEmpty() || (yVarU instanceof pm.n);
                if (z12) {
                    sb2.append("(");
                }
                Q(sb2, yVarU);
                if (z12) {
                    sb2.append(")");
                }
                sb2.append(".");
            }
            sb2.append("(");
            if (!a.a.w(c0Var) || c0Var.getAnnotations().d(wk.l.f53352p) == null || c0Var.t().size() > 1) {
                int i10 = 0;
                for (q0 typeProjection : a.a.v(c0Var)) {
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (((Boolean) kVar.S.getValue(kVar, k.W[43])).booleanValue()) {
                        y yVarB = typeProjection.b();
                        kotlin.jvm.internal.n.e(yVarB, "typeProjection.type");
                        fVarO = a.a.o(yVarB);
                    } else {
                        fVarO = null;
                    }
                    if (fVarO != null) {
                        sb2.append(O(fVarO, false));
                        sb2.append(": ");
                    }
                    kotlin.jvm.internal.n.f(typeProjection, "typeProjection");
                    StringBuilder sb3 = new StringBuilder();
                    xj.n.t0(j1.f.C(typeProjection), sb3, ", ", null, null, new f(this, 0), 60);
                    String string = sb3.toString();
                    kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
                    sb2.append(string);
                    i10 = i11;
                }
            } else {
                sb2.append("???");
            }
            sb2.append(") ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                strO = o("->");
            } else {
                if (iOrdinal != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                strO = "&rarr;";
            }
            sb2.append(strO);
            sb2.append(" ");
            a.a.w(c0Var);
            y yVarB2 = ((q0) xj.n.w0(c0Var.t())).b();
            kotlin.jvm.internal.n.e(yVarB2, "arguments.last().type");
            Q(sb2, yVarB2);
            if (z11) {
                sb2.append(")");
            }
            if (zQ) {
                sb2.append("?");
            }
        }
    }

    public final void S(StringBuilder sb2, zk.c cVar) {
        if (q().contains(i.f3715f) && !cVar.f().isEmpty()) {
            k kVar = this.f3709a;
            if (((n) kVar.A.getValue(kVar, k.W[25])) != n.f3756b) {
                N(sb2, true, "override");
                if (u()) {
                    sb2.append("/*");
                    sb2.append(cVar.f().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void T(yl.c cVar, String str, StringBuilder sb2) {
        sb2.append(I(str));
        yl.e eVarI = cVar.i();
        kotlin.jvm.internal.n.e(eVarI, "fqName.toUnsafe()");
        String strO = o(d0.c.G(eVarI.e()));
        if (strO.length() > 0) {
            sb2.append(" ");
            sb2.append(strO);
        }
    }

    public final void U(StringBuilder sb2, r1.s sVar) {
        r1.s sVar2 = (r1.s) sVar.f49340d;
        zk.h hVar = (zk.h) sVar.f49338b;
        if (sVar2 != null) {
            U(sb2, sVar2);
            sb2.append('.');
            yl.f name = hVar.getName();
            kotlin.jvm.internal.n.e(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(O(name, false));
        } else {
            n0 n0VarN = hVar.n();
            kotlin.jvm.internal.n.e(n0VarN, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(a0(n0VarN));
        }
        sb2.append(Z((List) sVar.f49339c));
    }

    public final void V(StringBuilder sb2, zk.c cVar) {
        z zVarJ = cVar.J();
        if (zVarJ != null) {
            y(sb2, zVarJ, al.e.RECEIVER);
            y type = zVarJ.getType();
            kotlin.jvm.internal.n.e(type, "receiver.type");
            sb2.append(G(type));
            sb2.append(".");
        }
    }

    public final void W(StringBuilder sb2, zk.c cVar) {
        z zVarJ;
        k kVar = this.f3709a;
        if (((Boolean) kVar.E.getValue(kVar, k.W[29])).booleanValue() && (zVarJ = cVar.J()) != null) {
            sb2.append(" on ");
            y type = zVarJ.getType();
            kotlin.jvm.internal.n.e(type, "receiver.type");
            sb2.append(Y(type));
        }
    }

    public final String Y(y type) throws IOException {
        kotlin.jvm.internal.n.f(type, "type");
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f3709a;
        Q(sb2, (y) ((jk.b) kVar.f3750x.getValue(kVar, k.W[22])).invoke(type));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String Z(List typeArguments) throws IOException {
        kotlin.jvm.internal.n.f(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o("<"));
        xj.n.t0(typeArguments, sb2, ", ", null, null, new f(this, 0), 60);
        sb2.append(o(">"));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // am.j
    public final void a() {
        this.f3709a.a();
    }

    public final String a0(n0 typeConstructor) {
        kotlin.jvm.internal.n.f(typeConstructor, "typeConstructor");
        zk.g klass = typeConstructor.e();
        if (klass instanceof m0 ? true : klass instanceof zk.e ? true : klass instanceof nm.s) {
            kotlin.jvm.internal.n.f(klass, "klass");
            return rm.i.f(klass) ? klass.n().toString() : p().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof pm.x ? ((pm.x) typeConstructor).c(g.f3702g) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // am.j
    public final void b() {
        this.f3709a.b();
    }

    public final void b0(m0 m0Var, StringBuilder sb2, boolean z10) {
        String str;
        if (z10) {
            sb2.append(o("<"));
        }
        if (u()) {
            sb2.append("/*");
            sb2.append(m0Var.getIndex());
            sb2.append("*/ ");
        }
        N(sb2, m0Var.q(), "reified");
        int iV = m0Var.v();
        if (iV == 1) {
            str = "";
        } else if (iV == 2) {
            str = ScarConstants.IN_SIGNAL_KEY;
        } else {
            if (iV != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z11 = true;
        N(sb2, str.length() > 0, str);
        y(sb2, m0Var, null);
        P(m0Var, sb2, z10);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            y yVar = (y) m0Var.getUpperBounds().iterator().next();
            if (yVar == null) {
                wk.h.a(141);
                throw null;
            }
            if (!wk.h.x(yVar) || !yVar.Q()) {
                sb2.append(" : ");
                sb2.append(Y(yVar));
            }
        } else if (z10) {
            for (y yVar2 : m0Var.getUpperBounds()) {
                if (yVar2 == null) {
                    wk.h.a(141);
                    throw null;
                }
                if (!wk.h.x(yVar2) || !yVar2.Q()) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(Y(yVar2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(o(">"));
        }
    }

    @Override // am.j
    public final void c(o oVar) {
        this.f3709a.c(oVar);
    }

    public final void c0(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((m0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // am.j
    public final void d() {
        this.f3709a.d();
    }

    public final void d0(List list, StringBuilder sb2, boolean z10) {
        k kVar = this.f3709a;
        if (((Boolean) kVar.f3748v.getValue(kVar, k.W[20])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb2.append(o("<"));
        c0(sb2, list);
        sb2.append(o(">"));
        if (z10) {
            sb2.append(" ");
        }
    }

    @Override // am.j
    public final void e() {
        this.f3709a.e();
    }

    public final void e0(zk.p0 p0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(p0Var instanceof x0)) {
            sb2.append(I(p0Var.I() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @Override // am.j
    public final Set f() {
        return this.f3709a.f();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void f0(x0 x0Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        if (z11) {
            sb2.append(I("value-parameter"));
            sb2.append(" ");
        }
        if (u()) {
            sb2.append("/*");
            sb2.append(x0Var.f6631f);
            sb2.append("*/ ");
        }
        y(sb2, x0Var, null);
        N(sb2, x0Var.f6633h, "crossinline");
        N(sb2, x0Var.f6634i, "noinline");
        k kVar = this.f3709a;
        wf.a aVar = kVar.f3744r;
        w[] wVarArr = k.W;
        boolean z13 = false;
        if (((Boolean) aVar.getValue(kVar, wVarArr[16])).booleanValue()) {
            zk.b bVarL0 = x0Var.e();
            cl.l lVar = bVarL0 instanceof cl.l ? (cl.l) bVarL0 : null;
            if (lVar == null || !lVar.D) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            N(sb2, ((Boolean) kVar.f3745s.getValue(kVar, wVarArr[17])).booleanValue(), "actual");
        }
        y type = x0Var.getType();
        kotlin.jvm.internal.n.e(type, "variable.type");
        y yVar = x0Var.f6635j;
        y yVar2 = yVar == null ? type : yVar;
        N(sb2, yVar != null, "vararg");
        if (z12 || (z11 && !r())) {
            e0(x0Var, sb2, z12);
        }
        if (z10) {
            P(x0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(Y(yVar2));
        H(x0Var, sb2);
        if (u() && yVar != null) {
            sb2.append(" /*");
            sb2.append(Y(type));
            sb2.append("*/");
        }
        if (((jk.b) kVar.f3751y.getValue(kVar, wVarArr[23])) != null) {
            if (kVar.n() ? x0Var.K0() : fm.e.a(x0Var)) {
                z13 = true;
            }
        }
        if (z13) {
            StringBuilder sb3 = new StringBuilder(" = ");
            jk.b bVar = (jk.b) kVar.f3751y.getValue(kVar, wVarArr[23]);
            kotlin.jvm.internal.n.c(bVar);
            sb3.append((String) bVar.invoke(x0Var));
            sb2.append(sb3.toString());
        }
    }

    @Override // am.j
    public final void g() {
        this.f3709a.g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public final void g0(Collection collection, boolean z10, StringBuilder builder) {
        boolean z11;
        k kVar = this.f3709a;
        int iOrdinal = ((o) kVar.D.getValue(kVar, k.W[28])).ordinal();
        if (iOrdinal == 0) {
            z11 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new aa.b((byte) 0, 20);
                }
            } else if (!z10) {
                z11 = true;
            }
            z11 = false;
        }
        int size = collection.size();
        t().getClass();
        kotlin.jvm.internal.n.f(builder, "builder");
        builder.append("(");
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            x0 parameter = (x0) it.next();
            t().getClass();
            kotlin.jvm.internal.n.f(parameter, "parameter");
            f0(parameter, z11, builder, false);
            t().getClass();
            if (i10 != size - 1) {
                builder.append(", ");
            }
            i10 = i11;
        }
        t().getClass();
        builder.append(")");
    }

    @Override // am.j
    public final void h() {
        this.f3709a.h();
    }

    public final boolean h0(il.o oVar, StringBuilder sb2) {
        if (!q().contains(i.f3713d)) {
            return false;
        }
        k kVar = this.f3709a;
        wf.a aVar = kVar.f3740n;
        w[] wVarArr = k.W;
        if (((Boolean) aVar.getValue(kVar, wVarArr[12])).booleanValue()) {
            oVar = zk.n.f(oVar.f43095a.l());
        }
        if (!((Boolean) kVar.f3741o.getValue(kVar, wVarArr[13])).booleanValue() && kotlin.jvm.internal.n.a(oVar, zk.n.f54983j)) {
            return false;
        }
        sb2.append(I(oVar.f43095a.e()));
        sb2.append(" ");
        return true;
    }

    @Override // am.j
    public final void i(c cVar) {
        this.f3709a.i(cVar);
    }

    public final void i0(StringBuilder sb2, List list) throws IOException {
        k kVar = this.f3709a;
        if (((Boolean) kVar.f3748v.getValue(kVar, k.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            List upperBounds = m0Var.getUpperBounds();
            kotlin.jvm.internal.n.e(upperBounds, "typeParameter.upperBounds");
            for (y it2 : xj.n.k0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                yl.f name = m0Var.getName();
                kotlin.jvm.internal.n.e(name, "typeParameter.name");
                sb3.append(O(name, false));
                sb3.append(" : ");
                kotlin.jvm.internal.n.e(it2, "it");
                sb3.append(Y(it2));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(I("where"));
        sb2.append(" ");
        xj.n.t0(arrayList, sb2, ", ", null, null, null, 124);
    }

    @Override // am.j
    public final void j(Set set) {
        kotlin.jvm.internal.n.f(set, "<set-?>");
        this.f3709a.j(set);
    }

    @Override // am.j
    public final void k(LinkedHashSet linkedHashSet) {
        this.f3709a.k(linkedHashSet);
    }

    @Override // am.j
    public final void l() {
        this.f3709a.l();
    }

    @Override // am.j
    public final void m() {
        this.f3709a.m();
    }

    public final String o(String str) {
        return s().a(str);
    }

    public final c p() {
        k kVar = this.f3709a;
        return (c) kVar.f3729b.getValue(kVar, k.W[0]);
    }

    public final Set q() {
        k kVar = this.f3709a;
        return (Set) kVar.f3732e.getValue(kVar, k.W[3]);
    }

    public final boolean r() {
        k kVar = this.f3709a;
        return ((Boolean) kVar.f3733f.getValue(kVar, k.W[4])).booleanValue();
    }

    public final s s() {
        k kVar = this.f3709a;
        return (s) kVar.C.getValue(kVar, k.W[27]);
    }

    public final d t() {
        k kVar = this.f3709a;
        return (d) kVar.B.getValue(kVar, k.W[26]);
    }

    public final boolean u() {
        k kVar = this.f3709a;
        return ((Boolean) kVar.f3737j.getValue(kVar, k.W[8])).booleanValue();
    }

    public final String w(zk.j declarationDescriptor) {
        zk.j jVarE;
        String str;
        kotlin.jvm.internal.n.f(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.c0(new e(this, 0), sb2);
        k kVar = this.f3709a;
        wf.a aVar = kVar.f3730c;
        w[] wVarArr = k.W;
        if (((Boolean) aVar.getValue(kVar, wVarArr[1])).booleanValue() && !(declarationDescriptor instanceof b0) && !(declarationDescriptor instanceof e0) && (jVarE = declarationDescriptor.e()) != null && !(jVarE instanceof zk.w)) {
            sb2.append(" ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            yl.e eVarG = bm.e.g(jVarE);
            kotlin.jvm.internal.n.e(eVarG, "getFqName(containingDeclaration)");
            sb2.append(eVarG.f54510a.isEmpty() ? "root package" : o(d0.c.G(eVarG.e())));
            if (((Boolean) kVar.f3731d.getValue(kVar, wVarArr[2])).booleanValue() && (jVarE instanceof b0) && (declarationDescriptor instanceof zk.k)) {
                ((zk.k) declarationDescriptor).c().getClass();
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String x(al.c annotation, al.e eVar) throws IOException {
        List listA0;
        cl.l lVarY;
        List listB;
        k kVar = this.f3709a;
        wf.a aVar = kVar.M;
        kotlin.jvm.internal.n.f(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.f3637a + ':');
        }
        y type = annotation.getType();
        sb2.append(Y(type));
        w[] wVarArr = k.W;
        if (((a) aVar.getValue(kVar, wVarArr[37])).f3690a) {
            Map mapD = annotation.d();
            List list = null;
            zk.e eVarD = ((Boolean) kVar.H.getValue(kVar, wVarArr[32])).booleanValue() ? fm.e.d(annotation) : null;
            if (eVarD != null && (lVarY = eVarD.y()) != null && (listB = lVarY.B()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((x0) obj).K0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((x0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = xj.v.f53866a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                yl.f it2 = (yl.f) obj2;
                kotlin.jvm.internal.n.e(it2, "it");
                if (!mapD.containsKey(it2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(xj.p.W(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((yl.f) it3.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapD.entrySet();
            ArrayList arrayList5 = new ArrayList(xj.p.W(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                yl.f fVar = (yl.f) entry.getKey();
                dm.g gVar = (dm.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.b());
                sb3.append(" = ");
                sb3.append(!list.contains(fVar) ? B(gVar) : "...");
                arrayList5.add(sb3.toString());
            }
            ArrayList arrayListB0 = xj.n.B0(arrayList5, arrayList4);
            if (arrayListB0.size() <= 1) {
                listA0 = xj.n.N0(arrayListB0);
            } else {
                Object[] array = arrayListB0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                kotlin.jvm.internal.n.f(comparableArr, "<this>");
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                listA0 = xj.k.a0(array);
            }
            if (((a) aVar.getValue(kVar, k.W[37])).f3691b || !listA0.isEmpty()) {
                xj.n.t0(listA0, sb2, ", ", "(", ")", null, InterfaceC0435l1.d.b.f29113j);
            }
        }
        if (u() && (pm.c.j(type) || (type.P().e() instanceof zk.z))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void y(StringBuilder sb2, al.a aVar, al.e eVar) {
        if (q().contains(i.f3716g)) {
            boolean z10 = aVar instanceof y;
            k kVar = this.f3709a;
            Set setF = z10 ? kVar.f() : (Set) kVar.J.getValue(kVar, k.W[34]);
            jk.b bVar = (jk.b) kVar.L.getValue(kVar, k.W[36]);
            for (al.c cVar : aVar.getAnnotations()) {
                if (!xj.n.i0(setF, cVar.e()) && !kotlin.jvm.internal.n.a(cVar.e(), wk.l.f53354r) && (bVar == null || ((Boolean) bVar.invoke(cVar)).booleanValue())) {
                    sb2.append(x(cVar, eVar));
                    if (((Boolean) kVar.I.getValue(kVar, k.W[33])).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }
}

package lm;

import cl.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m0.s1;
import pm.g0;
import pm.h0;
import pm.j0;
import pm.n0;
import pm.q0;
import pm.r0;
import pm.y0;
import qk.i0;
import tl.o0;
import tl.v0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f45519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f45520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.j f45523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.j f45524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f45525g;

    public b0(com.google.android.gms.internal.consent_sdk.d dVar, b0 b0Var, List typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        kotlin.jvm.internal.n.f(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.n.f(debugName, "debugName");
        this.f45519a = dVar;
        this.f45520b = b0Var;
        this.f45521c = debugName;
        this.f45522d = str;
        i iVar = (i) dVar.f22981a;
        this.f45523e = iVar.f45537a.c(new y(this, 0));
        this.f45524f = iVar.f45537a.c(new y(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = xj.w.f53867a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                v0 v0Var = (v0) it.next();
                linkedHashMap.put(Integer.valueOf(v0Var.f51499d), new nm.t(this.f45519a, v0Var, i10));
                i10++;
            }
        }
        this.f45525g = linkedHashMap;
    }

    public static pm.c0 a(pm.c0 c0Var, pm.y yVar) {
        wk.h hVarH = i0.H(c0Var);
        al.j annotations = c0Var.getAnnotations();
        pm.y yVarU = a.a.u(c0Var);
        List listQ = a.a.q(c0Var);
        List listL0 = xj.n.l0(a.a.v(c0Var));
        ArrayList arrayList = new ArrayList(xj.p.W(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).b());
        }
        return a.a.i(hVarH, annotations, yVarU, listQ, arrayList, yVar, true).i0(c0Var.Q());
    }

    public static final ArrayList e(tl.q0 q0Var, b0 b0Var) {
        List argumentList = q0Var.f51413d;
        kotlin.jvm.internal.n.e(argumentList, "argumentList");
        List list = argumentList;
        tl.q0 q0VarT = com.google.android.gms.internal.auth.o.t(q0Var, (l3.i) b0Var.f45519a.f22984d);
        Iterable iterableE = q0VarT != null ? e(q0VarT, b0Var) : null;
        if (iterableE == null) {
            iterableE = xj.v.f53866a;
        }
        return xj.n.B0(iterableE, list);
    }

    public static j0 f(List list, al.j jVar, n0 n0Var, zk.j jVar2) {
        j0 j0VarG;
        List list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((pm.m) it.next()).getClass();
            if (jVar.isEmpty()) {
                j0.f48443b.getClass();
                j0VarG = j0.f48444c;
            } else {
                s1 s1Var = j0.f48443b;
                List listC = j1.f.C(new pm.i(jVar));
                s1Var.getClass();
                j0VarG = s1.g(listC);
            }
            arrayList.add(j0VarG);
        }
        ArrayList arrayListX = xj.p.X(arrayList);
        j0.f48443b.getClass();
        return s1.g(arrayListX);
    }

    public static final zk.e h(b0 b0Var, tl.q0 q0Var, int i10) {
        com.google.android.gms.internal.consent_sdk.d dVar = b0Var.f45519a;
        yl.b bVarR = com.bumptech.glide.c.r((vl.f) dVar.f22982b, i10);
        zm.s sVarU = zm.l.U(zm.l.R(q0Var, new y(b0Var, 2)), a0.f45516f);
        ArrayList arrayList = new ArrayList();
        Iterator it = sVarU.iterator();
        while (true) {
            zm.r rVar = (zm.r) it;
            if (!rVar.hasNext()) {
                break;
            }
            arrayList.add(rVar.next());
        }
        int iN = zm.l.N(zm.l.R(bVarR, z.f45601b));
        while (arrayList.size() < iN) {
            arrayList.add(0);
        }
        return ((i) dVar.f22981a).l.r(bVarR, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return xj.n.N0(this.f45525g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final m0 c(int i10) {
        m0 m0Var = (m0) this.f45525g.get(Integer.valueOf(i10));
        if (m0Var != null) {
            return m0Var;
        }
        b0 b0Var = this.f45520b;
        if (b0Var != null) {
            return b0Var.c(i10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02de  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:141:0x0361  */
    /* JADX WARN: Code duplicated, block: B:142:0x0363  */
    /* JADX WARN: Code duplicated, block: B:144:0x0377  */
    /* JADX WARN: Code duplicated, block: B:146:0x037d  */
    /* JADX WARN: Code duplicated, block: B:147:0x037f  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:163:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x0165  */
    /* JADX WARN: Code duplicated, block: B:51:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0188  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197  */
    /* JADX WARN: Code duplicated, block: B:57:0x019e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01db  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:97:0x0282  */
    /* JADX WARN: Code duplicated, block: B:99:0x0290  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x037f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01bc, please report this as an issue */
    public final pm.c0 d(tl.q0 proto, boolean z10) {
        n0 n0VarD;
        zk.g gVarH;
        Object next;
        j0 j0VarF;
        ArrayList arrayList;
        Iterator it;
        int i10;
        List listN0;
        pm.c0 computedType;
        pm.n nVarP;
        boolean z11;
        int size;
        pm.c0 c0VarR;
        zk.g gVarE;
        xk.e eVarS;
        q0 q0Var;
        pm.y yVarB;
        int size2;
        int i11;
        tl.q0 q0VarA;
        Object next2;
        int i12;
        o0 o0Var;
        m0 m0Var;
        tl.n0 n0Var;
        int iOrdinal;
        Iterator it2;
        int i13;
        int i14;
        tl.q0 q0VarA2;
        Object r0Var;
        com.google.android.gms.internal.consent_sdk.d dVar = this.f45519a;
        l3.i iVar = (l3.i) dVar.f22984d;
        vl.f fVar = (vl.f) dVar.f22982b;
        zk.j jVar = (zk.j) dVar.f22983c;
        i iVar2 = (i) dVar.f22981a;
        kotlin.jvm.internal.n.f(proto, "proto");
        if (proto.s()) {
            if (com.bumptech.glide.c.r((vl.f) dVar.f22982b, proto.f51418i).f54503c) {
                ((i) dVar.f22981a).f45543g.getClass();
            }
        } else if ((proto.f51412c & 128) == 128) {
            if (com.bumptech.glide.c.r((vl.f) dVar.f22982b, proto.l).f54503c) {
                ((i) dVar.f22981a).f45543g.getClass();
            }
        }
        if (!proto.s()) {
            int i15 = proto.f51412c;
            if ((i15 & 32) == 32) {
                gVarH = c(proto.f51419j);
                if (gVarH == null) {
                    rm.i iVar3 = rm.i.f49698a;
                    n0VarD = rm.i.d(rm.h.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.f51419j), this.f45522d);
                }
            } else if ((i15 & 64) == 64) {
                String string = fVar.getString(proto.f51420k);
                Iterator it3 = b().iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!kotlin.jvm.internal.n.a(((m0) next).getName().b(), string));
                m0 m0Var2 = (m0) next;
                if (m0Var2 == null) {
                    rm.i iVar4 = rm.i.f49698a;
                    n0VarD = rm.i.d(rm.h.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, jVar.toString());
                } else {
                    gVarH = m0Var2;
                }
            } else if ((i15 & 128) == 128) {
                gVarH = (zk.g) this.f45524f.invoke(Integer.valueOf(proto.l));
                if (gVarH == null) {
                    gVarH = h(this, proto, proto.l);
                }
            } else {
                rm.i iVar5 = rm.i.f49698a;
                n0VarD = rm.i.d(rm.h.UNKNOWN_TYPE, new String[0]);
            }
            boolean z12 = true;
            if (rm.i.f(n0VarD.e())) {
                rm.i iVar6 = rm.i.f49698a;
                return rm.i.e(rm.h.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, xj.v.f53866a, n0VarD, (String[]) Arrays.copyOf(new String[]{n0VarD.toString()}, 1));
            }
            nm.a aVar = new nm.a(iVar2.f45537a, new t0(5, this, proto));
            j0VarF = f(iVar2.f45554s, aVar, n0VarD, jVar);
            ArrayList arrayListE = e(proto, this);
            arrayList = new ArrayList(xj.p.W(arrayListE, 10));
            it = arrayListE.iterator();
            i10 = 0;
            while (it.hasNext()) {
                next2 = it.next();
                i12 = i10 + 1;
                if (i10 >= 0) {
                    xj.o.V();
                    throw null;
                }
                o0Var = (o0) next2;
                List parameters = n0VarD.getParameters();
                kotlin.jvm.internal.n.e(parameters, "constructor.parameters");
                m0Var = (m0) xj.n.r0(i10, parameters);
                n0Var = o0Var.f51380c;
                if (n0Var == tl.n0.STAR) {
                    if (m0Var == null) {
                        r0Var = new g0(iVar2.f45538b.d());
                    } else {
                        r0Var = new h0(m0Var);
                    }
                    it2 = it;
                } else {
                    kotlin.jvm.internal.n.e(n0Var, "typeArgumentProto.projection");
                    iOrdinal = n0Var.ordinal();
                    if (iOrdinal != 0) {
                        it2 = it;
                        i13 = 3;
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new aa.b((byte) 0, 20);
                                }
                                throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + n0Var);
                            }
                            i13 = 1;
                        }
                    } else {
                        it2 = it;
                        i13 = 2;
                    }
                    i14 = o0Var.f51379b;
                    if ((i14 & 2) == 2) {
                        q0VarA2 = o0Var.f51381d;
                    } else if ((i14 & 4) == 4) {
                        q0VarA2 = iVar.a(o0Var.f51382e);
                    } else {
                        q0VarA2 = null;
                    }
                    if (q0VarA2 == null) {
                        r0Var = new r0(1, rm.i.c(rm.h.NO_RECORDED_TYPE, o0Var.toString()));
                    } else {
                        r0Var = new r0(i13, g(q0VarA2));
                    }
                }
                arrayList.add(r0Var);
                i10 = i12;
                it = it2;
            }
            listN0 = xj.n.N0(arrayList);
            zk.g gVarE2 = n0VarD.e();
            if (!z10 && (gVarE2 instanceof nm.s)) {
                pm.f fVar2 = new pm.f();
                zc.u uVarE = pm.c.e(null, (nm.s) gVarE2, listN0);
                j0.f48443b.getClass();
                j0 attributes = j0.f48444c;
                kotlin.jvm.internal.n.f(attributes, "attributes");
                pm.c0 c0VarH = fVar2.h(uVarE, attributes, false, 0, true);
                List list = iVar2.f45554s;
                ArrayList arrayListZ0 = xj.n.z0(aVar, c0VarH.getAnnotations());
                j0 j0VarF2 = f(list, arrayListZ0.isEmpty() ? al.i.f3645a : new al.k(arrayListZ0, 0), n0VarD, jVar);
                if (!y0.e(c0VarH) && !proto.f51414e) {
                    z12 = false;
                }
                computedType = c0VarH.i0(z12).m0(j0VarF2);
            } else if (vl.e.f52630a.c(proto.f51425q).booleanValue()) {
                z11 = proto.f51414e;
                size = n0VarD.getParameters().size() - listN0.size();
                if (size == 0) {
                    c0VarR = pm.f.r(listN0, j0VarF, n0VarD, z11);
                    gVarE = c0VarR.P().e();
                    if (gVarE != null) {
                        eVarS = a.a.s(gVarE);
                    } else {
                        eVarS = null;
                    }
                    if (eVarS == xk.e.f53888d || (q0Var = (q0) xj.n.x0(a.a.v(c0VarR))) == null || (yVarB = q0Var.b()) == null) {
                        c0VarR = null;
                    } else {
                        zk.g gVarE3 = yVarB.P().e();
                        yl.c cVarG = gVarE3 != null ? fm.e.g(gVarE3) : null;
                        if (yVarB.t().size() == 1 && (kotlin.jvm.internal.n.a(cVarG, wk.m.f53368f) || kotlin.jvm.internal.n.a(cVarG, c0.f45526a))) {
                            pm.y yVarB2 = ((q0) xj.n.F0(yVarB.t())).b();
                            kotlin.jvm.internal.n.e(yVarB2, "continuationArgumentType.arguments.single().type");
                            zk.b bVar = jVar instanceof zk.b ? (zk.b) jVar : null;
                            c0VarR = kotlin.jvm.internal.n.a(bVar != null ? fm.e.c(bVar) : null, x.f45598a) ? a(c0VarR, yVarB2) : a(c0VarR, yVarB2);
                        }
                    }
                } else if (size != 1 && (size2 = listN0.size() - 1) >= 0) {
                    n0 n0VarN = n0VarD.d().v(size2).n();
                    kotlin.jvm.internal.n.e(n0VarN, "functionTypeConstructor.…on(arity).typeConstructor");
                    c0VarR = pm.f.r(listN0, j0VarF, n0VarN, z11);
                } else {
                    c0VarR = null;
                }
                if (c0VarR == null) {
                    rm.i iVar7 = rm.i.f49698a;
                    computedType = rm.i.e(rm.h.INCONSISTENT_SUSPEND_FUNCTION, listN0, n0VarD, new String[0]);
                } else {
                    computedType = c0VarR;
                }
            } else {
                computedType = pm.f.r(listN0, j0VarF, n0VarD, proto.f51414e);
                if (vl.e.f52631b.c(proto.f51425q).booleanValue()) {
                    nVarP = pm.f.p(computedType, true);
                    if (nVarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + computedType + '\'').toString());
                    }
                    computedType = nVarP;
                }
            }
            i11 = proto.f51412c;
            if ((i11 & 1024) == 1024) {
                q0VarA = proto.f51423o;
            } else if ((i11 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
                q0VarA = iVar.a(proto.f51424p);
            } else {
                q0VarA = null;
            }
            if (q0VarA != null) {
                computedType = pm.c.A(computedType, d(q0VarA, false));
            }
            if (proto.s()) {
                com.bumptech.glide.c.r(fVar, proto.f51418i);
                iVar2.f45553r.getClass();
                kotlin.jvm.internal.n.f(computedType, "computedType");
            }
            return computedType;
        }
        gVarH = (zk.g) this.f45523e.invoke(Integer.valueOf(proto.f51418i));
        if (gVarH == null) {
            gVarH = h(this, proto, proto.f51418i);
        }
        n0VarD = gVarH.n();
        kotlin.jvm.internal.n.e(n0VarD, "classifier.typeConstructor");
        boolean z13 = true;
        if (rm.i.f(n0VarD.e())) {
            rm.i iVar8 = rm.i.f49698a;
            return rm.i.e(rm.h.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, xj.v.f53866a, n0VarD, (String[]) Arrays.copyOf(new String[]{n0VarD.toString()}, 1));
        }
        nm.a aVar2 = new nm.a(iVar2.f45537a, new t0(5, this, proto));
        j0VarF = f(iVar2.f45554s, aVar2, n0VarD, jVar);
        ArrayList arrayListE2 = e(proto, this);
        arrayList = new ArrayList(xj.p.W(arrayListE2, 10));
        it = arrayListE2.iterator();
        i10 = 0;
        while (it.hasNext()) {
            next2 = it.next();
            i12 = i10 + 1;
            if (i10 >= 0) {
                xj.o.V();
                throw null;
            }
            o0Var = (o0) next2;
            List parameters2 = n0VarD.getParameters();
            kotlin.jvm.internal.n.e(parameters2, "constructor.parameters");
            m0Var = (m0) xj.n.r0(i10, parameters2);
            n0Var = o0Var.f51380c;
            if (n0Var == tl.n0.STAR) {
                if (m0Var == null) {
                    r0Var = new g0(iVar2.f45538b.d());
                } else {
                    r0Var = new h0(m0Var);
                }
                it2 = it;
            } else {
                kotlin.jvm.internal.n.e(n0Var, "typeArgumentProto.projection");
                iOrdinal = n0Var.ordinal();
                if (iOrdinal != 0) {
                    it2 = it;
                    i13 = 3;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new aa.b((byte) 0, 20);
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + n0Var);
                        }
                        i13 = 1;
                    }
                } else {
                    it2 = it;
                    i13 = 2;
                }
                i14 = o0Var.f51379b;
                if ((i14 & 2) == 2) {
                    q0VarA2 = o0Var.f51381d;
                } else if ((i14 & 4) == 4) {
                    q0VarA2 = iVar.a(o0Var.f51382e);
                } else {
                    q0VarA2 = null;
                }
                if (q0VarA2 == null) {
                    r0Var = new r0(1, rm.i.c(rm.h.NO_RECORDED_TYPE, o0Var.toString()));
                } else {
                    r0Var = new r0(i13, g(q0VarA2));
                }
            }
            arrayList.add(r0Var);
            i10 = i12;
            it = it2;
        }
        listN0 = xj.n.N0(arrayList);
        zk.g gVarE4 = n0VarD.e();
        if (!z10) {
            if (vl.e.f52630a.c(proto.f51425q).booleanValue()) {
                z11 = proto.f51414e;
                size = n0VarD.getParameters().size() - listN0.size();
                if (size == 0) {
                    c0VarR = pm.f.r(listN0, j0VarF, n0VarD, z11);
                    gVarE = c0VarR.P().e();
                    if (gVarE != null) {
                        eVarS = a.a.s(gVarE);
                    } else {
                        eVarS = null;
                    }
                    if (eVarS == xk.e.f53888d) {
                        c0VarR = null;
                    } else {
                        c0VarR = null;
                    }
                } else if (size != 1) {
                    c0VarR = null;
                } else {
                    n0 n0VarN2 = n0VarD.d().v(size2).n();
                    kotlin.jvm.internal.n.e(n0VarN2, "functionTypeConstructor.…on(arity).typeConstructor");
                    c0VarR = pm.f.r(listN0, j0VarF, n0VarN2, z11);
                }
                if (c0VarR == null) {
                    rm.i iVar9 = rm.i.f49698a;
                    computedType = rm.i.e(rm.h.INCONSISTENT_SUSPEND_FUNCTION, listN0, n0VarD, new String[0]);
                } else {
                    computedType = c0VarR;
                }
            } else {
                computedType = pm.f.r(listN0, j0VarF, n0VarD, proto.f51414e);
                if (vl.e.f52631b.c(proto.f51425q).booleanValue()) {
                    nVarP = pm.f.p(computedType, true);
                    if (nVarP == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + computedType + '\'').toString());
                    }
                    computedType = nVarP;
                }
            }
        } else if (vl.e.f52630a.c(proto.f51425q).booleanValue()) {
            z11 = proto.f51414e;
            size = n0VarD.getParameters().size() - listN0.size();
            if (size == 0) {
                c0VarR = pm.f.r(listN0, j0VarF, n0VarD, z11);
                gVarE = c0VarR.P().e();
                if (gVarE != null) {
                    eVarS = a.a.s(gVarE);
                } else {
                    eVarS = null;
                }
                if (eVarS == xk.e.f53888d) {
                    c0VarR = null;
                } else {
                    c0VarR = null;
                }
            } else if (size != 1) {
                c0VarR = null;
            } else {
                n0 n0VarN3 = n0VarD.d().v(size2).n();
                kotlin.jvm.internal.n.e(n0VarN3, "functionTypeConstructor.…on(arity).typeConstructor");
                c0VarR = pm.f.r(listN0, j0VarF, n0VarN3, z11);
            }
            if (c0VarR == null) {
                rm.i iVar10 = rm.i.f49698a;
                computedType = rm.i.e(rm.h.INCONSISTENT_SUSPEND_FUNCTION, listN0, n0VarD, new String[0]);
            } else {
                computedType = c0VarR;
            }
        } else {
            computedType = pm.f.r(listN0, j0VarF, n0VarD, proto.f51414e);
            if (vl.e.f52631b.c(proto.f51425q).booleanValue()) {
                nVarP = pm.f.p(computedType, true);
                if (nVarP == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + computedType + '\'').toString());
                }
                computedType = nVarP;
            }
        }
        i11 = proto.f51412c;
        if ((i11 & 1024) == 1024) {
            q0VarA = proto.f51423o;
        } else if ((i11 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            q0VarA = iVar.a(proto.f51424p);
        } else {
            q0VarA = null;
        }
        if (q0VarA != null) {
            computedType = pm.c.A(computedType, d(q0VarA, false));
        }
        if (proto.s()) {
            com.bumptech.glide.c.r(fVar, proto.f51418i);
            iVar2.f45553r.getClass();
            kotlin.jvm.internal.n.f(computedType, "computedType");
        }
        return computedType;
    }

    public final pm.y g(tl.q0 proto) {
        tl.q0 q0VarA;
        kotlin.jvm.internal.n.f(proto, "proto");
        if ((proto.f51412c & 2) != 2) {
            return d(proto, true);
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.f45519a;
        String string = ((vl.f) dVar.f22982b).getString(proto.f51415f);
        pm.c0 c0VarD = d(proto, true);
        l3.i iVar = (l3.i) dVar.f22984d;
        int i10 = proto.f51412c;
        if ((i10 & 4) == 4) {
            q0VarA = proto.f51416g;
        } else {
            q0VarA = (i10 & 8) == 8 ? iVar.a(proto.f51417h) : null;
        }
        kotlin.jvm.internal.n.c(q0VarA);
        return ((i) dVar.f22981a).f45546j.c(proto, string, c0VarD, d(q0VarA, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45521c);
        b0 b0Var = this.f45520b;
        if (b0Var == null) {
            str = "";
        } else {
            str = ". Child of " + b0Var.f45521c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}

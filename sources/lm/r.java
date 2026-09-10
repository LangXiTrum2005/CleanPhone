package lm;

import androidx.core.app.NotificationCompat;
import cl.h0;
import cl.o0;
import cl.p0;
import cl.x0;
import ea.f2;
import java.util.ArrayList;
import java.util.List;
import tl.e1;
import tl.g0;
import tl.q0;
import tl.y0;
import zk.j0;
import zk.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f45583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f45584b;

    public r(com.google.android.gms.internal.consent_sdk.d dVar) {
        this.f45583a = dVar;
        i iVar = (i) dVar.f22981a;
        this.f45584b = new f2(iVar.f45538b, iVar.l);
    }

    public final u a(zk.j jVar) {
        if (jVar instanceof zk.b0) {
            yl.c cVar = ((h0) ((zk.b0) jVar)).f6518e;
            com.google.android.gms.internal.consent_sdk.d dVar = this.f45583a;
            return new t(cVar, (vl.f) dVar.f22982b, (l3.i) dVar.f22984d, (nm.i) dVar.f22987g);
        }
        if (jVar instanceof nm.h) {
            return ((nm.h) jVar).f46831v;
        }
        return null;
    }

    public final al.j b(zl.k kVar, int i10, int i11) {
        return !vl.e.f52632c.c(i10).booleanValue() ? al.i.f3645a : new nm.u(((i) this.f45583a.f22981a).f45537a, new n(this, kVar, i11, 0));
    }

    public final al.j c(g0 g0Var, boolean z10) {
        return !vl.e.f52632c.c(g0Var.f51240d).booleanValue() ? al.i.f3645a : new nm.u(((i) this.f45583a.f22981a).f45537a, new o(this, z10, g0Var));
    }

    public final nm.c d(tl.l lVar, boolean z10) {
        com.google.android.gms.internal.consent_sdk.d dVar = this.f45583a;
        zk.j jVar = (zk.j) dVar.f22983c;
        kotlin.jvm.internal.n.d(jVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        zk.e eVar = (zk.e) jVar;
        nm.c cVar = new nm.c(eVar, null, b(lVar, lVar.f51341d, 1), z10, 1, lVar, (vl.f) dVar.f22982b, (l3.i) dVar.f22984d, (vl.g) dVar.f22985e, (nm.i) dVar.f22987g, null);
        r rVar = (r) dVar.a(cVar, xj.v.f53866a, (vl.f) dVar.f22982b, (l3.i) dVar.f22984d, (vl.g) dVar.f22985e, (vl.a) dVar.f22986f).f22989i;
        List list = lVar.f51342e;
        kotlin.jvm.internal.n.e(list, "proto.valueParameterList");
        cVar.X0(rVar.g(list, lVar, 1), com.bumptech.glide.d.t((e1) vl.e.f52633d.c(lVar.f51341d)));
        cVar.T0(eVar.g());
        cVar.f6649r = eVar.f0();
        cVar.f6653v = !vl.e.f52642n.c(lVar.f51341d).booleanValue();
        return cVar;
    }

    public final nm.r e(tl.y proto) {
        int i10;
        pm.y yVarG;
        com.google.android.gms.internal.consent_sdk.d dVar = this.f45583a;
        vl.f fVar = (vl.f) dVar.f22982b;
        l3.i iVar = (l3.i) dVar.f22984d;
        kotlin.jvm.internal.n.f(proto, "proto");
        int i11 = 1;
        if ((proto.f51551c & 1) == 1) {
            i10 = proto.f51552d;
        } else {
            int i12 = proto.f51553e;
            i10 = ((i12 >> 8) << 6) + (i12 & 63);
        }
        int i13 = i10;
        al.j jVarB = b(proto, i13, 1);
        int i14 = proto.f51551c;
        int i15 = i14 & 32;
        al.h hVar = al.i.f3645a;
        al.j aVar = (i15 == 32 || (i14 & 64) == 64) ? new nm.a(((i) dVar.f22981a).f45537a, new n(this, proto, i11, 1)) : hVar;
        nm.r rVar = new nm.r((zk.j) dVar.f22983c, null, jVarB, com.bumptech.glide.c.s(fVar, proto.f51554f), com.bumptech.glide.d.D((tl.z) vl.e.f52643o.c(i13)), proto, (vl.f) dVar.f22982b, iVar, fm.e.g((zk.j) dVar.f22983c).c(com.bumptech.glide.c.s(fVar, proto.f51554f)).equals(x.f45598a) ? vl.g.f52655b : (vl.g) dVar.f22985e, (nm.i) dVar.f22987g, null);
        List list = proto.f51557i;
        kotlin.jvm.internal.n.e(list, "proto.typeParameterList");
        com.google.android.gms.internal.consent_sdk.d dVarA = dVar.a(rVar, list, (vl.f) dVar.f22982b, (l3.i) dVar.f22984d, (vl.g) dVar.f22985e, (vl.a) dVar.f22986f);
        b0 b0Var = (b0) dVarA.f22988h;
        q0 q0VarU = com.google.android.gms.internal.auth.o.u(proto, iVar);
        cl.z zVarK = (q0VarU == null || (yVarG = b0Var.g(q0VarU)) == null) ? null : bm.m.k(rVar, yVarG, aVar);
        zk.j jVar = (zk.j) dVar.f22983c;
        zk.e eVar = jVar instanceof zk.e ? (zk.e) jVar : null;
        cl.z zVarY0 = eVar != null ? eVar.y0() : null;
        List list2 = proto.l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List contextReceiverTypeIdList = proto.f51560m;
            kotlin.jvm.internal.n.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list3 = contextReceiverTypeIdList;
            ArrayList arrayList = new ArrayList(xj.p.W(list3, 10));
            for (Integer it : list3) {
                kotlin.jvm.internal.n.e(it, "it");
                arrayList.add(iVar.a(it.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                xj.o.V();
                throw null;
            }
            cl.z zVarE = bm.m.e(rVar, b0Var.g((q0) obj), null, hVar, i16);
            if (zVarE != null) {
                arrayList2.add(zVarE);
            }
            i16 = i17;
        }
        List listB = b0Var.b();
        r rVar2 = (r) dVarA.f22989i;
        List list4 = proto.f51562o;
        kotlin.jvm.internal.n.e(list4, "proto.valueParameterList");
        rVar.X0(zVarK, zVarY0, arrayList2, listB, rVar2.g(list4, proto, 1), b0Var.g(com.google.android.gms.internal.auth.o.v(proto, iVar)), j.d((tl.a0) vl.e.f52634e.c(i13)), com.bumptech.glide.d.t((e1) vl.e.f52633d.c(i13)), xj.w.f53867a);
        rVar.f6644m = vl.e.f52644p.c(i13).booleanValue();
        rVar.f6645n = vl.e.f52645q.c(i13).booleanValue();
        rVar.f6646o = vl.e.f52648t.c(i13).booleanValue();
        rVar.f6647p = vl.e.f52646r.c(i13).booleanValue();
        rVar.f6648q = vl.e.f52647s.c(i13).booleanValue();
        rVar.f6652u = vl.e.f52649u.c(i13).booleanValue();
        rVar.f6649r = vl.e.f52650v.c(i13).booleanValue();
        rVar.f6653v = !vl.e.f52651w.c(i13).booleanValue();
        ((i) dVar.f22981a).f45548m.getClass();
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [cl.p0] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r3v26, types: [om.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cl.n0, cl.q, nm.q, zk.b, zk.h0] */
    public final nm.q f(g0 proto) throws Throwable {
        int i10;
        al.j aVar;
        vl.b bVar;
        vl.b bVar2;
        Throwable th2;
        r rVar;
        ?? G;
        o0 o0VarF;
        pm.y yVarG;
        com.google.android.gms.internal.consent_sdk.d dVar = this.f45583a;
        l3.i iVar = (l3.i) dVar.f22984d;
        kotlin.jvm.internal.n.f(proto, "proto");
        if ((proto.f51239c & 1) == 1) {
            i10 = proto.f51240d;
        } else {
            int i11 = proto.f51241e;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        com.google.android.gms.internal.consent_sdk.d dVar2 = dVar;
        ?? qVar = new nm.q((zk.j) dVar.f22983c, null, b(proto, i10, 2), j.d((tl.a0) vl.e.f52634e.c(i10)), com.bumptech.glide.d.t((e1) vl.e.f52633d.c(i10)), vl.e.f52652x.c(i10).booleanValue(), com.bumptech.glide.c.s((vl.f) dVar.f22982b, proto.f51242f), com.bumptech.glide.d.D((tl.z) vl.e.f52643o.c(i10)), vl.e.B.c(i10).booleanValue(), vl.e.A.c(i10).booleanValue(), vl.e.D.c(i10).booleanValue(), vl.e.E.c(i10).booleanValue(), vl.e.F.c(i10).booleanValue(), proto, (vl.f) dVar.f22982b, iVar, (vl.g) dVar.f22985e, (nm.i) dVar.f22987g);
        List list = proto.f51245i;
        kotlin.jvm.internal.n.e(list, "proto.typeParameterList");
        com.google.android.gms.internal.consent_sdk.d dVarA = dVar2.a(qVar, list, (vl.f) dVar2.f22982b, (l3.i) dVar2.f22984d, (vl.g) dVar2.f22985e, (vl.a) dVar2.f22986f);
        b0 b0Var = (b0) dVarA.f22988h;
        int i12 = i10;
        boolean zBooleanValue = vl.e.f52653y.c(i12).booleanValue();
        al.h hVar = al.i.f3645a;
        int i13 = 3;
        if (zBooleanValue) {
            int i14 = proto.f51239c;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                aVar = new nm.a(((i) dVar2.f22981a).f45537a, new n(this, proto, i13, 1));
            } else {
                aVar = hVar;
            }
        } else {
            aVar = hVar;
        }
        pm.y yVarG2 = b0Var.g(com.google.android.gms.internal.auth.o.w(proto, iVar));
        List listB = b0Var.b();
        zk.j jVar = (zk.j) dVar2.f22983c;
        zk.e eVar = jVar instanceof zk.e ? (zk.e) jVar : null;
        cl.z zVarY0 = eVar != null ? eVar.y0() : null;
        int i15 = proto.f51239c;
        q0 q0VarA = (i15 & 32) == 32 ? proto.f51246j : (i15 & 64) == 64 ? iVar.a(proto.f51247k) : null;
        cl.z zVarK = (q0VarA == null || (yVarG = b0Var.g(q0VarA)) == null) ? null : bm.m.k(qVar, yVarG, aVar);
        List list2 = proto.l;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List contextReceiverTypeIdList = proto.f51248m;
            kotlin.jvm.internal.n.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list3 = contextReceiverTypeIdList;
            ArrayList arrayList = new ArrayList(xj.p.W(list3, 10));
            for (Integer it : list3) {
                kotlin.jvm.internal.n.e(it, "it");
                arrayList.add(iVar.a(it.intValue()));
            }
            list2 = arrayList;
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list4, 10));
        int i16 = 0;
        for (Object obj : list4) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                xj.o.V();
                throw null;
            }
            arrayList2.add(bm.m.e(qVar, b0Var.g((q0) obj), null, hVar, i16));
            i16 = i17;
        }
        o0 o0Var = null;
        qVar.Q0(yVarG2, listB, zVarY0, zVarK, arrayList2);
        vl.b bVar3 = vl.e.f52632c;
        boolean zBooleanValue2 = bVar3.c(i12).booleanValue();
        vl.c cVar = vl.e.f52633d;
        e1 e1Var = (e1) cVar.c(i12);
        vl.c cVar2 = vl.e.f52634e;
        tl.a0 a0Var = (tl.a0) cVar2.c(i12);
        if (e1Var == null) {
            vl.e.a(10);
            throw null;
        }
        if (a0Var == null) {
            vl.e.a(11);
            throw null;
        }
        int number = (zBooleanValue2 ? 1 << bVar3.f52628a : 0) | (a0Var.getNumber() << cVar2.f52628a) | (e1Var.getNumber() << cVar.f52628a);
        vl.b bVar4 = vl.e.J;
        bVar4.getClass();
        vl.b bVar5 = vl.e.K;
        bVar5.getClass();
        vl.b bVar6 = vl.e.L;
        bVar6.getClass();
        k0 k0Var = j0.C9;
        if (zBooleanValue) {
            int i18 = (proto.f51239c & NotificationCompat.FLAG_LOCAL_ONLY) == 256 ? proto.f51251p : number;
            boolean zBooleanValue3 = bVar4.c(i18).booleanValue();
            boolean zBooleanValue4 = bVar5.c(i18).booleanValue();
            boolean zBooleanValue5 = bVar6.c(i18).booleanValue();
            al.j jVarB = b(proto, i18, 3);
            if (zBooleanValue3) {
                bVar = bVar4;
                bVar2 = bVar6;
                th2 = null;
                o0VarF = new o0(qVar, jVarB, j.d((tl.a0) cVar2.c(i18)), com.bumptech.glide.d.t((e1) cVar.c(i18)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, qVar.getKind(), null, k0Var);
            } else {
                bVar = bVar4;
                bVar2 = bVar6;
                th2 = null;
                o0VarF = bm.m.f(qVar, jVarB);
            }
            o0Var = o0VarF;
            o0Var.M0(qVar.getReturnType());
        } else {
            dVar2 = dVar2;
            dVarA = dVarA;
            number = number;
            bVar = bVar4;
            cVar = cVar;
            bVar5 = bVar5;
            cVar2 = cVar2;
            bVar2 = bVar6;
            i12 = i12;
            th2 = null;
        }
        if (vl.e.f52654z.c(i12).booleanValue()) {
            int i19 = (proto.f51239c & 512) == 512 ? proto.f51252q : number;
            boolean zBooleanValue6 = bVar.c(i19).booleanValue();
            boolean zBooleanValue7 = bVar5.c(i19).booleanValue();
            boolean zBooleanValue8 = bVar2.c(i19).booleanValue();
            rVar = this;
            al.j jVarB2 = rVar.b(proto, i19, 4);
            if (zBooleanValue6) {
                p0 p0Var = new p0(qVar, jVarB2, j.d((tl.a0) cVar2.c(i19)), com.bumptech.glide.d.t((e1) cVar.c(i19)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, qVar.getKind(), null, k0Var);
                com.google.android.gms.internal.consent_sdk.d dVar3 = dVarA;
                x0 x0Var = (x0) xj.n.F0(((r) dVar3.a(p0Var, xj.v.f53866a, (vl.f) dVar3.f22982b, (l3.i) dVar3.f22984d, (vl.g) dVar3.f22985e, (vl.a) dVar3.f22986f).f22989i).g(j1.f.C(proto.f51250o), proto, 4));
                if (x0Var == null) {
                    p0.z0(6);
                    throw th2;
                }
                p0Var.f6585m = x0Var;
                G = p0Var;
            } else {
                G = bm.m.g(qVar, jVarB2);
            }
        } else {
            rVar = this;
            G = th2;
        }
        if (vl.e.C.c(i12).booleanValue()) {
            qVar.O0(th2, new p(rVar, proto, qVar, 1));
        }
        zk.j jVar2 = (zk.j) dVar2.f22983c;
        zk.e eVar2 = jVar2 instanceof zk.e ? (zk.e) jVar2 : null;
        if ((eVar2 != null ? eVar2.l0() : 0) == 5) {
            qVar.O0(null, new p(rVar, proto, qVar, 3));
        }
        qVar.N0(o0Var, G, new cl.w(rVar.c(proto, false)), new cl.w(rVar.c(proto, true)));
        return qVar;
    }

    public final List g(List list, zl.k kVar, int i10) {
        int i11;
        al.j uVar;
        r rVar = this;
        com.google.android.gms.internal.consent_sdk.d dVar = rVar.f45583a;
        l3.i iVar = (l3.i) dVar.f22984d;
        b0 b0Var = (b0) dVar.f22988h;
        zk.j jVar = (zk.j) dVar.f22983c;
        kotlin.jvm.internal.n.d(jVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        zk.b bVar = (zk.b) jVar;
        zk.j jVarE = bVar.e();
        kotlin.jvm.internal.n.e(jVarE, "callableDescriptor.containingDeclaration");
        u uVarA = rVar.a(jVarE);
        List list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            pm.y yVarG = null;
            if (i12 < 0) {
                xj.o.V();
                throw null;
            }
            y0 y0Var = (y0) obj;
            int i14 = (y0Var.f51570c & 1) == 1 ? y0Var.f51571d : 0;
            if (uVarA == null || !vl.e.f52632c.c(i14).booleanValue()) {
                i11 = i12;
                uVar = al.i.f3645a;
            } else {
                i11 = i12;
                uVar = new nm.u(((i) dVar.f22981a).f45537a, new q(rVar, uVarA, kVar, i10, i11, y0Var));
            }
            yl.f fVarS = com.bumptech.glide.c.s((vl.f) dVar.f22982b, y0Var.f51572e);
            pm.y yVarG2 = b0Var.g(com.google.android.gms.internal.auth.o.A(y0Var, iVar));
            boolean zBooleanValue = vl.e.G.c(i14).booleanValue();
            boolean zBooleanValue2 = vl.e.H.c(i14).booleanValue();
            boolean zBooleanValue3 = vl.e.I.c(i14).booleanValue();
            int i15 = y0Var.f51570c;
            q0 q0VarA = (i15 & 16) == 16 ? y0Var.f51575h : (i15 & 32) == 32 ? iVar.a(y0Var.f51576i) : null;
            if (q0VarA != null) {
                yVarG = b0Var.g(q0VarA);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new x0(bVar, null, i11, uVar, fVarS, yVarG2, zBooleanValue, zBooleanValue2, zBooleanValue3, yVarG, j0.C9));
            arrayList = arrayList2;
            i12 = i13;
            rVar = this;
        }
        return xj.n.N0(arrayList);
    }
}

package nm;

import ea.f2;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import lm.b0;
import pm.c0;
import tl.e1;
import tl.g0;
import tl.q0;
import tl.s0;
import tl.y;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f46837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i10) {
        super(1);
        this.f46836e = i10;
        this.f46837f = mVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        q0 underlyingType;
        q0 expandedType;
        switch (this.f46836e) {
            case 0:
                yl.f it = (yl.f) obj;
                kotlin.jvm.internal.n.f(it, "it");
                m mVar = this.f46837f;
                LinkedHashMap linkedHashMap = mVar.f46839a;
                tl.a PARSER = y.f51549v;
                kotlin.jvm.internal.n.e(PARSER, "PARSER");
                o oVar = mVar.f46847i;
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                Collection<y> collectionW = bArr != null ? zm.l.W(zm.l.S(new androidx.fragment.app.o(PARSER, new ByteArrayInputStream(bArr), oVar, 3))) : v.f53866a;
                ArrayList arrayList = new ArrayList(collectionW.size());
                for (y it2 : collectionW) {
                    lm.r rVar = (lm.r) oVar.f46851b.f22989i;
                    kotlin.jvm.internal.n.e(it2, "it");
                    r rVarE = rVar.e(it2);
                    if (!oVar.r(rVarE)) {
                        rVarE = null;
                    }
                    if (rVarE != null) {
                        arrayList.add(rVarE);
                    }
                }
                oVar.j(arrayList, it);
                return ym.l.d(arrayList);
            case 1:
                yl.f it3 = (yl.f) obj;
                kotlin.jvm.internal.n.f(it3, "it");
                m mVar2 = this.f46837f;
                LinkedHashMap linkedHashMap2 = mVar2.f46840b;
                tl.a PARSER2 = g0.f51237v;
                kotlin.jvm.internal.n.e(PARSER2, "PARSER");
                o oVar2 = mVar2.f46847i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it3);
                Collection<g0> collectionW2 = bArr2 != null ? zm.l.W(zm.l.S(new androidx.fragment.app.o(PARSER2, new ByteArrayInputStream(bArr2), oVar2, 3))) : v.f53866a;
                ArrayList arrayList2 = new ArrayList(collectionW2.size());
                for (g0 it4 : collectionW2) {
                    lm.r rVar2 = (lm.r) oVar2.f46851b.f22989i;
                    kotlin.jvm.internal.n.e(it4, "it");
                    arrayList2.add(rVar2.f(it4));
                }
                oVar2.k(arrayList2, it3);
                return ym.l.d(arrayList2);
            default:
                yl.f it5 = (yl.f) obj;
                kotlin.jvm.internal.n.f(it5, "it");
                m mVar3 = this.f46837f;
                com.google.android.gms.internal.consent_sdk.d dVar = mVar3.f46847i.f46851b;
                byte[] bArr3 = (byte[]) mVar3.f46841c.get(it5);
                if (bArr3 != null) {
                    s0 s0Var = (s0) s0.f51450p.b(new ByteArrayInputStream(bArr3), ((lm.i) dVar.f22981a).f45551p);
                    if (s0Var != null) {
                        lm.r rVar3 = (lm.r) dVar.f22989i;
                        com.google.android.gms.internal.consent_sdk.d dVar2 = rVar3.f45583a;
                        vl.f fVar = (vl.f) dVar2.f22982b;
                        l3.i iVar = (l3.i) dVar2.f22984d;
                        List list = s0Var.f51460k;
                        kotlin.jvm.internal.n.e(list, "proto.annotationList");
                        List<tl.g> list2 = list;
                        ArrayList arrayList3 = new ArrayList(xj.p.W(list2, 10));
                        for (tl.g it6 : list2) {
                            f2 f2Var = rVar3.f45584b;
                            kotlin.jvm.internal.n.e(it6, "it");
                            arrayList3.add(f2Var.d(it6, fVar));
                        }
                        s sVar = new s(((lm.i) dVar2.f22981a).f45537a, (zk.j) dVar2.f22983c, arrayList3.isEmpty() ? al.i.f3645a : new al.k(arrayList3, 0), com.bumptech.glide.c.s(fVar, s0Var.f51454e), com.bumptech.glide.d.t((e1) vl.e.f52633d.c(s0Var.f51453d)), s0Var, (vl.f) dVar2.f22982b, iVar, (vl.g) dVar2.f22985e, (i) dVar2.f22987g);
                        List list3 = s0Var.f51455f;
                        kotlin.jvm.internal.n.e(list3, "proto.typeParameterList");
                        b0 b0Var = (b0) dVar2.a(sVar, list3, (vl.f) dVar2.f22982b, (l3.i) dVar2.f22984d, (vl.g) dVar2.f22985e, (vl.a) dVar2.f22986f).f22988h;
                        List listB = b0Var.b();
                        int i10 = s0Var.f51452c;
                        if ((i10 & 4) == 4) {
                            underlyingType = s0Var.f51456g;
                            kotlin.jvm.internal.n.e(underlyingType, "underlyingType");
                        } else {
                            if ((i10 & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            underlyingType = iVar.a(s0Var.f51457h);
                        }
                        c0 c0VarD = b0Var.d(underlyingType, false);
                        int i11 = s0Var.f51452c;
                        if ((i11 & 16) == 16) {
                            expandedType = s0Var.f51458i;
                            kotlin.jvm.internal.n.e(expandedType, "expandedType");
                        } else {
                            if ((i11 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            expandedType = iVar.a(s0Var.f51459j);
                        }
                        sVar.M0(listB, c0VarD, b0Var.d(expandedType, false));
                        return sVar;
                    }
                }
                return null;
        }
    }
}

package nm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lm.b0;
import tl.q0;
import tl.u0;
import tl.v0;
import zk.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends cl.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f46871k;
    public final v0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f46872m;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(com.google.android.gms.internal.consent_sdk.d dVar, v0 v0Var, int i10) {
        int i11;
        lm.i iVar = (lm.i) dVar.f22981a;
        om.l lVar = iVar.f45537a;
        zk.j jVar = (zk.j) dVar.f22983c;
        yl.f fVarS = com.bumptech.glide.c.s((vl.f) dVar.f22982b, v0Var.f51500e);
        u0 u0Var = v0Var.f51502g;
        kotlin.jvm.internal.n.e(u0Var, "proto.variance");
        int iOrdinal = u0Var.ordinal();
        int i12 = 2;
        if (iOrdinal != 0) {
            i11 = 1;
            if (iOrdinal == 1) {
                i12 = 3;
                i11 = i12;
            } else if (iOrdinal != 2) {
                throw new aa.b((byte) 0, 20);
            }
        } else {
            i11 = i12;
        }
        super(lVar, jVar, al.i.f3645a, fVarS, i11, v0Var.f51501f, i10, k0.f54972c);
        this.f46871k = dVar;
        this.l = v0Var;
        this.f46872m = new a(iVar.f45537a, new al.l(this, 17));
    }

    @Override // cl.k
    public final List K0() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.f46871k;
        l3.i iVar = (l3.i) dVar.f22984d;
        v0 v0Var = this.l;
        kotlin.jvm.internal.n.f(v0Var, "<this>");
        List list = v0Var.f51503h;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List upperBoundIdList = v0Var.f51504i;
            kotlin.jvm.internal.n.e(upperBoundIdList, "upperBoundIdList");
            List<Integer> list2 = upperBoundIdList;
            ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
            for (Integer it : list2) {
                kotlin.jvm.internal.n.e(it, "it");
                arrayList.add(iVar.a(it.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return j1.f.C(fm.e.e(this).m());
        }
        List list3 = list;
        b0 b0Var = (b0) dVar.f22988h;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b0Var.g((q0) it2.next()));
        }
        return arrayList2;
    }

    @Override // al.b, al.a
    public final al.j getAnnotations() {
        return this.f46872m;
    }
}

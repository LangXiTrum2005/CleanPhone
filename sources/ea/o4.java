package ea;

import com.google.android.gms.internal.measurement.fa;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.s9;
import com.google.android.gms.internal.measurement.t9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga f39671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f39672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f39673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x.e f39674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.e f39675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f39676h;

    public o4(c cVar, String str, ga gaVar, BitSet bitSet, BitSet bitSet2, x.e eVar, x.e eVar2) {
        this.f39676h = cVar;
        this.f39669a = str;
        this.f39672d = bitSet;
        this.f39673e = bitSet2;
        this.f39674f = eVar;
        this.f39675g = new x.e(0);
        for (Integer num : (x.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f39675g.put(num, arrayList);
        }
        this.f39670b = false;
        this.f39671c = gaVar;
    }

    public final void a(b bVar) {
        int iV;
        boolean z10;
        boolean zA;
        switch (bVar.f39237g) {
            case 0:
                iV = ((j8) bVar.f39239i).v();
                break;
            default:
                iV = ((p8) bVar.f39239i).v();
                break;
        }
        if (bVar.f39233c != null) {
            this.f39673e.set(iV, true);
        }
        Boolean bool = bVar.f39234d;
        if (bool != null) {
            this.f39672d.set(iV, bool.booleanValue());
        }
        if (bVar.f39235e != null) {
            Integer numValueOf = Integer.valueOf(iV);
            x.e eVar = this.f39674f;
            Long l = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f39235e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f39236f != null) {
            Integer numValueOf2 = Integer.valueOf(iV);
            x.e eVar2 = this.f39675g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.f39237g) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.c4.a();
            m1 m1Var = (m1) this.f39676h.f3623a;
            g gVar = m1Var.f39585d;
            c0 c0Var = d0.F0;
            String str = this.f39669a;
            if (gVar.R0(str, c0Var)) {
                switch (bVar.f39237g) {
                    case 0:
                        zA = ((j8) bVar.f39239i).A();
                        break;
                    default:
                        zA = false;
                        break;
                }
                if (zA) {
                    arrayList.clear();
                }
            }
            com.google.android.gms.internal.measurement.c4.a();
            if (!m1Var.f39585d.R0(str, c0Var)) {
                arrayList.add(Long.valueOf(bVar.f39236f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f39236f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final n9 b(int i10) {
        ArrayList arrayList;
        List list;
        m9 m9VarB = n9.B();
        m9VarB.b();
        ((n9) m9VarB.f23489b).C(i10);
        m9VarB.b();
        ((n9) m9VarB.f23489b).F(this.f39670b);
        ga gaVar = this.f39671c;
        if (gaVar != null) {
            m9VarB.b();
            ((n9) m9VarB.f23489b).E(gaVar);
        }
        fa faVarC = ga.C();
        ArrayList arrayListM1 = h4.m1(this.f39672d);
        faVarC.b();
        ((ga) faVarC.f23489b).G(arrayListM1);
        ArrayList arrayListM2 = h4.m1(this.f39673e);
        faVarC.b();
        ((ga) faVarC.f23489b).E(arrayListM2);
        x.e eVar = this.f39674f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f53506c);
            for (Integer num : (x.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) eVar.get(num);
                if (l != null) {
                    s9 s9VarY = t9.y();
                    s9VarY.b();
                    ((t9) s9VarY.f23489b).z(iIntValue);
                    long jLongValue = l.longValue();
                    s9VarY.b();
                    ((t9) s9VarY.f23489b).A(jLongValue);
                    arrayList2.add((t9) s9VarY.f());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            faVarC.b();
            ((ga) faVarC.f23489b).I(arrayList);
        }
        x.e eVar2 = this.f39675g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f53506c);
            for (Integer num2 : (x.b) eVar2.keySet()) {
                ha haVarZ = ia.z();
                int iIntValue2 = num2.intValue();
                haVarZ.b();
                ((ia) haVarZ.f23489b).A(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    haVarZ.b();
                    ((ia) haVarZ.f23489b).B(list2);
                }
                arrayList3.add((ia) haVarZ.f());
            }
            list = arrayList3;
        }
        faVarC.b();
        ((ga) faVarC.f23489b).K(list);
        m9VarB.b();
        ((n9) m9VarB.f23489b).D((ga) faVarC.f());
        return (n9) m9VarB.f();
    }

    public o4(c cVar, String str) {
        this.f39676h = cVar;
        this.f39669a = str;
        this.f39670b = true;
        this.f39672d = new BitSet();
        this.f39673e = new BitSet();
        this.f39674f = new x.e(0);
        this.f39675g = new x.e(0);
    }
}

package nl;

import am.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import pm.a1;
import pm.c0;
import pm.j0;
import pm.q0;
import pm.r;
import pm.y;
import qk.i0;
import xj.p;
import zk.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c0 lowerBound, c0 upperBound) {
        super(lowerBound, upperBound);
        n.f(lowerBound, "lowerBound");
        n.f(upperBound, "upperBound");
        qm.d.f49173a.b(lowerBound, upperBound);
    }

    public static final ArrayList B0(h hVar, y yVar) throws IOException {
        List<q0> listT = yVar.t();
        ArrayList arrayList = new ArrayList(p.W(listT, 10));
        for (q0 typeProjection : listT) {
            n.f(typeProjection, "typeProjection");
            StringBuilder sb2 = new StringBuilder();
            xj.n.t0(j1.f.C(typeProjection), sb2, ", ", null, null, new am.f(hVar, 0), 60);
            String string = sb2.toString();
            n.e(string, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final String C0(String str, String str2) {
        if (!an.h.r0(str, '<')) {
            return str;
        }
        return an.h.P0(str, '<') + '<' + str2 + '>' + an.h.N0('>', str, str);
    }

    @Override // pm.r, pm.y
    public final im.n A() {
        g gVarE = P().e();
        zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
        if (eVar != null) {
            im.n nVarE = eVar.E(new d());
            n.e(nVarE, "classDescriptor.getMemberScope(RawSubstitution())");
            return nVarE;
        }
        throw new IllegalStateException(("Incorrect classifier: " + P().e()).toString());
    }

    @Override // pm.r
    public final String A0(h hVar, h hVar2) throws IOException {
        c0 c0Var = this.f48470b;
        String strY = hVar.Y(c0Var);
        c0 c0Var2 = this.f48471c;
        String strY2 = hVar.Y(c0Var2);
        if (hVar2.f3709a.n()) {
            return "raw (" + strY + ".." + strY2 + ')';
        }
        if (c0Var2.t().isEmpty()) {
            return hVar.F(strY, strY2, i0.H(this));
        }
        ArrayList arrayListB0 = B0(hVar, c0Var);
        ArrayList arrayListB1 = B0(hVar, c0Var2);
        String strU0 = xj.n.u0(arrayListB0, ", ", null, null, e.f46802e, 30);
        ArrayList arrayListU0 = xj.n.U0(arrayListB0, arrayListB1);
        if (!arrayListU0.isEmpty()) {
            Iterator it = arrayListU0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strY2 = C0(strY2, strU0);
                    break;
                }
                wj.f fVar = (wj.f) it.next();
                String str = (String) fVar.f53283a;
                String str2 = (String) fVar.f53284b;
                if (!n.a(str, an.h.E0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strY2 = C0(strY2, strU0);
            break;
        }
        String strC0 = C0(strY, strU0);
        return n.a(strC0, strY2) ? strC0 : hVar.F(strC0, strY2, i0.H(this));
    }

    @Override // pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48470b;
        n.f(type, "type");
        c0 type2 = this.f48471c;
        n.f(type2, "type");
        return new f(type, type2);
    }

    @Override // pm.a1
    public final a1 i0(boolean z10) {
        return new f(this.f48470b.i0(z10), this.f48471c.i0(z10));
    }

    @Override // pm.a1
    public final a1 j0(qm.f kotlinTypeRefiner) {
        n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        c0 type = this.f48470b;
        n.f(type, "type");
        c0 type2 = this.f48471c;
        n.f(type2, "type");
        return new f(type, type2);
    }

    @Override // pm.a1
    public final a1 m0(j0 newAttributes) {
        n.f(newAttributes, "newAttributes");
        return new f(this.f48470b.m0(newAttributes), this.f48471c.m0(newAttributes));
    }

    @Override // pm.r
    public final c0 z0() {
        return this.f48470b;
    }
}

package xk;

import al.i;
import cl.q0;
import cl.x;
import cl.x0;
import cl.y;
import d5.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import pm.w0;
import vm.r;
import xj.p;
import zk.j;
import zk.j0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends q0 {
    public g(j jVar, g gVar, int i10, boolean z10) {
        super(jVar, gVar, i.f3645a, r.f52698g, i10, j0.C9);
        this.f6644m = true;
        this.f6652u = z10;
        this.f6653v = false;
    }

    @Override // cl.q0, cl.y
    public final y L0(int i10, al.j annotations, yl.f fVar, j newOwner, s sVar, j0 j0Var) {
        n.f(newOwner, "newOwner");
        u.n(i10, "kind");
        n.f(annotations, "annotations");
        return new g(newOwner, (g) sVar, i10, this.f6652u);
    }

    @Override // cl.y
    public final y M0(x xVar) {
        yl.f fVar;
        g gVar = (g) super.M0(xVar);
        if (gVar == null) {
            return null;
        }
        List listB = gVar.B();
        n.e(listB, "substituted.valueParameters");
        List list = listB;
        if ((list instanceof Collection) && list.isEmpty()) {
            return gVar;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pm.y type = ((x0) it.next()).getType();
            n.e(type, "it.type");
            if (a.a.o(type) != null) {
                List listB2 = gVar.B();
                n.e(listB2, "substituted.valueParameters");
                List list2 = listB2;
                ArrayList arrayList = new ArrayList(p.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    pm.y type2 = ((x0) it2.next()).getType();
                    n.e(type2, "it.type");
                    arrayList.add(a.a.o(type2));
                }
                int size = gVar.B().size() - arrayList.size();
                boolean z10 = true;
                if (size == 0) {
                    List valueParameters = gVar.B();
                    n.e(valueParameters, "valueParameters");
                    ArrayList<wj.f> arrayListU0 = xj.n.U0(arrayList, valueParameters);
                    if (arrayListU0.isEmpty()) {
                        return gVar;
                    }
                    for (wj.f fVar2 : arrayListU0) {
                        if (!n.a((yl.f) fVar2.f53283a, ((x0) fVar2.f53284b).getName())) {
                        }
                    }
                    return gVar;
                }
                List valueParameters2 = gVar.B();
                n.e(valueParameters2, "valueParameters");
                List<x0> list3 = valueParameters2;
                ArrayList arrayList2 = new ArrayList(p.W(list3, 10));
                for (x0 x0Var : list3) {
                    yl.f name = x0Var.getName();
                    n.e(name, "it.name");
                    int i10 = x0Var.f6631f;
                    int i11 = i10 - size;
                    if (i11 >= 0 && (fVar = (yl.f) arrayList.get(i11)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(x0Var.J0(gVar, name, i10));
                }
                x xVarP0 = gVar.P0(w0.f48482b);
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((yl.f) it3.next()) == null) {
                        }
                    }
                    z10 = false;
                }
                xVarP0.f6628v = Boolean.valueOf(z10);
                xVarP0.f6614g = arrayList2;
                xVarP0.f6612e = gVar.a();
                y yVarM0 = super.M0(xVarP0);
                n.c(yVarM0);
                return yVarM0;
            }
        }
        return gVar;
    }

    @Override // cl.y, zk.v
    public final boolean isExternal() {
        return false;
    }

    @Override // cl.y, zk.s
    public final boolean isInline() {
        return false;
    }

    @Override // cl.y, zk.s
    public final boolean x() {
        return false;
    }
}

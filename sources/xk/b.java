package xk;

import cl.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.n;
import pm.j0;
import pm.r0;
import wk.m;
import xj.o;
import xj.p;
import xj.v;
import zk.k0;
import zk.m0;
import zk.u;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends pm.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f53876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f53878e);
        this.f53876c = cVar;
    }

    @Override // pm.h
    public final Collection b() {
        List listC;
        Iterable iterableC;
        c cVar = this.f53876c;
        int i10 = cVar.f53881h;
        int iOrdinal = cVar.f53880g.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listC = j1.f.C(c.l);
        } else if (iOrdinal == 2) {
            listC = o.Q(c.f53877m, new yl.b(m.f53373k, e.f53888d.a(i10)));
        } else {
            if (iOrdinal != 3) {
                throw new aa.b((byte) 0, 20);
            }
            listC = o.Q(c.f53877m, new yl.b(m.f53367e, e.f53889e.a(i10)));
        }
        w wVarE = ((h0) cVar.f53879f).e();
        List<yl.b> list = listC;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        for (yl.b bVar : list) {
            zk.e eVarD = u.d(wVarE, bVar);
            if (eVarD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List list2 = cVar.f53884k;
            int size = eVarD.n().getParameters().size();
            n.f(list2, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(defpackage.e.h(size, "Requested element count ", " is less than zero.").toString());
            }
            if (size == 0) {
                iterableC = v.f53866a;
            } else {
                int size2 = list2.size();
                if (size >= size2) {
                    iterableC = xj.n.N0(list2);
                } else if (size == 1) {
                    iterableC = j1.f.C(xj.n.w0(list2));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list2 instanceof RandomAccess) {
                        for (int i11 = size2 - size; i11 < size2; i11++) {
                            arrayList2.add(list2.get(i11));
                        }
                    } else {
                        ListIterator listIterator = list2.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableC = arrayList2;
                }
            }
            Iterable iterable = iterableC;
            ArrayList arrayList3 = new ArrayList(p.W(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(new r0(((m0) it.next()).g()));
            }
            j0.f48443b.getClass();
            arrayList.add(pm.f.q(j0.f48444c, eVarD, arrayList3));
        }
        return xj.n.N0(arrayList);
    }

    @Override // pm.b, pm.n0
    public final zk.g e() {
        return this.f53876c;
    }

    @Override // pm.n0
    public final boolean g() {
        return true;
    }

    @Override // pm.n0
    public final List getParameters() {
        return this.f53876c.f53884k;
    }

    @Override // pm.h
    public final k0 h() {
        return k0.f54972c;
    }

    @Override // pm.b
    /* JADX INFO: renamed from: m */
    public final zk.e e() {
        return this.f53876c;
    }

    public final String toString() {
        return this.f53876c.toString();
    }
}

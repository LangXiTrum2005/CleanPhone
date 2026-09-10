package wk;

import cl.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import pm.y;
import pm.y0;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f53389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f53390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f53391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f53392d;

    static {
        p[] pVarArrValues = p.values();
        ArrayList arrayList = new ArrayList(pVarArrValues.length);
        for (p pVar : pVarArrValues) {
            arrayList.add(pVar.f53387b);
        }
        f53389a = xj.n.R0(arrayList);
        o[] oVarArrValues = o.values();
        ArrayList arrayList2 = new ArrayList(oVarArrValues.length);
        for (o oVar : oVarArrValues) {
            arrayList2.add(oVar.f53384a);
        }
        xj.n.R0(arrayList2);
        f53390b = new HashMap();
        f53391c = new HashMap();
        b0.N(new wj.f(o.UBYTEARRAY, yl.f.e("ubyteArrayOf")), new wj.f(o.USHORTARRAY, yl.f.e("ushortArrayOf")), new wj.f(o.UINTARRAY, yl.f.e("uintArrayOf")), new wj.f(o.ULONGARRAY, yl.f.e("ulongArrayOf")));
        p[] pVarArrValues2 = p.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p pVar2 : pVarArrValues2) {
            linkedHashSet.add(pVar2.f53388c.i());
        }
        f53392d = linkedHashSet;
        for (p pVar3 : p.values()) {
            HashMap map = f53390b;
            yl.b bVar = pVar3.f53388c;
            yl.b bVar2 = pVar3.f53386a;
            map.put(bVar, bVar2);
            f53391c.put(bVar2, pVar3.f53388c);
        }
    }

    public static final boolean a(y yVar) {
        zk.g gVarE;
        if (y0.l(yVar) || (gVarE = yVar.P().e()) == null) {
            return false;
        }
        zk.j jVarE = gVarE.e();
        return (jVarE instanceof zk.b0) && kotlin.jvm.internal.n.a(((h0) ((zk.b0) jVarE)).f6518e, m.f53373k) && f53389a.contains(gVarE.getName());
    }
}

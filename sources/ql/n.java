package ql;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m0.s1;
import xj.b0;
import xj.y;
import xj.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49165a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wj.f f49166b = new wj.f("V", null);

    public n(s1 s1Var, String str) {
    }

    public final void a(String type, d... dVarArr) {
        o oVar;
        kotlin.jvm.internal.n.f(type, "type");
        if (dVarArr.length == 0) {
            oVar = null;
        } else {
            xj.m mVar = new xj.m(new f.q(dVarArr, 6), 1);
            int iO = b0.O(xj.p.W(mVar, 10));
            if (iO < 16) {
                iO = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
            Iterator it = mVar.iterator();
            while (true) {
                z zVar = (z) it;
                if (!zVar.f53872b.hasNext()) {
                    break;
                }
                y yVar = (y) zVar.next();
                linkedHashMap.put(Integer.valueOf(yVar.f53869a), (d) yVar.f53870b);
            }
            oVar = new o(linkedHashMap);
        }
        this.f49165a.add(new wj.f(type, oVar));
    }

    public final void b(gm.c type) {
        kotlin.jvm.internal.n.f(type, "type");
        String strD = type.d();
        kotlin.jvm.internal.n.e(strD, "type.desc");
        this.f49166b = new wj.f(strD, null);
    }

    public final void c(String type, d... dVarArr) {
        kotlin.jvm.internal.n.f(type, "type");
        xj.m mVar = new xj.m(new f.q(dVarArr, 6), 1);
        int iO = b0.O(xj.p.W(mVar, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        Iterator it = mVar.iterator();
        while (true) {
            z zVar = (z) it;
            if (!zVar.f53872b.hasNext()) {
                this.f49166b = new wj.f(type, new o(linkedHashMap));
                return;
            } else {
                y yVar = (y) zVar.next();
                linkedHashMap.put(Integer.valueOf(yVar.f53869a), (d) yVar.f53870b);
            }
        }
    }
}

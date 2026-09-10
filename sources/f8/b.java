package f8;

import an.h;
import cc.a2;
import j1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40690b;

    public b(Map map) {
        this.f40689a = map;
        Object obj = map.get("containsPathModified");
        n.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
        this.f40690b = ((Boolean) obj).booleanValue();
    }

    @Override // cc.a2
    public final String B(int i10, ArrayList arrayList, boolean z10) {
        Object obj = this.f40689a.get("where");
        n.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        String strJ = f.J(i10);
        if (h.T0(str).toString().length() == 0) {
            return z10 ? defpackage.e.n("AND ", strJ) : strJ;
        }
        return (!z10 || h.T0(str).toString().length() <= 0) ? defpackage.e.o("( ", str, " )") : defpackage.e.o("AND ( ", str, " )");
    }

    @Override // cc.a2
    public final String E() {
        Object obj = this.f40689a.get("orderBy");
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return xj.n.u0(list, ",", null, null, new bh.a(4), 30);
    }

    @Override // cc.a2
    public final boolean q() {
        return this.f40690b;
    }
}

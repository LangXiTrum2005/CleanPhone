package wk;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import pm.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f53307b;

    public /* synthetic */ f(h hVar, int i10) {
        this.f53306a = i10;
        this.f53307b = hVar;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10 = this.f53306a;
        h hVar = this.f53307b;
        switch (i10) {
            case 0:
                return Arrays.asList(hVar.k().F(m.f53373k), hVar.k().F(m.f53374m), hVar.k().F(m.f53375n), hVar.k().F(m.l));
            default:
                EnumMap enumMap = new EnumMap(j.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (j jVar : j.values()) {
                    String strB = jVar.f53326a.b();
                    if (strB == null) {
                        h.a(46);
                        throw null;
                    }
                    c0 c0VarG = hVar.j(strB).g();
                    if (c0VarG == null) {
                        h.a(47);
                        throw null;
                    }
                    String strB2 = jVar.f53327b.b();
                    if (strB2 == null) {
                        h.a(46);
                        throw null;
                    }
                    c0 c0VarG2 = hVar.j(strB2).g();
                    if (c0VarG2 == null) {
                        h.a(47);
                        throw null;
                    }
                    enumMap.put(jVar, c0VarG2);
                    map.put(c0VarG, c0VarG2);
                    map2.put(c0VarG2, c0VarG);
                }
                return new g(enumMap, map, map2);
        }
    }
}

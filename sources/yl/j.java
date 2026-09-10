package yl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xj.b0;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    static {
        new c("java.lang").c(f.e("annotation"));
    }

    public static final b a(String str) {
        c cVar = i.f54524a;
        return new b(i.f54524a, f.e(str));
    }

    public static final b b(String str) {
        c cVar = i.f54524a;
        return new b(i.f54526c, f.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iO = b0.O(p.W(setEntrySet, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iO);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final b d(f fVar) {
        c cVar = i.f54524a;
        b bVar = i.f54531h;
        return new b(bVar.g(), f.e(fVar.c().concat(bVar.i().c())));
    }

    public static final b e(String str) {
        c cVar = i.f54524a;
        return new b(i.f54525b, f.e(str));
    }

    public static final b f(b bVar) {
        c cVar = i.f54524a;
        return new b(i.f54524a, f.e("U".concat(bVar.i().c())));
    }
}

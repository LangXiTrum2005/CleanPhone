package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R5 f27122a = new R5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27123b = "ext_";

    private R5() {
    }

    public final Map<String, String> a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return xj.w.f53867a;
        }
        int iO = xj.b0.O(xj.p.W(setKeySet, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (String str : setKeySet) {
            String strN = defpackage.e.n(f27123b, str);
            Object obj = bundle.get(str);
            linkedHashMap.put(strN, obj instanceof Iterable ? xj.n.u0((Iterable) obj, ", ", null, null, null, 62) : obj == null ? null : obj.toString());
        }
        return linkedHashMap;
    }
}

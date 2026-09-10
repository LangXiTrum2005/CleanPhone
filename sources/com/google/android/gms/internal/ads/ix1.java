package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 extends ex1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15869b = 0;

    static {
        hx1.a(Collections.EMPTY_MAP);
    }

    public static wv0 a(int i10) {
        return new wv0(i10);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.f14102a;
        LinkedHashMap linkedHashMapI = gc1.i(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapI.put(entry.getKey(), ((kx1) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapI);
    }
}

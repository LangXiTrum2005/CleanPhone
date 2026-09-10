package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f14356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14358e;

    public fb(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f14354a = i10;
        this.f14355b = bArr;
        this.f14356c = map;
        this.f14357d = list == null ? null : Collections.unmodifiableList(list);
        this.f14358e = z10;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new bb((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public fb(int i10, byte[] bArr, boolean z10, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bb bbVar = (bb) it.next();
                treeMap.put(bbVar.f12707a, bbVar.f12708b);
            }
        }
        this(i10, bArr, treeMap, list, z10);
    }
}

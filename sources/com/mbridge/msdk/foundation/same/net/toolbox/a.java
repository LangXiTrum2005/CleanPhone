package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f33832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f33833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f33834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33835d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f33835d = i10;
        this.f33832a = bArr;
        this.f33834c = map;
        if (list == null) {
            this.f33833b = null;
        } else {
            this.f33833b = Collections.unmodifiableList(list);
        }
    }
}

package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f36961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f36962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f36963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36965f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
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

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f36960a = i10;
        this.f36961b = bArr;
        this.f36962c = map;
        if (list == null) {
            this.f36963d = null;
        } else {
            this.f36963d = Collections.unmodifiableList(list);
        }
        this.f36964e = z10;
        this.f36965f = j10;
    }
}

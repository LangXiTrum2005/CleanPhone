package com.smartdigimkt.n0;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f36914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f36915c;
    public final List<com.smartdigimkt.k0.c> d;

    public c(int i2, byte[] bArr, List<com.smartdigimkt.k0.c> list) {
        this(i2, bArr, a(list), list);
    }

    private static Map<String, String> a(List<com.smartdigimkt.k0.c> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.smartdigimkt.k0.c cVar : list) {
            treeMap.put(cVar.a(), cVar.b());
        }
        return treeMap;
    }

    private c(int i2, byte[] bArr, Map<String, String> map, List<com.smartdigimkt.k0.c> list) {
        this.f36913a = i2;
        this.f36914b = bArr;
        this.f36915c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
    }
}

package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0972z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f12128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12129b;

    public C0972z(Map map, List list) {
        this.f12128a = map;
        this.f12129b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof C0972z;
    }

    public List b() {
        return this.f12129b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0972z)) {
            return false;
        }
        C0972z c0972z = (C0972z) obj;
        if (!c0972z.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = c0972z.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = c0972z.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f12128a;
    }
}

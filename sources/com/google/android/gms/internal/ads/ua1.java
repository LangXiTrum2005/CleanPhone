package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 extends k91 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f20713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f20714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient u81 f20715f;

    public ua1(Map map, u81 u81Var) {
        ps1.v(map.isEmpty());
        this.f20713d = map;
        this.f20715f = u81Var;
    }

    @Override // com.google.android.gms.internal.ads.k91
    public final Collection d() {
        return new j91(0, this);
    }

    @Override // com.google.android.gms.internal.ads.k91
    public final Map g() {
        Map map = this.f20713d;
        if (map instanceof NavigableMap) {
            return new c91(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new f91(this, (SortedMap) map) : new z81(this, map);
    }

    public final void j() {
        Map map = this.f20713d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f20714e = 0;
    }
}

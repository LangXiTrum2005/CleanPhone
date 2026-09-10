package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cn<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f646a;
    final int b;
    private final LinkedHashMap<K, V> c;
    private int d;
    private int e;
    private int f;

    public cn(int i) {
        this.b = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("maxSize=", i, " <= 0").toString());
        }
        this.c = new LinkedHashMap<K, V>(i, 0.75f, true) { // from class: com.efs.sdk.memleaksdk.monitor.internal.cn.1
            public Set a() {
                return super.entrySet();
            }

            public Set b() {
                return super.keySet();
            }

            public Collection c() {
                return super.values();
            }

            public int d() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<Map.Entry<K, V>> entrySet() {
                return a();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Set<K> keySet() {
                return b();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                int size = size();
                cn cnVar = cn.this;
                if (size <= cnVar.b) {
                    return false;
                }
                cnVar.f646a++;
                return true;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final int size() {
                return d();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final Collection<V> values() {
                return c();
            }
        };
    }

    public final V a(K k) {
        V v = this.c.get(k);
        if (v != null) {
            this.e++;
            return v;
        }
        this.f++;
        return null;
    }

    public String toString() {
        int i = this.e;
        int i2 = this.f + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Arrays.copyOf(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)}, 4));
    }

    public final V a(K k, V v) {
        this.d++;
        return this.c.put(k, v);
    }
}

package com.thinkup.core.common.res;

import com.p004ironsource.d9;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class n<K, V> {
    private int m;
    private int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42366n;
    private final LinkedHashMap<K, V> o;
    private int o0;
    private int om;
    private int on;
    private int oo;

    public n(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f42366n = i2;
        this.o = new LinkedHashMap<>(0, 0.75f, true);
    }

    private static V m() {
        return null;
    }

    private synchronized int m0() {
        return this.o0;
    }

    private synchronized Map<K, V> mm() {
        return new LinkedHashMap(this.o);
    }

    private void mn() {
        K key;
        V value;
        synchronized (this.o) {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.m < 0 || (this.o.isEmpty() && this.m != 0)) {
                            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                        }
                        if (this.m != 0) {
                            Map.Entry<K, V> next = this.o.entrySet().size() > 0 ? this.o.entrySet().iterator().next() : null;
                            if (next != null) {
                                key = next.getKey();
                                value = next.getValue();
                                this.o.remove(key);
                                this.m -= n(key, value);
                                this.om++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o(true, key, value, null);
            }
            this.o.clear();
        }
    }

    private synchronized int mo() {
        return this.om;
    }

    private int n(K k, V v) {
        int iO = o(k, v);
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException("Negative size: " + k + d9.i.f24747b + v);
    }

    private synchronized int o0() {
        return this.f42366n;
    }

    private synchronized int om() {
        return this.m0;
    }

    private synchronized int on() {
        return this.oo;
    }

    private synchronized int oo() {
        return this.on;
    }

    public int o(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        try {
            i2 = this.on;
            i3 = this.m0 + i2;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f42366n), Integer.valueOf(this.on), Integer.valueOf(this.m0), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    public final V m(K k, V v) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.o0++;
                this.m += n(k, v);
                vPut = this.o.put(k, v);
                if (vPut != null) {
                    this.m -= n(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            o(false, k, vPut, v);
        }
        m(this.f42366n);
        return vPut;
    }

    public void o(boolean z2, K k, V v, V v2) {
    }

    private synchronized int n() {
        return this.m;
    }

    private void o(int i2) {
        if (i2 > 0) {
            synchronized (this) {
                this.f42366n = i2;
            }
            m(i2);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V o(K k) {
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.o.get(k);
                    if (v != null) {
                        this.on++;
                        return v;
                    }
                    this.m0++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    private void m(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.m < 0 || (this.o.isEmpty() && this.m != 0)) {
                        break;
                    }
                    if (this.m <= i2) {
                        return;
                    }
                    Map.Entry<K, V> next = this.o.entrySet().size() > 0 ? this.o.entrySet().iterator().next() : null;
                    if (next == null) {
                        return;
                    }
                    key = next.getKey();
                    value = next.getValue();
                    this.o.remove(key);
                    this.m -= n(key, value);
                    this.om++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            o(true, key, value, null);
        }
        this.m = 0;
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + this.m + ", map.isEmpty(): " + this.o.isEmpty());
    }

    public final void o() {
        m(-1);
    }

    private V m(K k) {
        V vRemove;
        if (k != null) {
            synchronized (this) {
                try {
                    vRemove = this.o.remove(k);
                    if (vRemove != null) {
                        this.m -= n(k, vRemove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vRemove != null) {
                o(false, k, vRemove, null);
            }
            return vRemove;
        }
        throw new NullPointerException("key == null");
    }
}

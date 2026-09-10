package com.smartdigimkt.d7;

import com.p004ironsource.d9;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f34491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34493c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34494e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34495h;

    public c(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f34493c = i2;
        this.f34491a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public V a(K k) {
        return null;
    }

    public final V b(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.f34491a.get(k);
                if (v != null) {
                    this.g++;
                    return v;
                }
                this.f34495h++;
                V vA = a(k);
                if (vA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f34494e++;
                        vPut = this.f34491a.put(k, vA);
                        if (vPut != null) {
                            this.f34491a.put(k, vPut);
                        } else {
                            this.f34492b += b(k, vA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    a(false, k, vA, vPut);
                    return vPut;
                }
                b(this.f34493c);
                return vA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c(K k, V v) {
        return 1;
    }

    public final synchronized int d() {
        return this.f;
    }

    public final synchronized int e() {
        return this.g;
    }

    public final synchronized int f() {
        return this.f34493c;
    }

    public final synchronized int g() {
        return this.f34495h;
    }

    public final synchronized int h() {
        return this.d;
    }

    public final synchronized int i() {
        return this.f34492b;
    }

    public final synchronized Map<K, V> j() {
        return new LinkedHashMap(this.f34491a);
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        try {
            i2 = this.g;
            i3 = this.f34495h + i2;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f34493c), Integer.valueOf(this.g), Integer.valueOf(this.f34495h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    public void a(boolean z2, K k, V v, V v2) {
    }

    public final V c(K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                vRemove = this.f34491a.remove(k);
                if (vRemove != null) {
                    this.f34492b -= b(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            a(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void a(int i2) {
        if (i2 > 0) {
            synchronized (this) {
                this.f34493c = i2;
            }
            b(i2);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.d++;
                    this.f34492b += b(k, v);
                    vPut = this.f34491a.put(k, v);
                    if (vPut != null) {
                        this.f34492b -= b(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vPut != null) {
                a(false, k, vPut, v);
            }
            b(this.f34493c);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final void c() {
        b(-1);
    }

    private void b(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f34492b < 0 || (this.f34491a.isEmpty() && this.f34492b != 0)) {
                        break;
                    }
                    if (this.f34492b <= i2) {
                        return;
                    }
                    Map.Entry<K, V> next = this.f34491a.entrySet().size() > 0 ? this.f34491a.entrySet().iterator().next() : null;
                    if (next == null) {
                        return;
                    }
                    key = next.getKey();
                    value = next.getValue();
                    this.f34491a.remove(key);
                    this.f34492b -= b(key, value);
                    this.f++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            a(true, key, value, null);
        }
        this.f34492b = 0;
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + this.f34492b + ", map.isEmpty(): " + this.f34491a.isEmpty());
    }

    public void a() {
        K key;
        V value;
        synchronized (this.f34491a) {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f34492b < 0 || (this.f34491a.isEmpty() && this.f34492b != 0)) {
                            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                        }
                        if (this.f34492b != 0) {
                            Map.Entry<K, V> next = this.f34491a.entrySet().size() > 0 ? this.f34491a.entrySet().iterator().next() : null;
                            if (next != null) {
                                key = next.getKey();
                                value = next.getValue();
                                this.f34491a.remove(key);
                                this.f34492b -= b(key, value);
                                this.f++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a(true, key, value, null);
            }
            this.f34491a.clear();
        }
    }

    private int b(K k, V v) {
        int iC = c(k, v);
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException("Negative size: " + k + d9.i.f24747b + v);
    }

    public final synchronized int b() {
        return this.f34494e;
    }
}

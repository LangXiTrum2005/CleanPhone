package com.bytedance.adsdk.LD;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class STP<K, V> {
    private int JXs;
    private int LD;
    private final LinkedHashMap<K, V> Lxb;
    private int OY;
    private int ZU;
    private int ebl;
    private int lc;
    private int lk;

    public STP(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.lk = i;
        this.Lxb = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int lk(K k, V v) {
        int iLD = LD(k, v);
        if (iLD >= 0) {
            return iLD;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public int LD(K k, V v) {
        return 1;
    }

    public final V Lxb(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.Lxb.get(k);
                if (v != null) {
                    this.ebl++;
                    return v;
                }
                this.OY++;
                V vLD = LD(k);
                if (vLD == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.JXs++;
                        vPut = this.Lxb.put(k, vLD);
                        if (vPut != null) {
                            this.Lxb.put(k, vPut);
                        } else {
                            this.LD += lk(k, vLD);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                Lxb(this.lk);
                return vLD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.ebl;
            int i3 = this.OY + i2;
            i = i3 != 0 ? (i2 * 100) / i3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.lk + ",hits=" + this.ebl + ",misses=" + this.OY + ",hitRate=" + i + "%]";
    }

    public V LD(K k) {
        return null;
    }

    public final V Lxb(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.ZU++;
                    this.LD += lk(k, v);
                    vPut = this.Lxb.put(k, v);
                    if (vPut != null) {
                        this.LD -= lk(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Lxb(this.lk);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void Lxb(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.LD < 0 || (this.Lxb.isEmpty() && this.LD != 0)) {
                        break;
                    }
                    if (this.LD > i && !this.Lxb.isEmpty()) {
                        Map.Entry<K, V> next = this.Lxb.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.Lxb.remove(key);
                        this.LD -= lk(key, value);
                        this.lc++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}

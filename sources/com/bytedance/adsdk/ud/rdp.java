package com.bytedance.adsdk.ud;

import com.p004ironsource.d9;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rdp<K, V> {
    private int jpc;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final LinkedHashMap<K, V> qdl;
    private int ud;
    private int wd;

    public rdp(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.lnr = i2;
        this.qdl = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int lnr(K k, V v) {
        int iUd = ud(k, v);
        if (iUd >= 0) {
            return iUd;
        }
        throw new IllegalStateException("Negative size: " + k + d9.i.f24747b + v);
    }

    public final V qdl(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.qdl.get(k);
                if (v != null) {
                    this.wd++;
                    return v;
                }
                this.jpc++;
                V vUd = ud(k);
                if (vUd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.mzz++;
                        vPut = this.qdl.put(k, vUd);
                        if (vPut != null) {
                            this.qdl.put(k, vPut);
                        } else {
                            this.ud += lnr(k, vUd);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                qdl(this.lnr);
                return vUd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        int i2;
        try {
            int i3 = this.wd;
            int i4 = this.jpc + i3;
            i2 = i4 != 0 ? (i3 * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.lnr + ",hits=" + this.wd + ",misses=" + this.jpc + ",hitRate=" + i2 + "%]";
    }

    public int ud(K k, V v) {
        return 1;
    }

    public V ud(K k) {
        return null;
    }

    public final V qdl(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.mml++;
                    this.ud += lnr(k, v);
                    vPut = this.qdl.put(k, v);
                    if (vPut != null) {
                        this.ud -= lnr(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qdl(this.lnr);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void qdl(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.ud < 0 || (this.qdl.isEmpty() && this.ud != 0)) {
                        break;
                    }
                    if (this.ud > i2 && !this.qdl.isEmpty()) {
                        Map.Entry<K, V> next = this.qdl.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.qdl.remove(key);
                        this.ud -= lnr(key, value);
                        this.mo++;
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

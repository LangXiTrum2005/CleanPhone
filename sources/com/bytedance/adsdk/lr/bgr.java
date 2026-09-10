package com.bytedance.adsdk.lr;

import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class bgr<K, V> {
    private int di;
    private int fi;
    private int ik;
    private int ka;
    private int lr;
    private int mj;
    private final LinkedHashMap<K, V> ri;
    private int xha;

    public bgr(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.ik = i;
        this.ri = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int ik(K k, V v) {
        int iLr = lr(k, v);
        if (iLr >= 0) {
            return iLr;
        }
        throw new IllegalStateException("Negative size: " + k + X3.j.b + v);
    }

    public int lr(K k, V v) {
        return 1;
    }

    public final V ri(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.ri.get(k);
                if (v != null) {
                    this.xha++;
                    return v;
                }
                this.mj++;
                V vLr = lr(k);
                if (vLr == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.fi++;
                        vPut = this.ri.put(k, vLr);
                        if (vPut != null) {
                            this.ri.put(k, vPut);
                        } else {
                            this.lr += ik(k, vLr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                ri(this.ik);
                return vLr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.xha;
            i2 = this.mj + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.ik), Integer.valueOf(this.xha), Integer.valueOf(this.mj), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public V lr(K k) {
        return null;
    }

    public final V ri(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.ka++;
                    this.lr += ik(k, v);
                    vPut = this.ri.put(k, v);
                    if (vPut != null) {
                        this.lr -= ik(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ri(this.ik);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void ri(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.lr < 0 || (this.ri.isEmpty() && this.lr != 0)) {
                        break;
                    }
                    if (this.lr > i && !this.ri.isEmpty()) {
                        Map.Entry<K, V> next = this.ri.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.ri.remove(key);
                        this.lr -= ik(key, value);
                        this.di++;
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

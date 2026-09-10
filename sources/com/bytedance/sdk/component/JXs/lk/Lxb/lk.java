package com.bytedance.sdk.component.JXs.lk.Lxb;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lk<K, V> {
    private int JXs;
    private int LD;
    private final LinkedHashMap<K, SoftReference<V>> Lxb;
    private int OY;
    private int ZU;
    private int ebl;
    private int lc;
    private int lk;

    public lk(int i) {
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
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.Lxb.get(k);
                if (softReference != null) {
                    v = softReference.get();
                    if (v != null) {
                        this.ebl++;
                        return v;
                    }
                    this.Lxb.remove(k);
                } else {
                    v = null;
                }
                this.OY++;
                V vLD = LD(k);
                if (vLD == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.JXs++;
                        SoftReference<V> softReferencePut = this.Lxb.put(k, new SoftReference<>(vLD));
                        if (softReferencePut != null) {
                            v = softReferencePut.get();
                        }
                        if (v != null) {
                            this.Lxb.put(k, softReferencePut);
                        } else {
                            this.LD += lk(k, vLD);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v != null) {
                    return v;
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
        int i2;
        try {
            i = this.ebl;
            i2 = this.OY + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.lk), Integer.valueOf(this.ebl), Integer.valueOf(this.OY), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public V LD(K k) {
        return null;
    }

    public final V Lxb(K k, V v) {
        V v2;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.ZU++;
                    this.LD += lk(k, v);
                    SoftReference<V> softReferencePut = this.Lxb.put(k, new SoftReference<>(v));
                    if (softReferencePut != null) {
                        v2 = softReferencePut.get();
                        if (v2 != null) {
                            this.LD -= lk(k, v2);
                        }
                    } else {
                        v2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Lxb(this.lk);
            return v2;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void Lxb(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.LD < 0 || (this.Lxb.isEmpty() && this.LD != 0)) {
                        break;
                        break;
                    }
                    if (this.LD <= i) {
                        return;
                    }
                    Map.Entry<K, SoftReference<V>> next = this.Lxb.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    K key = next.getKey();
                    SoftReference<V> value = next.getValue();
                    this.Lxb.remove(key);
                    if (value != null) {
                        this.LD -= lk(key, value.get());
                    }
                    this.lc++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.LD = 0;
        this.Lxb.clear();
    }
}

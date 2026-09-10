package com.bytedance.sdk.component.mzz.lnr.qdl;

import android.util.Log;
import com.p004ironsource.d9;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lnr<K, V> {
    private int jpc;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final LinkedHashMap<K, SoftReference<V>> qdl;
    private int ud;
    private int wd;

    public lnr(int i2) {
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
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.qdl.get(k);
                if (softReference != null) {
                    v = softReference.get();
                    if (v != null) {
                        this.wd++;
                        return v;
                    }
                    this.qdl.remove(k);
                } else {
                    v = null;
                }
                this.jpc++;
                V vUd = ud(k);
                if (vUd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.mzz++;
                        SoftReference<V> softReferencePut = this.qdl.put(k, new SoftReference<>(vUd));
                        if (softReferencePut != null) {
                            v = softReferencePut.get();
                        }
                        if (v != null) {
                            this.qdl.put(k, softReferencePut);
                        } else {
                            this.ud += lnr(k, vUd);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (v != null) {
                    return v;
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
        int i3;
        try {
            i2 = this.wd;
            i3 = this.jpc + i2;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.lnr), Integer.valueOf(this.wd), Integer.valueOf(this.jpc), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    public int ud(K k, V v) {
        return 1;
    }

    public V ud(K k) {
        return null;
    }

    public final V qdl(K k, V v) {
        V v2;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.mml++;
                    this.ud += lnr(k, v);
                    SoftReference<V> softReferencePut = this.qdl.put(k, new SoftReference<>(v));
                    if (softReferencePut != null) {
                        v2 = softReferencePut.get();
                        if (v2 != null) {
                            this.ud -= lnr(k, v2);
                        }
                    } else {
                        v2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qdl(this.lnr);
            return v2;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void qdl(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.ud < 0 || (this.qdl.isEmpty() && this.ud != 0)) {
                        break;
                        break;
                    }
                    if (this.ud <= i2) {
                        return;
                    }
                    Map.Entry<K, SoftReference<V>> next = this.qdl.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    K key = next.getKey();
                    SoftReference<V> value = next.getValue();
                    this.qdl.remove(key);
                    if (value != null) {
                        this.ud -= lnr(key, value.get());
                    }
                    this.mo++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.ud + ", maxSize: " + i2);
        this.ud = 0;
        this.qdl.clear();
    }
}

package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f31774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31776c;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f31775b = i10;
        this.f31774a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f31774a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f31775b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f31774a.remove(str);
                if (bVarRemove != null) {
                    this.f31776c -= b(str, bVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f31776c += b(str, bVar);
                    b bVarPut = this.f31774a.put(str, bVar);
                    if (bVarPut != null) {
                        this.f31776c -= b(str, bVarPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f31775b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f31776c < 0 || (this.f31774a.isEmpty() && this.f31776c != 0)) {
                        break;
                    }
                    if (this.f31776c > i10 && !this.f31774a.isEmpty()) {
                        Map.Entry<String, b> next = this.f31774a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f31774a.remove(key);
                            this.f31776c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f31774a.keySet());
        }
        return hashSet;
    }
}

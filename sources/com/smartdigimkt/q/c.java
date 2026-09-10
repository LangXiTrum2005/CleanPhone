package com.smartdigimkt.q;

import com.smartdigimkt.c0.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c implements e<String, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f37755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37757c;

    public c(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f37756b = i2;
        this.f37755a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f37755a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.c0.e
    public void clear() {
        a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f37756b));
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void remove(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f37755a.remove(str);
                if (bVarRemove != null) {
                    this.f37757c -= b(str, bVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean put(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f37757c += b(str, bVar);
                    b bVarPut = this.f37755a.put(str, bVar);
                    if (bVarPut != null) {
                        this.f37757c -= b(str, bVarPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f37756b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f37757c < 0 || (this.f37755a.isEmpty() && this.f37757c != 0)) {
                        break;
                    }
                    if (this.f37757c > i2 && !this.f37755a.isEmpty()) {
                        Map.Entry<String, b> next = this.f37755a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f37755a.remove(key);
                            this.f37757c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    @Override // com.smartdigimkt.c0.e
    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f37755a.keySet());
        }
        return hashSet;
    }
}

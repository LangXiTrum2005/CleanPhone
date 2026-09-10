package com.smartdigimkt.c0;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d implements e<String, JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f34021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34023c;

    public d(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f34022b = i2;
        this.f34021a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject get(String str) {
        JSONObject jSONObject;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            jSONObject = this.f34021a.get(str);
        }
        return jSONObject;
    }

    @Override // com.smartdigimkt.c0.e
    public void clear() {
        a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f34022b));
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void remove(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                JSONObject jSONObjectRemove = this.f34021a.remove(str);
                if (jSONObjectRemove != null) {
                    this.f34023c -= b(str, jSONObjectRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.c0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean put(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                try {
                    this.f34023c += b(str, jSONObject);
                    JSONObject jSONObjectPut = this.f34021a.put(str, jSONObject);
                    if (jSONObjectPut != null) {
                        this.f34023c -= b(str, jSONObjectPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f34022b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f34023c < 0 || (this.f34021a.isEmpty() && this.f34023c != 0)) {
                        break;
                    }
                    if (this.f34023c > i2 && !this.f34021a.isEmpty()) {
                        Map.Entry<String, JSONObject> next = this.f34021a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f34021a.remove(key);
                            this.f34023c -= iB;
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
            hashSet = new HashSet(this.f34021a.keySet());
        }
        return hashSet;
    }
}

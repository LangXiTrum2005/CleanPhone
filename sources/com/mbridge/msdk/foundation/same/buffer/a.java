package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f33742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33744c;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f33743b = i10;
        this.f33742a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f33744c += b(str, jSONObject);
                JSONObject jSONObjectPut = this.f33742a.put(str, jSONObject);
                if (jSONObjectPut != null) {
                    this.f33744c -= b(str, jSONObjectPut);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(this.f33743b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f33743b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f33742a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f33742a.keySet());
        }
        return hashSet;
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f33744c < 0 || (this.f33742a.isEmpty() && this.f33744c != 0)) {
                        break;
                    }
                    if (this.f33744c > i10 && !this.f33742a.isEmpty()) {
                        Map.Entry<String, JSONObject> next = this.f33742a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f33742a.remove(key);
                            this.f33744c -= iB;
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
}

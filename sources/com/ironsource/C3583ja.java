package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3583ja {
    private static C3583ja c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    public static synchronized C3583ja b() {
        try {
            if (c == null) {
                c = new C3583ja();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0462ma {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C0462ma f29256c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f29257a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f29258b = new ConcurrentHashMap<>();

    public static synchronized C0462ma b() {
        try {
            if (f29256c == null) {
                f29256c = new C0462ma();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29256c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f29257a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f29258b;
    }

    public void d() {
        synchronized (this) {
            this.f29257a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29257a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29257a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f29258b.put(str, list);
    }
}

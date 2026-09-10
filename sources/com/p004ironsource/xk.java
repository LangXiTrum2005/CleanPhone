package com.p004ironsource;

import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class xk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static xk f27723c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f27724a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f27725b = new ConcurrentHashMap<>();

    public static synchronized xk b() {
        try {
            if (f27723c == null) {
                f27723c = new xk();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27723c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f27724a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f27725b;
    }

    public void d() {
        synchronized (this) {
            this.f27724a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27724a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27724a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f27725b.put(str, list);
    }
}

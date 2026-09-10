package com.smartdigimkt.m3;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36614b = "h";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile h f36615c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, com.smartdigimkt.v3.g> f36616a = new ConcurrentHashMap<>();

    private h() {
    }

    public static h a() {
        if (f36615c == null) {
            synchronized (h.class) {
                try {
                    if (f36615c == null) {
                        f36615c = new h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36615c;
    }

    public void a(int i2, String str, com.smartdigimkt.v3.g gVar) {
        this.f36616a.put(i2 + str, gVar);
    }

    public com.smartdigimkt.v3.g a(int i2, String str) {
        return this.f36616a.get(i2 + str);
    }
}

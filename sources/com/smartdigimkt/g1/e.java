package com.smartdigimkt.g1;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35395b = "RewardUnitCacheManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.smartdigimkt.f3.d> f35396a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f35397a = new e();

        private b() {
        }
    }

    public static e a() {
        return b.f35397a;
    }

    private e() {
        this.f35396a = new ConcurrentHashMap<>();
    }

    public void a(String str, String str2, com.smartdigimkt.f3.d dVar) {
        try {
            String str3 = str + "_" + str2;
            if (dVar != null && this.f35396a.containsKey(str3)) {
                this.f35396a.remove(str3);
            }
            this.f35396a.put(str3, dVar);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public com.smartdigimkt.f3.d a(String str, String str2) {
        try {
            try {
                return this.f35396a.remove(str + "_" + str2);
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}

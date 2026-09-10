package com.ironsource;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements Q, Q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f27196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, P> f27197b;

    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Q
    public P a(String adId) {
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f27196a.readLock().lock();
        try {
            return this.f27197b.get(adId);
        } finally {
            this.f27196a.readLock().unlock();
        }
    }

    public T(ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.n.f(readWriteLock, "readWriteLock");
        this.f27196a = readWriteLock;
        this.f27197b = new LinkedHashMap();
    }

    @Override // com.ironsource.Q
    public List<P> a() {
        this.f27196a.readLock().lock();
        List<P> listN0 = xj.n.N0(this.f27197b.values());
        this.f27196a.readLock().unlock();
        return listN0;
    }

    public /* synthetic */ T(ReadWriteLock readWriteLock, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q.a
    public void a(P adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f27196a.writeLock().lock();
        try {
            if (this.f27197b.get(adInfo.c()) == null) {
                this.f27197b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f27196a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(JSONObject json, EnumC0488o0 adStatus, String adId) {
        kotlin.jvm.internal.n.f(json, "json");
        kotlin.jvm.internal.n.f(adStatus, "adStatus");
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f27196a.writeLock().lock();
        try {
            P p10 = this.f27197b.get(adId);
            if (p10 == null) {
                return;
            }
            String bundleId = json.optString("bundleId");
            kotlin.jvm.internal.n.e(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                p10.a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            kotlin.jvm.internal.n.e(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                p10.a(S7.f27174b.a(dynamicDemandSourceId));
            }
            p10.a(adStatus);
        } finally {
            this.f27196a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(EnumC0488o0 adStatus, String adId) {
        kotlin.jvm.internal.n.f(adStatus, "adStatus");
        kotlin.jvm.internal.n.f(adId, "adId");
        this.f27196a.writeLock().lock();
        try {
            P p10 = this.f27197b.get(adId);
            if (p10 == null) {
                return;
            }
            p10.a(adStatus);
            p10.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f27196a.writeLock().unlock();
        }
    }
}

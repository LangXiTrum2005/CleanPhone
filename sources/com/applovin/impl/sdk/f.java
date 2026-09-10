package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9422b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9424d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9425e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9423c = new Object();

    public f(l lVar) {
        this.f9421a = lVar;
        this.f9422b = lVar.Q();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f9424d.put(uVar, new r());
            this.f9425e.put(uVar, new r());
        }
    }

    private r c(com.applovin.impl.u uVar) {
        synchronized (this.f9423c) {
            try {
                r rVarB = b(uVar);
                if (rVarB.b() > 0) {
                    return rVarB;
                }
                return d(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private r d(com.applovin.impl.u uVar) {
        r rVar;
        synchronized (this.f9423c) {
            try {
                rVar = (r) this.f9424d.get(uVar);
                if (rVar == null) {
                    rVar = new r();
                    this.f9424d.put(uVar, rVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9423c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (p.a()) {
                    this.f9422b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9423c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f9423c) {
            try {
                r rVarD = d(uVar);
                if (rVarD.b() > 0) {
                    b(uVar).a(rVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f9421a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            if (p.a()) {
                this.f9422b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
                return cVar;
            }
        } else if (p.a()) {
            this.f9422b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f9423c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    private r b(com.applovin.impl.u uVar) {
        r rVar;
        synchronized (this.f9423c) {
            try {
                rVar = (r) this.f9425e.get(uVar);
                if (rVar == null) {
                    rVar = new r();
                    this.f9425e.put(uVar, rVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f9423c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}

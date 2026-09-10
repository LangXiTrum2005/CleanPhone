package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class v1 implements com.applovin.impl.sdk.a.InterfaceC0015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9880b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9881c = new Object();

    public v1(com.applovin.impl.sdk.l lVar) {
        this.f9879a = lVar;
    }

    public void a(e3 e3Var) {
        if (y3.b(e3Var)) {
            if (!this.f9879a.f().a(e3Var, this)) {
                this.f9879a.Z().destroyAd(e3Var);
                return;
            }
            synchronized (this.f9881c) {
                try {
                    String adUnitId = e3Var.getAdUnitId();
                    List arrayList = (List) this.f9880b.get(adUnitId);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f9880b.put(adUnitId, arrayList);
                    }
                    double dH = e3Var.H();
                    int i10 = 0;
                    while (i10 < arrayList.size() && dH <= ((e3) arrayList.get(i10)).H()) {
                        i10++;
                    }
                    arrayList.add(i10, e3Var);
                    if (arrayList.size() > ((Integer) this.f9879a.a(t3.L8)).intValue()) {
                        e3 e3Var2 = (e3) arrayList.remove(arrayList.size() - 1);
                        this.f9879a.f().a(e3Var2);
                        this.f9879a.Z().destroyAd(e3Var2);
                        this.f9879a.R().a(f2.J0, e3Var2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void b(e3 e3Var) {
        synchronized (this.f9881c) {
            try {
                List list = (List) this.f9880b.get(e3Var.getAdUnitId());
                if (CollectionUtils.isEmpty(list)) {
                    return;
                }
                list.remove(e3Var);
                this.f9879a.f().a(e3Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0015a
    public void onAdExpired(u1 u1Var) {
        e3 e3Var = (e3) u1Var;
        this.f9879a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f9879a.Q().a("FailoverAdCacheManager", "Failover ad expired for ad unit: " + e3Var.getAdUnitId() + ". Removing from cache");
        }
        b(e3Var);
        this.f9879a.Z().destroyAd(e3Var);
        this.f9879a.R().a(f2.I0, e3Var);
    }

    public e3 a(String str) {
        synchronized (this.f9881c) {
            try {
                List list = (List) this.f9880b.get(str);
                if (CollectionUtils.isEmpty(list)) {
                    return null;
                }
                return (e3) list.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

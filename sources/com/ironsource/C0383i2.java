package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0383i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0649x0 f28838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f28839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f28840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StringBuilder f28841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B f28842e;

    public C0383i2(AbstractC0649x0 adUnitData) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f28838a = adUnitData;
        this.f28839b = new HashMap();
        this.f28840c = new ArrayList();
        this.f28841d = new StringBuilder();
    }

    public final Map<String, Object> a() {
        return this.f28839b;
    }

    public final List<String> b() {
        return this.f28840c;
    }

    public final B c() {
        return this.f28842e;
    }

    public final StringBuilder d() {
        return this.f28841d;
    }

    public final boolean e() {
        return (this.f28842e == null && this.f28839b.isEmpty() && this.f28840c.isEmpty()) ? false : true;
    }

    public final void a(B b10) {
        this.f28842e = b10;
        if (b10 != null) {
            StringBuilder sb2 = this.f28841d;
            sb2.append(b10.r());
            sb2.append(b10.p());
            sb2.append(",");
        }
    }

    public final void a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        List<String> list = this.f28840c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb2 = this.f28841d;
        sb2.append(providerSettings.getInstanceType(this.f28838a.b().a()));
        sb2.append(providerSettings.getProviderInstanceName());
        sb2.append(",");
    }

    public final void a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f28838a.b().a()), biddingData);
    }

    public final void a(C0598u3 biddingResponse) {
        kotlin.jvm.internal.n.f(biddingResponse, "biddingResponse");
        String strC = biddingResponse.c();
        kotlin.jvm.internal.n.e(strC, "biddingResponse.instanceName");
        int iD = biddingResponse.d();
        Map<String, Object> mapA = biddingResponse.a();
        kotlin.jvm.internal.n.e(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f28839b.put(str, map);
        StringBuilder sb2 = this.f28841d;
        sb2.append(i10);
        sb2.append(str);
        sb2.append(",");
    }
}

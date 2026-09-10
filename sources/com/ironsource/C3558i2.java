package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3558i2 {
    private final AbstractC3816x0 a;
    private final Map<String, Object> b;
    private final List<String> c;
    private final StringBuilder d;

    public C3558i2(AbstractC3816x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adUnitData;
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new StringBuilder();
    }

    public final Map<String, Object> a() {
        return this.b;
    }

    public final List<String> b() {
        return this.c;
    }

    public final StringBuilder c() {
        return this.d;
    }

    public final boolean d() {
        return (this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.d;
        sb.append(providerSettings.getInstanceType(this.a.b().a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(",");
    }

    public final void a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.a.b().a()), biddingData);
    }

    public final void a(C3768u3 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String strC = biddingResponse.c();
        Intrinsics.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
        int iD = biddingResponse.d();
        Map<String, Object> mapA = biddingResponse.a();
        Intrinsics.checkNotNullExpressionValue(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    private final void a(String str, int i, Map<String, ? extends Object> map) {
        this.b.put(str, map);
        StringBuilder sb = this.d;
        sb.append(i);
        sb.append(str);
        sb.append(",");
    }
}

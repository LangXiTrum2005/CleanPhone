package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/hp;", "Lcom/ironsource/hx;", "Lcom/ironsource/ix;", "waterfallFetcherListener", "Lcom/ironsource/j5;", "auctionData", "Lcom/ironsource/c0;", "adInstanceFactory", "", "a", "", "Lcom/ironsource/m5;", "d", "", "", "Lcom/ironsource/g0;", "c", "b", "", "auctionTrial", IronSourceConstants.AUCTION_FALLBACK, "auctionId", "Lcom/ironsource/u2;", "e", "Lcom/ironsource/u2;", "tools", "Lcom/ironsource/u1;", f.j, "Lcom/ironsource/u1;", "adUnitData", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/u1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hp extends hx {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u2 tools;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final u1 adUnitData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(u2 tools, u1 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.f(tools, "tools");
        Intrinsics.f(adUnitData, "adUnitData");
        this.tools = tools;
        this.adUnitData = adUnitData;
    }

    private final j5 b() {
        return new j5("", new JSONObject(), null, 0, "");
    }

    private final Map<String, C3357g0> c() {
        jv testSuiteLoadAdConfig = this.adUnitData.getAdProperties().getTestSuiteLoadAdConfig();
        List<NetworkSettings> listM = this.adUnitData.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (testSuiteLoadAdConfig == null || testSuiteLoadAdConfig.a(networkSettings, this.adUnitData.getAdProperties().getAdFormat())) {
                if (!networkSettings.isBidder(this.adUnitData.getAdProperties().getAdFormat())) {
                    arrayList.add(obj);
                }
            }
        }
        int iH = MapsKt.h(CollectionsKt.n(arrayList, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (NetworkSettings networkSettings2 : arrayList) {
            linkedHashMap.put(networkSettings2.getProviderInstanceName(), new C3357g0(this.tools, this.adUnitData, networkSettings2));
        }
        return linkedHashMap;
    }

    private final List<m5> d() {
        jv testSuiteLoadAdConfig = this.adUnitData.getAdProperties().getTestSuiteLoadAdConfig();
        List<NetworkSettings> listM = this.adUnitData.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (testSuiteLoadAdConfig == null || testSuiteLoadAdConfig.a(networkSettings, this.adUnitData.getAdProperties().getAdFormat())) {
                if (!networkSettings.isBidder(this.adUnitData.getAdProperties().getAdFormat())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m5(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.p004ironsource.hx
    public void a(InterfaceC3348c0 adInstanceFactory, ix waterfallFetcherListener) {
        Intrinsics.f(adInstanceFactory, "adInstanceFactory");
        Intrinsics.f(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(m1.a(this.tools, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(ix waterfallFetcherListener, int auctionTrial, String auctionFallback, String auctionId, InterfaceC3348c0 adInstanceFactory) {
        Intrinsics.f(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.f(auctionFallback, "auctionFallback");
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new j5(auctionId, new JSONObject(), null, auctionTrial, auctionFallback), adInstanceFactory);
    }

    private final void a(ix waterfallFetcherListener, j5 auctionData, InterfaceC3348c0 adInstanceFactory) {
        IronLog.INTERNAL.verbose(m1.a(this.tools, (String) null, (String) null, 3, (Object) null));
        waterfallFetcherListener.a(a(d(), c(), auctionData, adInstanceFactory));
    }
}

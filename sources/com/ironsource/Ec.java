package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ec extends Ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V0 f26015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0649x0 f26016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(V0 tools, AbstractC0649x0 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f26015e = tools;
        this.f26016f = adUnitData;
    }

    private final C0472n2 d() {
        return new C0472n2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, I> e() {
        Tf tfG = this.f26016f.b().g();
        List<NetworkSettings> listM = this.f26016f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (tfG == null || tfG.a(networkSettings, this.f26016f.b().a())) {
                if (!networkSettings.isBidder(this.f26016f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        int iO = xj.b0.O(xj.p.W(arrayList, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (NetworkSettings networkSettings2 : arrayList) {
            linkedHashMap.put(networkSettings2.getProviderInstanceName(), new I(this.f26015e, this.f26016f, networkSettings2));
        }
        return linkedHashMap;
    }

    private final List<C0526q2> f() {
        Tf tfG = this.f26016f.b().g();
        List<NetworkSettings> listM = this.f26016f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (tfG == null || tfG.a(networkSettings, this.f26016f.b().a())) {
                if (!networkSettings.isBidder(this.f26016f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0526q2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Ng
    public void a(E adInstanceFactory, Og waterfallFetcherListener) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f26015e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, d(), adInstanceFactory);
    }

    public final void a(Og waterfallFetcherListener, int i10, String auctionFallback, String auctionId, E adInstanceFactory) {
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.n.f(auctionId, "auctionId");
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C0472n2(auctionId, new JSONObject(), null, i10, auctionFallback), adInstanceFactory);
    }

    private final void a(Og og2, C0472n2 c0472n2, E e10) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f26015e, (String) null, (String) null, 3, (Object) null));
        og2.a(Ng.a(this, f(), e(), c0472n2, e10, null, 16, null));
    }
}

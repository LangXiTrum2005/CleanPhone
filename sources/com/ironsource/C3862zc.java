package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3862zc extends ug {
    private final V0 e;
    private final AbstractC3816x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3862zc(V0 tools, AbstractC3816x0 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = tools;
        this.f = adUnitData;
    }

    private final C3647n2 b() {
        return new C3647n2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, I> c() {
        Df dfG = this.f.b().g();
        List<NetworkSettings> listM = this.f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (dfG == null || dfG.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(p002kotlin.collections.polder.marial(p002kotlin.collections.dovishness.gintrap(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pairAttabal = patroclinal.formularize.attabal(networkSettings2.getProviderInstanceName(), new I(this.e, this.f, networkSettings2));
            linkedHashMap.put(pairAttabal.getFirst(), pairAttabal.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C3700q2> d() {
        Df dfG = this.f.b().g();
        List<NetworkSettings> listM = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (dfG == null || dfG.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3700q2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.ug
    public void a(E adInstanceFactory, vg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C3681p0.a(this.e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(vg waterfallFetcherListener, int i, String auctionFallback, String auctionId, E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C3647n2(auctionId, new JSONObject(), null, i, auctionFallback), adInstanceFactory);
    }

    private final void a(vg vgVar, C3647n2 c3647n2, E e) {
        IronLog.INTERNAL.verbose(C3681p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        vgVar.a(a(d(), c(), c3647n2, e));
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f27156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0649x0 f27157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, I> f27158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0383i2 f27159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<CallableC0527q3> f27160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27161f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0580t3 f27162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S1 f27163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0580t3.b f27164d;

        public a(C0580t3 c0580t3, S1 s10, C0580t3.b bVar) {
            this.f27162b = c0580t3;
            this.f27163c = s10;
            this.f27164d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            this.f27162b.a(this.f27163c.e(), this.f27164d, this.f27163c.f27157b.f(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements C0580t3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f27167b;

        public c(d dVar) {
            this.f27167b = dVar;
        }

        @Override // com.ironsource.C0580t3.b
        public void a(final List<? extends C0598u3> biddingDataList, final long j10, final List<String> reachedTimeout) {
            kotlin.jvm.internal.n.f(biddingDataList, "biddingDataList");
            kotlin.jvm.internal.n.f(reachedTimeout, "reachedTimeout");
            V0 v4 = S1.this.f27156a;
            final S1 s10 = S1.this;
            final d dVar = this.f27167b;
            v4.c(new Runnable() { // from class: com.ironsource.xh
                @Override // java.lang.Runnable
                public final void run() {
                    S1.c.a(s10, j10, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C0580t3.b
        public void onFailure(String error) {
            kotlin.jvm.internal.n.f(error, "error");
            S1.this.f27156a.c(new ph(S1.this, error, this.f27167b, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 this$0, long j10, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(biddingDataList, "$biddingDataList");
            kotlin.jvm.internal.n.f(reachedTimeout, "$reachedTimeout");
            kotlin.jvm.internal.n.f(biddingDataListener, "$biddingDataListener");
            this$0.a(j10, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 this$0, String error, d biddingDataListener) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(error, "$error");
            kotlin.jvm.internal.n.f(biddingDataListener, "$biddingDataListener");
            this$0.f27156a.d().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(S1 s10);

        void a(S1 s10, String str);
    }

    public S1(V0 adTools, AbstractC0649x0 adUnitData, C0404j6 c0404j6) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f27156a = adTools;
        this.f27157b = adUnitData;
        this.f27158c = a();
        this.f27159d = new C0383i2(adUnitData);
        this.f27160e = new ArrayList();
        this.f27161f = adUnitData.e().q();
        b bVarB = b();
        Tf tfG = adUnitData.b().g();
        boolean z10 = Kb.f26413u.d().h().w() && (adUnitData.b().a() == IronSource.a.INTERSTITIAL || adUnitData.b().a() == IronSource.a.REWARDED_VIDEO);
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (tfG == null || tfG.a(networkSettings, this.f27157b.b().a())) {
                AdData adDataA = this.f27157b.a(networkSettings);
                if (networkSettings.isBidder(this.f27157b.b().a())) {
                    Object objB = this.f27161f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof InterfaceC0562s3) {
                        this.f27160e.add(new CallableC0527q3(networkSettings.getInstanceType(this.f27157b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC0562s3) objB, bVarB, networkSettings));
                    } else {
                        this.f27156a.d().h().g(objB == null ? defpackage.e.n("prepareAuctionCandidates - could not load network adapter ", networkSettings.getProviderName()) : defpackage.e.o("network adapter ", networkSettings.getProviderName(), " does not implementing BiddingDataInterface"));
                    }
                } else if (!z10) {
                    this.f27159d.a(networkSettings);
                }
            }
        }
        this.f27159d.a(c0404j6);
    }

    public final Map<String, I> c() {
        return this.f27158c;
    }

    public final C0383i2 d() {
        return this.f27159d;
    }

    public final List<CallableC0527q3> e() {
        return this.f27160e;
    }

    public final boolean f() {
        return !this.f27160e.isEmpty();
    }

    public final boolean g() {
        return this.f27159d.e();
    }

    public final boolean h() {
        return this.f27161f;
    }

    private final b b() {
        return new b();
    }

    private final C0580t3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        I i10 = this.f27158c.get(str);
        if (i10 != null) {
            return i10.b();
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0544r3 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC0544r3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA;
            if (S1.this.h()) {
                adapterBaseInterfaceA = null;
                BaseAdAdapter baseAdAdapterB = S1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = S1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                S1.this.f27156a.d().g().b(S1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.ironsource.InterfaceC0544r3
        public void a(String str) {
            S1.this.f27156a.d().h().g(str);
        }
    }

    private final Map<String, I> a() {
        List<NetworkSettings> listM = this.f27157b.m();
        int iO = xj.b0.O(xj.p.W(listM, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            I i10 = new I(this.f27156a, this.f27157b, (NetworkSettings) it.next());
            linkedHashMap.put(i10.c(), i10);
        }
        return linkedHashMap;
    }

    public final void a(d biddingDataListener) {
        kotlin.jvm.internal.n.f(biddingDataListener, "biddingDataListener");
        C0580t3 c0580t3 = new C0580t3();
        C0580t3.b bVarB = b(biddingDataListener);
        this.f27156a.d().g().a(this.f27157b.f());
        this.f27156a.a((AbstractRunnableC0430ke) new a(c0580t3, this, bVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends C0598u3> list, List<String> list2, d dVar) {
        this.f27156a.d().g().b(j10);
        for (C0598u3 c0598u3 : list) {
            String strC = c0598u3.c();
            kotlin.jvm.internal.n.e(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (c0598u3.a() != null) {
                this.f27159d.a(c0598u3);
                this.f27156a.d().g().a(mapA, c0598u3.e());
            } else {
                this.f27156a.d().g().a(mapA, c0598u3.e(), c0598u3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f27156a.d().g().b(a(it.next()), j10);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.f27157b.a(str);
        if (this.f27161f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e10);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f27157b.b().a())) : null);
        return map;
    }

    public /* synthetic */ S1(V0 v4, AbstractC0649x0 abstractC0649x0, C0404j6 c0404j6, int i10, kotlin.jvm.internal.g gVar) {
        this(v4, abstractC0649x0, (i10 & 4) != 0 ? null : c0404j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f27157b.b().a(), this.f27157b.b().b());
    }
}

package com.p004ironsource;

import com.applovin.impl.H0;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0006\u0018\u00002\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b5\u00106J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J4\u0010\u0005\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J*\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u001c\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u0005\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u00104\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ironsource/p4;", "", "", "", "Lcom/ironsource/g0;", "a", "com/ironsource/p4$b", "b", "()Lcom/ironsource/p4$b;", "Lcom/ironsource/p4$d;", "biddingDataListener", "Lcom/ironsource/b8$b;", "", "duration", "", "Lcom/ironsource/c8;", "biddingDataList", "reachedTimeout", "", "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "networkAdapter", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "", g.f40227p, f.j, "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/u1;", "Lcom/ironsource/u1;", "adUnitData", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "adInstancePayloads", "Lcom/ironsource/e5;", "d", "Lcom/ironsource/e5;", "()Lcom/ironsource/e5;", "auctionRequestData", "", "Lcom/ironsource/y7;", "e", "Ljava/util/List;", "()Ljava/util/List;", "callableList", "Z", h.f36614b, "()Z", "isTokenPerAdapter", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/u1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C3357g0> adInstancePayloads;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e5 auctionRequestData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<y7> callableList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isTokenPerAdapter;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/p4$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b8 f26434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p4 f26435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b8.b f26436c;

        public a(b8 b8Var, p4 p4Var, b8.b bVar) {
            this.f26434a = b8Var;
            this.f26435b = p4Var;
            this.f26436c = bVar;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f26434a.a(this.f26435b.e(), this.f26436c, this.f26435b.adUnitData.getCollectBiddingDataTimeout(), TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/p4$b", "Lcom/ironsource/z7;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "", "a", "", PglCryptUtils.KEY_MESSAGE, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements z7 {
        public b() {
        }

        @Override // com.p004ironsource.z7
        public void a(NetworkSettings providerSettings) {
            AdapterBaseInterface adapterBaseInterfaceA;
            if (p4.this.getIsTokenPerAdapter()) {
                adapterBaseInterfaceA = null;
                BaseAdAdapter baseAdAdapterB = p4.this.b(providerSettings != null ? providerSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = p4.this.a(providerSettings);
            }
            if (adapterBaseInterfaceA != null) {
                p4.this.adTools.getEventSender().getToken().a(p4.this.a(providerSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.p004ironsource.z7
        public void a(String message) {
            p4.this.adTools.getEventSender().getTroubleshoot().g(message);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"com/ironsource/p4$c", "Lcom/ironsource/b8$b;", "", "Lcom/ironsource/c8;", "biddingDataList", "", "duration", "", "reachedTimeout", "", "a", "error", "onFailure", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements b8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f26439b;

        public c(d dVar) {
            this.f26439b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p4 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.f(this$0, "this$0");
            Intrinsics.f(biddingDataList, "$biddingDataList");
            Intrinsics.f(reachedTimeout, "$reachedTimeout");
            Intrinsics.f(biddingDataListener, "$biddingDataListener");
            this$0.a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        @Override // com.ironsource.b8.b
        public void onFailure(String error) {
            Intrinsics.f(error, "error");
            p4.this.adTools.a(new H0(p4.this, error, this.f26439b, 20));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p4 this$0, String error, d biddingDataListener) {
            Intrinsics.f(this$0, "this$0");
            Intrinsics.f(error, "$error");
            Intrinsics.f(biddingDataListener, "$biddingDataListener");
            this$0.adTools.getEventSender().getToken().a(error);
            biddingDataListener.a(this$0, error);
        }

        @Override // com.ironsource.b8.b
        public void a(final List<? extends c8> biddingDataList, final long duration, final List<String> reachedTimeout) {
            Intrinsics.f(biddingDataList, "biddingDataList");
            Intrinsics.f(reachedTimeout, "reachedTimeout");
            u2 u2Var = p4.this.adTools;
            final p4 p4Var = p4.this;
            final d dVar = this.f26439b;
            u2Var.a(new Runnable() { // from class: com.ironsource.Y
                @Override // java.lang.Runnable
                public final void run() {
                    List list = reachedTimeout;
                    p4.c.a(p4Var, duration, biddingDataList, list, dVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/p4$d;", "", "Lcom/ironsource/p4;", a4.f, "", "a", "", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(p4 auction);

        void a(p4 auction, String error);
    }

    public p4(u2 adTools, u1 adUnitData) {
        StringBuilder sb;
        String providerName;
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        this.adTools = adTools;
        this.adUnitData = adUnitData;
        this.adInstancePayloads = a();
        this.auctionRequestData = new e5(adUnitData);
        this.callableList = new ArrayList();
        this.isTokenPerAdapter = adUnitData.getAuctionSettings().q();
        b bVarB = b();
        jv jvVarG = adUnitData.getAdProperties().getTestSuiteLoadAdConfig();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (jvVarG == null || jvVarG.a(networkSettings, this.adUnitData.getAdProperties().getAdFormat())) {
                AdData adDataA = this.adUnitData.a(networkSettings);
                if (networkSettings.isBidder(this.adUnitData.getAdProperties().getAdFormat())) {
                    Object objB = this.isTokenPerAdapter ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof a8) {
                        this.callableList.add(new y7(networkSettings.getInstanceType(this.adUnitData.getAdProperties().getAdFormat()), networkSettings.getProviderInstanceName(), adDataA, (a8) objB, bVarB, networkSettings));
                    } else {
                        if (objB == null) {
                            sb = new StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                            providerName = networkSettings.getProviderName();
                        } else {
                            sb = new StringBuilder("network adapter ");
                            sb.append(networkSettings.getProviderName());
                            providerName = " does not implementing BiddingDataInterface";
                        }
                        sb.append(providerName);
                        this.adTools.getEventSender().getTroubleshoot().g(sb.toString());
                    }
                } else {
                    this.auctionRequestData.a(networkSettings);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings providerSettings) {
        return com.p004ironsource.mediationsdk.c.b().b(providerSettings, this.adUnitData.getAdProperties().getAdFormat(), this.adUnitData.getAdProperties().getCom.ironsource.sdk.controller.f.b.c java.lang.String());
    }

    private final b8.b b(d biddingDataListener) {
        return new c(biddingDataListener);
    }

    public final Map<String, C3357g0> c() {
        return this.adInstancePayloads;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e5 getAuctionRequestData() {
        return this.auctionRequestData;
    }

    public final List<y7> e() {
        return this.callableList;
    }

    public final boolean f() {
        return !this.callableList.isEmpty();
    }

    public final boolean g() {
        return this.auctionRequestData.d();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsTokenPerAdapter() {
        return this.isTokenPerAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String instanceName) {
        C3357g0 c3357g0 = this.adInstancePayloads.get(instanceName);
        if (c3357g0 != null) {
            return c3357g0.b();
        }
        return null;
    }

    private final b b() {
        return new b();
    }

    private final Map<String, C3357g0> a() {
        List<NetworkSettings> listM = this.adUnitData.m();
        int iH = MapsKt.h(CollectionsKt.n(listM, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            C3357g0 c3357g0 = new C3357g0(this.adTools, this.adUnitData, (NetworkSettings) it.next());
            linkedHashMap.put(c3357g0.c(), c3357g0);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings providerSettings, AdapterBaseInterface networkAdapter) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (providerSettings != null) {
            try {
                providerDefaultInstance = providerSettings.getProviderDefaultInstance();
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                StringBuilder sb = new StringBuilder("getProviderEventData ");
                sb.append(providerSettings != null ? providerSettings.getProviderDefaultInstance() : null);
                logger.logException(ironSourceTag, sb.toString(), e2);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, networkAdapter != null ? networkAdapter.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkAdapter != null ? networkAdapter.getNetworkSDKVersion() : null);
        map.put("spId", providerSettings != null ? providerSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", providerSettings != null ? Integer.valueOf(providerSettings.getInstanceType(this.adUnitData.getAdProperties().getAdFormat())) : null);
        return map;
    }

    private final Map<String, Object> a(String instanceName) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.adUnitData.a(instanceName);
        if (this.isTokenPerAdapter) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(instanceName);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long duration, List<? extends c8> biddingDataList, List<String> reachedTimeout, d biddingDataListener) {
        this.adTools.getEventSender().getToken().a(duration);
        for (c8 c8Var : biddingDataList) {
            String strC = c8Var.c();
            Intrinsics.e(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (c8Var.a() != null) {
                this.auctionRequestData.a(c8Var);
                this.adTools.getEventSender().getToken().a(mapA, c8Var.e());
            } else {
                this.adTools.getEventSender().getToken().a(mapA, c8Var.e(), c8Var.b());
            }
        }
        Iterator<String> it = reachedTimeout.iterator();
        while (it.hasNext()) {
            this.adTools.getEventSender().getToken().b(a(it.next()), duration);
        }
        biddingDataListener.a(this);
    }

    public final void a(d biddingDataListener) {
        Intrinsics.f(biddingDataListener, "biddingDataListener");
        b8 b8Var = new b8();
        b8.b bVarB = b(biddingDataListener);
        this.adTools.getEventSender().getToken().a();
        this.adTools.c((ks) new a(b8Var, this, bVarB));
    }
}

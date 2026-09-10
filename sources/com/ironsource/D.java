package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f25910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f25911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f25912c;

    public D(V0 adTools, C instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        this.f25910a = adTools;
        this.f25911b = instanceData;
        this.f25912c = baseAdAdapter;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        String adapterVersion;
        kotlin.jvm.internal.n.f(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f25912c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.n.c(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            kotlin.jvm.internal.n.e(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f25912c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.n.c(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.n.c(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(C0506p0.a(this.f25910a, defpackage.e.n("could not get adapter version for event data ", this.f25911b.x()), (String) null, 2, (Object) null));
        }
        String strI = this.f25911b.k().i();
        kotlin.jvm.internal.n.e(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.f25911b.k().a();
        kotlin.jvm.internal.n.e(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.f25911b.t()));
        String serverData = this.f25911b.o().k();
        V0 v4 = this.f25910a;
        kotlin.jvm.internal.n.e(serverData, "serverData");
        String strE = v4.e(serverData);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.f25911b.w()));
        if (!TextUtils.isEmpty(this.f25911b.v().getCustomNetwork())) {
            String customNetwork = this.f25911b.v().getCustomNetwork();
            kotlin.jvm.internal.n.e(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}

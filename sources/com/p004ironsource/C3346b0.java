package com.p004ironsource;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0010\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/b0;", "Lcom/ironsource/b2;", "Lcom/ironsource/z1;", "event", "", "", "", "a", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/a0;", "b", "Lcom/ironsource/a0;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "c", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", ne.E1, "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/a0;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3346b0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3344a0 instanceData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BaseAdAdapter<?, ?> adapter;

    public C3346b0(u2 adTools, C3344a0 instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(instanceData, "instanceData");
        this.adTools = adTools;
        this.instanceData = instanceData;
        this.adapter = baseAdAdapter;
    }

    @Override // com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        String adapterVersion;
        Intrinsics.f(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.adapter;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.c(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            Intrinsics.e(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.adapter;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.c(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.c(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e2) {
            StringBuilder sbO = a.o(e2, "could not get adapter version for event data ");
            sbO.append(this.instanceData.getCom.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE java.lang.String());
            IronLog.INTERNAL.error(m1.a(this.adTools, sbO.toString(), (String) null, 2, (Object) null));
        }
        String strI = this.instanceData.j().i();
        Intrinsics.e(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.instanceData.j().a();
        Intrinsics.e(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.instanceData.getInstanceType()));
        String serverData = this.instanceData.n().k();
        u2 u2Var = this.adTools;
        Intrinsics.e(serverData, "serverData");
        String strE = u2Var.e(serverData);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.instanceData.v()));
        if (!TextUtils.isEmpty(this.instanceData.u().getCustomNetwork())) {
            String customNetwork = this.instanceData.u().getCustomNetwork();
            Intrinsics.e(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}

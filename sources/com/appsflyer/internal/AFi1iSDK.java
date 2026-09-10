package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.ironsource.L6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1iSDK implements AFi1kSDK {
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.5", null, 4, null);

    @Override // com.appsflyer.internal.AFi1kSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        Map<String, Object> mapKowloon = p002kotlin.collections.seminary.kowloon(patroclinal.formularize.attabal(L6.H, this.getMediationNetwork.getPlugin().getPluginName()), patroclinal.formularize.attabal("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            mapKowloon.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, this.getMediationNetwork.getAdditionalParams());
        }
        return mapKowloon;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMediationNetwork = pluginInfo;
    }
}

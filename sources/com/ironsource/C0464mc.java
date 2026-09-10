package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;

/* JADX INFO: renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0464mc implements InterfaceC0446lc {
    @Override // com.ironsource.InterfaceC0446lc
    public void a(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
        }
    }
}

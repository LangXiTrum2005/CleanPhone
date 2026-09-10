package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3550hc implements InterfaceC3532gc {
    @Override // com.ironsource.InterfaceC3532gc
    public void a(H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}

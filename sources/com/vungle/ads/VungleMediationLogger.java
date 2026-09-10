package com.vungle.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleMediationLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "()V", "logError", "", "ad", "Lcom/vungle/ads/VungleAdType;", PglCryptUtils.KEY_MESSAGE, "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleMediationLogger {
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    private VungleMediationLogger() {
    }

    public static final void logError(VungleAdType ad, String message) throws InterruptedException {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk$SDKError.Reason.MEDIATION_ERROR, message, ad != null ? yemenite.getAdLogEntry(ad) : null);
    }
}

package com.vungle.ads;

import com.vungle.ads.internal.util.LogEntry;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: VungleMediationLogger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/VungleAdType;", "Lcom/vungle/ads/internal/util/kowloon;", "getAdLogEntry", "(Lcom/vungle/ads/VungleAdType;)Lcom/vungle/ads/internal/util/kowloon;", "adLogEntry", "vungle-ads_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class yemenite {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LogEntry getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof BaseAd) {
            return ((BaseAd) vungleAdType).getLogEntry();
        }
        if (vungleAdType instanceof VungleBannerView) {
            return ((VungleBannerView) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}

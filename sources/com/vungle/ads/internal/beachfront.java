package com.vungle.ads.internal;

import android.content.Context;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterstitialAdInternal.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/beachfront;", "Lcom/vungle/ads/internal/dern;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lmonacal/impromptu;", "placement", "", "isValidAdTypeForPlacement", "(Lmonacal/impromptu;)Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class beachfront extends dern {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}

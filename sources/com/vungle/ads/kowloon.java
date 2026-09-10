package com.vungle.ads;

import android.content.Context;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterstitialAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/kowloon;", "Lcom/vungle/ads/BaseFullscreenAd;", "Landroid/content/Context;", "context", "", "placementId", "Lcom/vungle/ads/saneness;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/saneness;)V", "Lcom/vungle/ads/internal/beachfront;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/beachfront;", "constructAdInternal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class kowloon extends BaseFullscreenAd {
    public /* synthetic */ kowloon(Context context, String str, saneness sanenessVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new saneness() : sanenessVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kowloon(Context context, String placementId, saneness adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.beachfront constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.beachfront(context);
    }
}

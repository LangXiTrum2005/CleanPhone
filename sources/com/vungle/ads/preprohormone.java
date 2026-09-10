package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/preprohormone;", "Lcom/vungle/ads/BaseFullscreenAd;", "Landroid/content/Context;", "context", "", "placementId", "Lcom/vungle/ads/saneness;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/saneness;)V", "Lcom/vungle/ads/internal/impromptu;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/impromptu;", "constructAdInternal", "userId", "", "setUserId", "(Ljava/lang/String;)V", "titleText", "setAlertTitleText", "bodyText", "setAlertBodyText", "closeButtonText", "setAlertCloseButtonText", "continueButtonText", "setAlertContinueButtonText", "getRewardedAdInternal", "()Lcom/vungle/ads/internal/impromptu;", "rewardedAdInternal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class preprohormone extends BaseFullscreenAd {
    public /* synthetic */ preprohormone(Context context, String str, saneness sanenessVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new saneness() : sanenessVar);
    }

    private final com.vungle.ads.internal.impromptu getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.competently(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (com.vungle.ads.internal.impromptu) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(String bodyText) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public preprohormone(Context context, String placementId, saneness adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.impromptu constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.impromptu(context);
    }
}

package com.vungle.ads.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.internal.presenter.formularize;
import com.vungle.ads.internal.ui.AdActivity;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RewardedAdInternal.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u001f¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/impromptu;", "Lcom/vungle/ads/internal/dern;", "Lcom/vungle/ads/internal/presenter/formularize;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getUserId", "()Ljava/lang/String;", "getAlertTitleText", "getAlertBodyText", "getAlertCloseButtonText", "getAlertContinueButtonText", "Lmonacal/impromptu;", "placement", "", "isValidAdTypeForPlacement", "(Lmonacal/impromptu;)Z", "Lcom/vungle/ads/internal/presenter/saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmonacal/attabal;", "advertisement", "", "renderAd$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/saneness;Lmonacal/attabal;)V", "renderAd", "alertTitleText", "Ljava/lang/String;", "getAlertTitleText$vungle_ads_release", "setAlertTitleText$vungle_ads_release", "(Ljava/lang/String;)V", "alertBodyText", "getAlertBodyText$vungle_ads_release", "setAlertBodyText$vungle_ads_release", "alertCloseButtonText", "getAlertCloseButtonText$vungle_ads_release", "setAlertCloseButtonText$vungle_ads_release", "alertContinueButtonText", "getAlertContinueButtonText$vungle_ads_release", "setAlertContinueButtonText$vungle_ads_release", "userId", "getUserId$vungle_ads_release", "setUserId$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class impromptu extends dern implements formularize {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public impromptu(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.formularize
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.formularize
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.formularize
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.formularize
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.formularize
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.saneness listener, monacal.attabal advertisement) throws Throwable {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        AdActivity.INSTANCE.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(listener, advertisement);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}

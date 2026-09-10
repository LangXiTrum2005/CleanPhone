package com.vungle.ads.internal;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.preprohormone;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BannerAdImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/attabal;", "Lcom/vungle/ads/internal/AdInternal;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/trm;", X3.i.O, "<init>", "(Landroid/content/Context;Lcom/vungle/ads/trm;)V", "Lcom/vungle/ads/internal/presenter/saneness;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/dern;", "wrapCallback$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/saneness;)Lcom/vungle/ads/internal/presenter/dern;", "wrapCallback", "Lmonacal/impromptu;", "placement", "", "isValidAdTypeForPlacement", "(Lmonacal/impromptu;)Z", "isValidAdSize", "(Lcom/vungle/ads/trm;)Z", "getAdSizeForAdRequest", "()Lcom/vungle/ads/trm;", "Lmonacal/attabal;", "advertisement", "", "adLoadedAndUpdateConfigure$vungle_ads_release", "(Lmonacal/attabal;)V", "adLoadedAndUpdateConfigure", "Lcom/vungle/ads/trm;", "updatedAdSize", "getUpdatedAdSize$vungle_ads_release", "setUpdatedAdSize$vungle_ads_release", "(Lcom/vungle/ads/trm;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class attabal extends AdInternal {
    private final VungleAdSize adSize;
    private VungleAdSize updatedAdSize;

    /* JADX INFO: renamed from: com.vungle.ads.internal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerAdImpl.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/vungle/ads/internal/attabal$attabal", "Lcom/vungle/ads/internal/presenter/dern;", "", "id", "", "onAdStart", "(Ljava/lang/String;)V", "onAdEnd", "onAdImpression", "Lcom/vungle/ads/VungleError;", "error", "onFailure", "(Lcom/vungle/ads/VungleError;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class C0556attabal extends com.vungle.ads.internal.presenter.dern {
        final /* synthetic */ attabal this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0556attabal(com.vungle.ads.internal.presenter.saneness sanenessVar, attabal attabalVar) {
            super(sanenessVar);
            this.this$0 = attabalVar;
        }

        @Override // com.vungle.ads.internal.presenter.dern, com.vungle.ads.internal.presenter.saneness
        public void onAdEnd(String id) {
            this.this$0.setAdState(AdInternal.AdState.FINISHED);
            super.onAdEnd(id);
        }

        @Override // com.vungle.ads.internal.presenter.dern, com.vungle.ads.internal.presenter.saneness
        public void onAdImpression(String id) {
            this.this$0.setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
            super.onAdImpression(id);
        }

        @Override // com.vungle.ads.internal.presenter.dern, com.vungle.ads.internal.presenter.saneness
        public void onAdStart(String id) {
            this.this$0.setAdState(AdInternal.AdState.PLAYING);
            super.onAdStart(id);
        }

        @Override // com.vungle.ads.internal.presenter.dern, com.vungle.ads.internal.presenter.saneness
        public void onFailure(VungleError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.this$0.setAdState(AdInternal.AdState.ERROR);
            super.onFailure(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public attabal(Context context, VungleAdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(monacal.attabal advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        LogEntry logEntry = getLogEntry();
        Long adLoadType = logEntry != null ? logEntry.getAdLoadType() : null;
        if ((adLoadType != null && adLoadType.longValue() == 3) || (adLoadType != null && adLoadType.longValue() == 4)) {
            sendWinURL();
        }
        if (this.adSize.getIsAdaptiveWidth() || this.adSize.getIsAdaptiveHeight()) {
            Pair<Integer, Integer> deviceWidthAndHeightWithOrientation = preprohormone.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = deviceWidthAndHeightWithOrientation.component1().intValue();
            int iIntValue2 = deviceWidthAndHeightWithOrientation.component2().intValue();
            int iAdWidth = this.adSize.getIsAdaptiveWidth() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.getIsAdaptiveHeight() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.getIsAdaptiveHeight() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new VungleAdSize(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    /* JADX INFO: renamed from: getAdSizeForAdRequest, reason: from getter */
    public VungleAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: getUpdatedAdSize$vungle_ads_release, reason: from getter */
    public final VungleAdSize getUpdatedAdSize() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize adSize) {
        if (adSize != null) {
            return adSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(VungleAdSize vungleAdSize) {
        this.updatedAdSize = vungleAdSize;
    }

    public final com.vungle.ads.internal.presenter.dern wrapCallback$vungle_ads_release(com.vungle.ads.internal.presenter.saneness adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        return new C0556attabal(adPlayCallback, this);
    }
}

package com.vungle.ads.internal.presenter;

import com.ironsource.If;
import com.vungle.ads.VungleError;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdPlayCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\f\u0010\tJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\r\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/presenter/dern;", "Lcom/vungle/ads/internal/presenter/saneness;", "adPlayCallback", "<init>", "(Lcom/vungle/ads/internal/presenter/saneness;)V", "", "id", "", "onAdClick", "(Ljava/lang/String;)V", "onAdEnd", "onAdImpression", If.k, If.i, "onAdStart", "Lcom/vungle/ads/VungleError;", "error", "onFailure", "(Lcom/vungle/ads/VungleError;)V", "Lcom/vungle/ads/internal/presenter/saneness;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class dern implements saneness {
    private final saneness adPlayCallback;

    public dern(saneness adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdClick(String id) {
        this.adPlayCallback.onAdClick(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdEnd(String id) {
        this.adPlayCallback.onAdEnd(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdImpression(String id) {
        this.adPlayCallback.onAdImpression(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdLeftApplication(String id) {
        this.adPlayCallback.onAdLeftApplication(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdRewarded(String id) {
        this.adPlayCallback.onAdRewarded(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onAdStart(String id) {
        this.adPlayCallback.onAdStart(id);
    }

    @Override // com.vungle.ads.internal.presenter.saneness
    public void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.adPlayCallback.onFailure(error);
    }
}

package com.vungle.ads.internal.presenter;

import com.ironsource.If;
import com.vungle.ads.VungleError;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdPlayCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/presenter/saneness;", "", "", "id", "", "onAdStart", "(Ljava/lang/String;)V", "onAdImpression", "onAdEnd", "onAdClick", If.i, If.k, "Lcom/vungle/ads/VungleError;", "error", "onFailure", "(Lcom/vungle/ads/VungleError;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface saneness {
    void onAdClick(String id);

    void onAdEnd(String id);

    void onAdImpression(String id);

    void onAdLeftApplication(String id);

    void onAdRewarded(String id);

    void onAdStart(String id);

    void onFailure(VungleError error);
}

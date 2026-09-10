package com.vungle.ads.internal.load;

import com.vungle.ads.VungleError;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdLoaderCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/load/attabal;", "", "Lmonacal/attabal;", "advertisement", "", "onSuccess", "(Lmonacal/attabal;)V", "Lcom/vungle/ads/VungleError;", "error", "onFailure", "(Lcom/vungle/ads/VungleError;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface attabal {
    void onFailure(VungleError error);

    void onSuccess(monacal.attabal advertisement);
}

package com.vungle.ads.internal.network;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Ie;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/network/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/vungle/ads/internal/network/attabal;", NotificationCompat.CATEGORY_CALL, "Lcom/vungle/ads/internal/network/marial;", Ie.n, "", "onResponse", "(Lcom/vungle/ads/internal/network/attabal;Lcom/vungle/ads/internal/network/marial;)V", "", "t", "onFailure", "(Lcom/vungle/ads/internal/network/attabal;Ljava/lang/Throwable;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface saneness<T> {
    void onFailure(attabal<T> call, Throwable t);

    void onResponse(attabal<T> call, marial<T> response);
}

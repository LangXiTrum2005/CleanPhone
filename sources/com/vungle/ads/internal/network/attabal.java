package com.vungle.ads.internal.network;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/network/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/vungle/ads/internal/network/marial;", "execute", "()Lcom/vungle/ads/internal/network/marial;", "Lcom/vungle/ads/internal/network/saneness;", "callback", "", "enqueue", "(Lcom/vungle/ads/internal/network/saneness;)V", "cancel", "()V", "", "isCanceled", "()Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface attabal<T> {
    void cancel();

    void enqueue(saneness<T> callback);

    marial<T> execute();

    boolean isCanceled();
}

package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/adultoid;", "Lcom/vungle/ads/cuirassed;", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "", "isLogged", "()Z", "", "markLogged", "()V", "alreadyLogged", "Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class adultoid extends cuirassed {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adultoid(Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    /* JADX INFO: renamed from: isLogged, reason: from getter */
    public final boolean getAlreadyLogged() {
        return this.alreadyLogged;
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }
}
